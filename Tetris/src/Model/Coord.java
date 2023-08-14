package Model;

import java.util.Objects;

public class Coord {
    public final int x;
    public final int y;
    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Coord plus(int sx, int sy) {
        return new Coord(x +sx, y + sy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coord coord = (Coord) o;
        return x == coord.x && y == coord.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
