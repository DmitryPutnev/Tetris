package View;

import Model.Coord;
import Model.Figure;

public class FallingFigure {
    private Figure fallingFigure;
    private Coord positionFallingFigure;
    private boolean fell = false;
    private int tick = 1;
    private Window map;

    public FallingFigure(Window window, int x, int y) {
        map = window;
        fallingFigure = Figure.getRandom();
        int length = fallingFigure.getBot().y - fallingFigure.getTop().y;
        positionFallingFigure = new Coord(x,-length + y);
    }

    public FallingFigure(Window window, int x, int y, Figure figure) {
        map = window;
        fallingFigure = figure;
        int length = fallingFigure.getBot().y - fallingFigure.getTop().y;
        positionFallingFigure = new Coord(x,-length + y);
    }
    public boolean canPlaceFigure() {
        return canMoveFigure(fallingFigure, 0, 1);
    }
    public boolean dropped() {
        return fell;
    }
    private boolean canMoveFigure(Figure figure, int sx, int sy) {
        if (positionFallingFigure.x + sx + figure.getTop().x < 0) return false;
        if (positionFallingFigure.x + sx + figure.getBot().x >= Config.WIDTH) return false;
        if (positionFallingFigure.y + sy + figure.getBot().y >= Config.HEIGHT) return false;
        for (Coord coord : figure.getCells())
            if (map.getBoxColor(positionFallingFigure.x +coord.x + sx, positionFallingFigure.y + coord.y + sy) > 0)
                return false;
        return true;
    }
    public Figure getFallingFigure() {
        return fallingFigure;
    }
    public Coord getPosition() {
        return positionFallingFigure;
    }

    public void moveFigure(int sx, int sy) {
        if (canMoveFigure(fallingFigure, sx, sy))
            positionFallingFigure = positionFallingFigure.plus(sx, sy);
        else if (sy == 1) {
            if (tick > 0) tick--;
            else fell = true;
        }
    }

    public void fastDrop() {
        int step = 0;
        while (canMoveFigure(fallingFigure ,0, step + 1)) step++;
        moveFigure(0, step);
    }

    public void turnFigure() {
        Figure rotated = fallingFigure.turn();
        if (canMoveFigure(rotated, 0, 0))
            fallingFigure = rotated;
        else if (canMoveFigure(rotated, 1, 0)) {
            fallingFigure = rotated;
            moveFigure(1, 0);
        } else if (canMoveFigure(rotated, -1, 0)) {
            fallingFigure = rotated;
            moveFigure(-1, 0);
        } else if (canMoveFigure(rotated, 0, -1)) {
            fallingFigure = rotated;
            moveFigure(0, -1);
        }
    }
}
