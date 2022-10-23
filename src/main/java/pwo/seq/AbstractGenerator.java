package pwo.seq;

import java.math.BigDecimal;

import pwo.utils.SequenceGenerator;

public abstract class AbstractGenerator implements SequenceGenerator{
    protected int lastIndex = 0;
    protected BigDecimal current;
    protected BigDecimal f_1;
    protected BigDecimal f_2;
    protected BigDecimal f_3;

    @Override
    public void reset() {
        lastIndex = 0;
    }

    @Override
    public final BigDecimal getTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset();
        }
        while (lastIndex <= i) {
            nextTerm();
        }
        return current;
    }
}
