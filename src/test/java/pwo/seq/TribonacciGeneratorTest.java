package pwo.seq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class TribonacciGeneratorTest {
    @Test
    public void testReset() {
        System.out.println("reset");
        TribonacciGenerator instance = new TribonacciGenerator();
        instance.reset();
        BigDecimal expResult = new BigDecimal(0);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);
    }

    @Test
    public void testNextTerm() {
        System.out.println("nextTerm");
        TribonacciGenerator instance = new TribonacciGenerator();
        instance.nextTerm();
        BigDecimal expResult = new BigDecimal(0);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);
    }

    @Test
    void testGetTerm() {
        System.out.println("getTerm");
        TribonacciGenerator instance = new TribonacciGenerator();
        BigDecimal expResult = new BigDecimal(34);
        BigDecimal result = instance.getTerm(10);
        assertEquals(expResult, result);
    }
}
