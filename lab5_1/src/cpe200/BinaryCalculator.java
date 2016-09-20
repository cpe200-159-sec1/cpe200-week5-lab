package cpe200;


import java.math.BigDecimal;


public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.operand);
    }

    public String add() throws RuntimeException {
        if(firstOperand.compareTo(BigDecimal.ZERO) <=0 || secondOperand.compareTo(BigDecimal.ZERO) <=0){
            throw new RuntimeException("non-negative");
        }
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(firstOperand.compareTo(BigDecimal.ZERO) <=0 || secondOperand.compareTo(BigDecimal.ZERO) <=0){
            throw new RuntimeException("non-negative");
        }
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if(firstOperand.compareTo(BigDecimal.ZERO) <=0 || secondOperand.compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("non-zero");
        }
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(firstOperand.compareTo(BigDecimal.ZERO) <=0 || secondOperand.compareTo(BigDecimal.ZERO) <= 0){
            throw new ArithmeticException("non-zero");
        }
        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if(firstOperand.compareTo(BigDecimal.ZERO) <=0 || secondOperand.compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("non-negative");
        }
        return BigDecimal.valueOf(Math.pow(firstOperand.doubleValue(),secondOperand.doubleValue())).stripTrailingZeros().toString();
    }

}
