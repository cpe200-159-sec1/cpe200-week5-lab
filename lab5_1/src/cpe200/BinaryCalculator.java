package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private Operand firstOperand ;
    private Operand secondOperand;


    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() {
        BigDecimal temp1 = new BigDecimal(firstOperand.Getoper());
        BigDecimal temp2 = new BigDecimal(secondOperand.Getoper());
        if (temp1.compareTo(BigDecimal.ZERO) >= 0 && temp2.compareTo(BigDecimal.ZERO) >= 0)
        return temp1.add(temp2).stripTrailingZeros().toString();
        else
        throw new RuntimeException();
    }

    public String subtract() {
        BigDecimal temp1 = new BigDecimal(firstOperand.Getoper());
        BigDecimal temp2 = new BigDecimal(secondOperand.Getoper());
        if (temp1.compareTo(BigDecimal.ZERO) >= 0 && temp2.compareTo(BigDecimal.ZERO) >= 0)
        return temp1.subtract(temp2).stripTrailingZeros().toString();
        else
            throw new RuntimeException();
    }

    public String multiply() {
        BigDecimal temp1 = new BigDecimal(firstOperand.Getoper());
        BigDecimal temp2 = new BigDecimal(secondOperand.Getoper());
        if (temp1.compareTo(BigDecimal.ZERO) >= 0 && temp2.compareTo(BigDecimal.ZERO) >= 0)
        return temp1.multiply(temp2).stripTrailingZeros().toString();
        else
            throw new RuntimeException();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal temp1 = new BigDecimal(firstOperand.Getoper());
        BigDecimal temp2 = new BigDecimal(secondOperand.Getoper());
        if (temp1.compareTo(BigDecimal.ZERO) >= 0 && temp2.compareTo(BigDecimal.ZERO) >= 0)
        return temp1.divide(temp2,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
        else {
            if (temp2.compareTo(BigDecimal.ZERO) == 0)
                throw new ArithmeticException();
            throw new RuntimeException();
        }
    }

    public String power() {
        BigDecimal temp1 = new BigDecimal(firstOperand.Getoper());
        BigDecimal temp2 = new BigDecimal(secondOperand.Getoper());
        if (temp1.compareTo(BigDecimal.ZERO) >= 0 && temp2.compareTo(BigDecimal.ZERO) >= 0)
        return temp1.pow(temp2.intValue()).stripTrailingZeros().toString();
        else
            throw new RuntimeException();
    }
}
