package Test;

import Model.Figure;
import org.junit.Assert;
import org.junit.Test;

public class FigureTest {

    @Test
    public void turn() {
        Figure a = Figure.I1;
        Figure b = Figure.I2.turn();
        Assert.assertEquals(b, a);

        a = Figure.J1;
        b = Figure.J4.turn();
        Assert.assertEquals(a, b);

        a = Figure.J3;
        b = Figure.J2.turn();
        Assert.assertEquals(a, b);

        a = Figure.L1;
        b = Figure.L4.turn();
        Assert.assertEquals(a, b);

        a = Figure.L3;
        b = Figure.L2.turn();
        Assert.assertEquals(a, b);

        a = Figure.O;
        b = Figure.O.turn();
        Assert.assertEquals(a, b);

        a = Figure.Z1;
        b = Figure.Z2.turn();
        Assert.assertEquals(a, b);

        a = Figure.S1;
        b = Figure.S2.turn();
        Assert.assertEquals(a, b);
    }

    @Test
    public void getColorFigure() {
        int a = Figure.I1.getColorFigure();
        int b = Figure.I2.getColorFigure();
        Assert.assertEquals(a, b);

        a = Figure.J1.getColorFigure();
        b = Figure.J2.getColorFigure();
        Assert.assertEquals(a, b);

        a = Figure.J3.getColorFigure();
        b = Figure.J4.getColorFigure();
        Assert.assertEquals(a, b);

        a = Figure.L1.getColorFigure();
        b = Figure.L2.getColorFigure();
        Assert.assertEquals(a, b);

        a = Figure.L3.getColorFigure();
        b = Figure.L4.getColorFigure();
        Assert.assertEquals(a, b);

        a = Figure.O.getColorFigure();
        b = Figure.O.getColorFigure();
        Assert.assertEquals(a, b);

        a = Figure.Z1.getColorFigure();
        b = Figure.Z2.getColorFigure();
        Assert.assertEquals(a, b);

        a = Figure.S1.getColorFigure();
        b = Figure.S2.getColorFigure();
        Assert.assertEquals(a, b);
    }

    @Test
    public void show() {
        Figure a = Figure.I2;
        Figure b = Figure.I2.show();
        Assert.assertEquals(a, b);

        a = Figure.O;
        b = Figure.O;
        Assert.assertEquals(a, b);

        a = Figure.T3;
        b = Figure.T3.show();
        Assert.assertEquals(a, b);

        a = Figure.L1;
        b = Figure.L1.show();
        Assert.assertNotEquals(a, b);

        a = Figure.J1;
        b = Figure.J1.show();
        Assert.assertNotEquals(a, b);

        a = Figure.S2;
        b = Figure.S2.show();
        Assert.assertNotEquals(a, b);

        a = Figure.Z2;
        b = Figure.Z2.show();
        Assert.assertNotEquals(a, b);
    }
}