package Test;

import Model.Coord;
import org.junit.Assert;
import org.junit.Test;

public class CoordTest {

    @Test
    public void plus() {
        Coord a = new Coord(1, 3);
        Coord b = new Coord(2, 2);

        a = a.plus(3, 1);
        b = b.plus(2, 2);

        Assert.assertEquals(a, b);
    }
}