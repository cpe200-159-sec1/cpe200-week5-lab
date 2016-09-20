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

    public String subtract() throws RuntimeException {
        return null;
    }

    public String multiply() throws RuntimeException {
        return null;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        return null;
    }

    public String power() throws RuntimeException {
        return null;
    }

}
