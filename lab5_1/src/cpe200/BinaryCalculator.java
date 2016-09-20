package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private BigDecimal st;
    private BigDecimal nd;

    public BinaryCalculator() {
        st = new BigDecimal(0);
        nd = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
        st = new BigDecimal(firstOperand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
        nd = new BigDecimal(secondOperand.getOperand());
    }

    public String add() throws RuntimeException {
        if(isNegative())
            throw new RuntimeException("Negative number");
        return st.add(nd).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(isNegative())
            throw new RuntimeException("Negative number");
        return st.subtract(nd).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if(isNegative())
            throw new RuntimeException("Negative number");
        return st.multiply(nd).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(nd.equals(0))
            throw new ArithmeticException("Cannot divide by zero");
        if(isNegative())
            throw new RuntimeException("Negative number");
        return st.divide(nd, 5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if(isNegative())
            throw new RuntimeException("Negative number");
        return st.pow(nd.intValue()).stripTrailingZeros().toString();
    }

    public boolean isNegative()
    {
        return (st.doubleValue() < 0 || nd.doubleValue() <0);
    }
}
