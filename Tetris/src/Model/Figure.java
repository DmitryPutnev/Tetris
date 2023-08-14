package Model;

import java.util.ArrayList;
import java.util.List;
public enum Figure {
    I1(0, 1,  1, 1,  2, 1,  3, 1),
    I2(1, 0,  1, 1,  1, 2,  1, 3),

    J1(1, 0,  1, 1,  0, 2,  1, 2),
    J2(0, 0,  0, 1,  1, 1,  2, 1),
    J3(1, 0,  2, 0,  1, 1,  1, 2),
    J4(0, 1,  1, 1,  2, 1,  2, 2),

    L1(1, 0,  1, 1,  1, 2,  2, 2),
    L2(0, 1,  1, 1,  2, 1,  0, 2),
    L3(0, 0,  1, 0,  1, 1,  1, 2),
    L4(0, 1,  1, 1,  2, 1,  2, 0),

    O(0, 0,  1, 0,  0, 1,  1, 1),

    S1(1, 1,  2, 1,  0, 2,  1, 2),
    S2(0, 0,  0, 1,  1, 1,  1, 2),

    T1(0, 1,  1, 1,  2, 1,  1, 2),
    T2(1, 0,  0, 1,  1, 1,  1, 2),
    T3(1, 0,  0, 1,  1, 1,  2, 1),
    T4(1, 0,  1, 1,  1, 2,  2, 1),

    Z1(0, 1,  1, 1,  1, 2,  2, 2),
    Z2(2, 0,  1, 1,  2, 1,  1, 2);
    private final List<Coord> cells;
    private final Coord top;
    private final Coord bot;

    Figure(int ... coords) {
        cells = new ArrayList<Coord>();
        for (int i = 0; i < coords.length; i+=2)
            cells.add(new Coord(coords[i], coords[i+1]));
        top = setTop();
        bot = setBot();
    }

    private Coord setTop() {
        int x = cells.get(0).x;
        int y = cells.get(0).y;
        for (Coord coord : cells) {
            if (x > coord.x) x = coord.x;
            if (y > coord.y) y = coord.y;
        }
        return new Coord(x, y);
    }

    public List<Coord> getCells() {
        return cells;
    }

    public Coord getTop() {
        return top;
    }

    public Coord getBot() {
        return bot;
    }

    private Coord setBot() {
        int x = cells.get(0).x;
        int y = cells.get(0).y;
        for (Coord coord : cells) {
            if (x < coord.x) x = coord.x;
            if (y < coord.y) y = coord.y;
        }
        return new Coord(x, y);
    }

    public Figure turn() {
        switch (this) {
            case I1: return I2;
            case I2: return I1;

            case J1: return J2;
            case J2: return J3;
            case J3: return J4;
            case J4: return J1;

            case L1: return L2;
            case L2: return L3;
            case L3: return L4;
            case L4: return L1;

            case S1: return S2;
            case S2: return S1;

            case T1: return T2;
            case T2: return T3;
            case T3: return T4;
            case T4: return T1;

            case Z1: return Z2;
            case Z2: return Z1;

            default: return O;
        }
    }

    public static Figure getRandom() {
        int key = (int)(Math.random() * 7);
        if (key == 0) return I2;
        if (key == 1) return T2;
        if (key == 2) return J1;
        if (key == 3) return S2;
        if (key == 4) return L1;
        if (key == 5) return Z2;
        return O;
    }

    public int getColorFigure() {
        switch (this) {
            case I1: return 3;
            case I2: return 3;

            case J1: return 6;
            case J2: return 6;
            case J3: return 6;
            case J4: return 6;

            case L1: return 5;
            case L2: return 5;
            case L3: return 5;
            case L4: return 5;

            case S1: return 1;
            case S2: return 1;

            case T1: return 7;
            case T2: return 7;
            case T3: return 7;
            case T4: return 7;

            case Z1: return 2;
            case Z2: return 2;

            default: return 4;
        }
    }

    public Figure show() {
        if (this == S2) return S1;
        if (this == Z2) return Z1;
        if (this == J1) return J2;
        if (this == L1) return L2;
        if (this == I2) return I2;
        if (this == O) return O;
        return T3;
    }
}
