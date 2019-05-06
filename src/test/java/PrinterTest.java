import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.paperCount());
    }

    @Test
    public void canPrint() {
        printer.print(10, 2);
        assertEquals(80, printer.paperCount());
    }

    @Test
    public void willNotPrintIfNotEnoughPaper() {
        printer.print(30, 4);
        assertEquals(100, printer.paperCount());
    }

    @Test
    public void canRefillPaper() {
        printer.print(20, 2);
        printer.refill();
        assertEquals(100, printer.paperCount());
    }

    @Test
    public void canUseUpToner() {
        printer.print(15, 3);
        assertEquals(55, printer.tonerCount());
    }

}
