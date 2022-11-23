package pwo.seq;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SeqTypeTest {
    @Test
    public void testGetGeneratorFib() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.FIB;
        var result = instance.getGenerator();
        assertEquals(FibonacciGenerator.class, result.getClass());
    }

    @Test
    public void testGetGeneratorLuc() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.LUC;
        var result = instance.getGenerator();
        assertEquals(LucasGenerator.class, result.getClass());
    }

    @Test
    public void testGetGeneratorTri() {
        System.out.println("getGenerator");
        SeqType instance = SeqType.TRI;
        var result = instance.getGenerator();
        assertEquals(TribonacciGenerator.class, result.getClass());
    }

    @Test
    public void testFromString() {
        System.out.println("fromString");
        String type = "fibonaci";
        SeqType expResult = SeqType.FIB;
        SeqType result = SeqType.fromString(type);
        assertEquals(expResult, result);
    }

    @Test
    public void testValues() {
        System.out.println("values");
        SeqType[] expResult = { SeqType.FIB, SeqType.LUC, SeqType.TRI };
        SeqType[] result = SeqType.values();
        assertArrayEquals(expResult, result);
    }
}
