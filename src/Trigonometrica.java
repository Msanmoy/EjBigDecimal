import java.math.BigDecimal;
import java.math.MathContext;

public class Trigonometrica {

    public static BigDecimal sin(BigDecimal x, MathContext mc) {
        return new BigDecimal(Math.sin(x.doubleValue()), mc);
    }

    public static BigDecimal cos(BigDecimal x, MathContext mc) {
        return new BigDecimal(Math.cos(x.doubleValue()), mc);
    }

    public static BigDecimal atan2(BigDecimal y, BigDecimal x, MathContext mc) {
        return new BigDecimal(Math.atan2(y.doubleValue(), x.doubleValue()), mc);
    }

    public static BigDecimal sqrt(BigDecimal value, MathContext mc) {
        return value.sqrt(mc);
    }

}
