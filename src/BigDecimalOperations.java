import java.math.MathContext;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args) {
        System.out.println("-----BigDecimal Operations 1-----");


    java.math.BigDecimal b1 = new java.math.BigDecimal("4.2585");
    MathContext m = new MathContext(4);
    java.math.BigDecimal b2 = b1.round(m);
        System.out.println("The value of " + b1 +
            " after rounding is " + b2);

        System.out.println("-----BigDecimal Operations 2-----");
    java.math.BigDecimal PositiveNumber;
    PositiveNumber = new BigDecimal("1306");
        System.out.println("Negative value is " + PositiveNumber.negate());

    java.math.BigDecimal NegativeNumber;
    NegativeNumber = new BigDecimal(-2601);
        System.out.println("Positive value is " + NegativeNumber.negate());
}
}