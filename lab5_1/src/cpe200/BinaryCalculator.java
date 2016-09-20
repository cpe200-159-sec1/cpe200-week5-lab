package cpe200;


import java.math.BigDecimal;
import java.util.concurrent.TimeoutException;

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

    public String add() throws RuntimeException {

        if (checkInputNegative()){
            throw new RuntimeException("Operand is negative number");
        }
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();


    }

    public String subtract() throws RuntimeException {
        if (checkInputNegative()) {
            throw new RuntimeException("Operand is negative number");
        }
        return this.firstOperand.subtract(secondOperand).stripTrailingZeros().toString();

    }

    public String multiply() throws RuntimeException {
        if (checkInputNegative()) {
            throw new RuntimeException("Operand is negative number");
        }
        return this.firstOperand.multiply(secondOperand).stripTrailingZeros().toString();

    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {

        if (checkInputZero()){
            throw new ArithmeticException("Operand is divide by zero");
        }


        else if (checkInputNegative()){
            throw new RuntimeException("Operand is divide by number less then zero");
        }

        return this.firstOperand.divide(secondOperand, 5 ,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
        // check that if it division and have more then 5
    }

    public String power() throws RuntimeException {
        if (checkInputNegative()) {
            throw new RuntimeException("Operand is divide by number less then zero");
        }

        return this.firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();


    }

    private boolean checkInputNegative() {
        //check input is < 0 or not

        return (firstOperand.compareTo(BigDecimal.ZERO) < 0 || secondOperand.compareTo(BigDecimal.ZERO) < 0);

    }

    private boolean checkInputZero() {
        //check input is < 0 or not
        return (secondOperand.compareTo(BigDecimal.ZERO) == 0);
    }

}
