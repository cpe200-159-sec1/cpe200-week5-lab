package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    private BigDecimal x;
    private BigDecimal y;

    public BinaryCalculator() {
        x = new BigDecimal(0);
        y = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        x = new BigDecimal(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        y = new BigDecimal(operand.getOperand());
    }

    public String add() {
        if (x.intValue() < 0 || y.intValue() < 0){
            throw new RuntimeException("Operand must not negative");
        }return x.add(y).stripTrailingZeros().toString();
    }

    public String subtract() {
        if (x.intValue() < 0 || y.intValue() < 0){
            throw new RuntimeException("Operand must not negative");
        }return x.subtract(y).stripTrailingZeros().toString();
    }

    public String multiply() {
        if (x.intValue() < 0 || y.intValue() < 0){
            throw new RuntimeException("Operand must not negative");
        }return x.multiply(y).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()  {
        if (x.intValue() < 0 || y.intValue() < 0){
            throw new RuntimeException("Operand must not negative");
        }return x.divide(y, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power()  {
        int e = y.intValue();
        if (x.intValue() < 0 || y.intValue() < 0){
            throw new RuntimeException("Operand must not negative");
        }return x.pow(e).stripTrailingZeros().toString();
    }

}
