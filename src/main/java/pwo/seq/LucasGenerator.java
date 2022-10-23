package pwo.seq;

import java.math.BigDecimal;

public class LucasGenerator extends AbstractGenerator{
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(2);
    }

    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(2);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 1) { current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        }
        else if (lastIndex == 1) {
            current = new BigDecimal(2);
        }
        else {
            current = new BigDecimal(1);
        }

        lastIndex++;
        return current;
    }
}
