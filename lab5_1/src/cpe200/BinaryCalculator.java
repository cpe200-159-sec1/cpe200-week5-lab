package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;

import static junit.framework.TestCase.fail;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add() throws RuntimeException {

        if (firstOperand.intValueExact() < 0) {
            throw new RuntimeException("first operand is negative value");
        } else if (secondOperand.intValueExact() < 0) {
            throw new RuntimeException("second operand is negative value");
        }

        return firstOperand.add(secondOperand).stripTrailingZeros().toString();

    }

    public String subtract() throws RuntimeException {

        if (firstOperand.intValueExact() < 0) {
            throw new RuntimeException("first operand is negative value");
        } else if (secondOperand.intValueExact() < 0) {
            throw new RuntimeException("second operand is negative value");
        }

        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (firstOperand.intValueExact() < 0) {
            throw new RuntimeException("first operand is negative value");
        } else if (secondOperand.intValueExact() < 0) {
            throw new RuntimeException("second operand is negative value");
        }

        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (firstOperand.intValueExact() < 0) {
            throw new RuntimeException("first operand is negative value");
        } else if (secondOperand.intValueExact() < 0) {
            throw new RuntimeException("second operand is negative value");
        }

        if (secondOperand.intValueExact() == 0) {
            throw new ArithmeticException("Divide dy zero");
        }

        return firstOperand.divide(secondOperand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if (firstOperand.intValueExact() < 0) {
            throw new RuntimeException("first operand is negative value");
        } else if (secondOperand.intValueExact() < 0) {
            throw new RuntimeException("second operand is negative value");
        }

        return firstOperand.pow(secondOperand.intValueExact()).stripTrailingZeros().toString();
    }

}
