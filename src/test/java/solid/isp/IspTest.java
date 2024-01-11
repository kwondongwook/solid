package solid.isp;

import org.junit.jupiter.api.Test;
import solid.isp.bad.BadSimplePrinter;
import solid.isp.bad.BadSimpleScanner;
import solid.isp.good.SimplePrinter;
import solid.isp.good.SimpleScanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IspTest {

    String scanTarget = "13579";
    int printTarget = 2468;

    @Test
    void ISP_위배() {
        BadSimplePrinter simplePrinter = new BadSimplePrinter();
        assertEquals(String.valueOf(printTarget), simplePrinter.print(printTarget));
        assertThrows(UnsupportedOperationException.class, () -> simplePrinter.scan(scanTarget));

        BadSimpleScanner simpleScanner = new BadSimpleScanner();
        assertEquals(Integer.parseInt(scanTarget), simpleScanner.scan(scanTarget));
        assertThrows(UnsupportedOperationException.class, () -> simpleScanner.print(printTarget));
    }

    @Test
    void ISP_준수() {
        SimplePrinter simplePrinter = new SimplePrinter();
        assertEquals(String.valueOf(printTarget), simplePrinter.print(printTarget));

        SimpleScanner simpleScanner = new SimpleScanner();
        assertEquals(Integer.parseInt(scanTarget), simpleScanner.scan(scanTarget));
    }
}
