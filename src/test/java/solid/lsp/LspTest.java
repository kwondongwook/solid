package solid.lsp;

import org.junit.jupiter.api.Test;
import solid.lsp.bad.BadRectangle;
import solid.lsp.bad.BadSquare;
import solid.lsp.good.Rectangle;
import solid.lsp.good.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LspTest {

    double width = 3;
    double height = 4;

    @Test
    void LSP_위배() {
        BadRectangle rectangle = new BadRectangle();
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        assertEquals(width, rectangle.getWidth());
        assertEquals(height, rectangle.getHeight());

        BadSquare square = new BadSquare();
        square.setWidth(width);
        square.setHeight(height);
        assertNotEquals(width, square.getWidth());
        assertEquals(height, square.getHeight());
    }

    @Test
    void LSP_준수() {
        Rectangle rectangle = new Rectangle(width, height);
        assertEquals(width, rectangle.getWidth());
        assertEquals(height, rectangle.getHeight());

        Square square = new Square(width);
        assertEquals(width, square.getWidth());
        assertEquals(width, square.getHeight());
    }
}
