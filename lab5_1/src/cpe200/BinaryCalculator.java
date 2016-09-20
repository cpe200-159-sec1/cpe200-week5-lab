package cpe200;

import java.math.BigDecimal;
import java.math.MathContext;
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
        safetyCheck();
        return firstOperand.add(secondOperand)
                .stripTrailingZeros().toString();
    }

    public String subtract() {
        safetyCheck();
        return firstOperand.subtract(secondOperand)
                .stripTrailingZeros().toString();
    }

    public String multiply() {
        safetyCheck();
        return firstOperand.multiply(secondOperand)
                .stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if (secondOperand.equals(BigDecimal.ZERO))
            throw new ArithmeticException();
        safetyCheck();
        return firstOperand.divide(secondOperand, 5, RoundingMode.HALF_UP)
                .stripTrailingZeros().toString();
    }


    public String power() {
        safetyCheck();
        return BigDecimal.valueOf(
                Math.pow(
                        firstOperand.doubleValue(),
                        secondOperand.doubleValue()
                )
        ).stripTrailingZeros().toString();
    }

    private void safetyCheck() {
        if(firstOperand.compareTo(BigDecimal.ZERO)<=0 || secondOperand.compareTo(BigDecimal.ZERO)<=0) {
            throw new RuntimeException("Operand must greater than ZERO");
        }
    }
}
