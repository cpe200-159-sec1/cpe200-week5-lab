package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = BigDecimal.ZERO;
        secondOperand = BigDecimal.ZERO;
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.operand);
    }

    public String add() {
        Check();
        return firstOperand.add(secondOperand)
                .stripTrailingZeros().toString();
    }

    public String subtract() {
        Check();
        return firstOperand.subtract(secondOperand)
                .stripTrailingZeros().toString();
    }

    public String multiply() {
        Check();
        return firstOperand.multiply(secondOperand)
                .stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if (secondOperand.equals(BigDecimal.ZERO))
            throw new ArithmeticException();
        Check();
        return firstOperand.divide(secondOperand, 5, RoundingMode.HALF_UP)
                .stripTrailingZeros().toString();
    }


    public String power() {
        Check();
        return BigDecimal.valueOf(
                Math.pow(
                        firstOperand.doubleValue(),
                        secondOperand.doubleValue()
                )
        ).stripTrailingZeros().toString();
    }

    private void Check() {
        if (firstOperand.compareTo(BigDecimal.ZERO) < 0 || secondOperand.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Operand must greater than ZERO");
        }
    }
}