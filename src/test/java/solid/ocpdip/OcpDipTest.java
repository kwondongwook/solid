package solid.ocpdip;

import org.junit.jupiter.api.Test;
import solid.ocpdip.bad.BadAreaCalculator;
import solid.ocpdip.bad.BadCircle;
import solid.ocpdip.bad.BadRectangle;
import solid.ocpdip.bad.BadSquare;
import solid.ocpdip.good.AreaCalculator;
import solid.ocpdip.good.Circle;
import solid.ocpdip.good.Rectangle;
import solid.ocpdip.good.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class OcpDipTest {

    double radius = 5;
    double side = 5;
    double width = 5;
    double height = 5;

    @Test
    void OCP_DIP_위배() {
        BadCircle circle = new BadCircle(radius);
        BadSquare square = new BadSquare(side);
        BadRectangle rectangle = new BadRectangle(width, height);

        double sum = new BadAreaCalculator().calculateSumOfAreas(circle, square, rectangle);

        assertNotEquals(circle.calculateArea() + square.calculateArea() + rectangle.calculateArea(), sum);
    }

    @Test
    void OCP_DIP_준수() {
        Circle circle = new Circle(radius);
        Square square = new Square(side);
        Rectangle rectangle = new Rectangle(width, height);

        double sum = new AreaCalculator().calculateSumOfAreas(circle, square, rectangle);

        assertEquals(circle.calculateArea() + square.calculateArea() + rectangle.calculateArea(), sum);
    }
}
