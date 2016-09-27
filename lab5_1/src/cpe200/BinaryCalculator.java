package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
        firstOperand = new Operand(0);
        secondOperand = new Operand(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand.setOperand(operand.getOperand());
    }

    public  Operand getFirstOperand(){
        return  firstOperand;
    }

    public  Operand getSecondOperand(){
        return  secondOperand;
    }


    public void setSecondOperand(Operand operand) {
        secondOperand.setOperand(operand.getOperand());
    }

    public String add() throws RuntimeException {
        BigDecimal first = new BigDecimal(getFirstOperand().getOperand());
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        if(first.compareTo(BigDecimal.ZERO) <= 0 || second.compareTo(BigDecimal.ZERO) <= 0){
            throw  new RuntimeException("non-negative");
        }
        return first.add(second).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        BigDecimal first = new BigDecimal(getFirstOperand().getOperand());
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        if(first.compareTo(BigDecimal.ZERO) <= 0 || second.compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("non-negative");
        }
        return first.subtract(second).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        BigDecimal first = new BigDecimal(getFirstOperand().getOperand());
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        if(first.compareTo(BigDecimal.ZERO) <= 0 || second.compareTo(BigDecimal.ZERO) <= 0){
            throw  new RuntimeException("non-negative");
        }
        return first.multiply(second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal first = new BigDecimal((getFirstOperand().getOperand()));
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        if(first.compareTo(BigDecimal.ZERO) <= 0 || second.compareTo(BigDecimal.ZERO) <= 0){
            throw  new ArithmeticException("ERROR");
        }
        return first.divide(second,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        BigDecimal first = new BigDecimal((getFirstOperand().getOperand()));
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        if(first.compareTo(BigDecimal.ZERO) <= 0 || second.compareTo(BigDecimal.ZERO) <= 0){
            throw  new RuntimeException("non-negative");
        }
        return first.pow(second.intValue()).stripTrailingZeros().toString();
    }

}