package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand=operand;
    }

    public void setSecondOperand(Operand operand) {
        secondOperand=operand;
    }

    public String add() throws RuntimeException {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        if(num1.intValue()<0||num2.intValue()<0)
        {
            throw new RuntimeException("ERROR");
        }
        else
        {
            BigDecimal sent=num1.add(num2);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String subtract() throws RuntimeException {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        if(num1.intValue()<0||num2.intValue()<0)
        {
            throw new RuntimeException("ERROR");
        }
        else
        {
            BigDecimal sent=num1.subtract(num2);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String multiply() throws RuntimeException {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        if(num1.intValue()<0||num2.intValue()<0)
        {
            throw new RuntimeException("ERROR");
        }
        else
        {
            BigDecimal sent=num1.multiply(num2);
            return sent.stripTrailingZeros().toString();
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        if(num1.intValue()<0||num2.intValue()<0)
        {
            throw new RuntimeException("ERROR");
        }
        else if(num2.intValue()==0)
        {
            throw new ArithmeticException("ERROR divisor is zero");
        }
        else
        {
            BigDecimal sent=num1.divide(num2,5,5);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String power() throws RuntimeException {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        if(num1.intValue()<0||num2.intValue()<0)
        {
            throw new RuntimeException("ERROR");
        }
        else
        {
            double dnum1=num1.doubleValue();
            double dnum2=num2.doubleValue();
            Operand temp=new Operand(Math.pow(dnum1,dnum2));
            BigDecimal sent=new BigDecimal(temp.getOperand());
            return sent.stripTrailingZeros().toString();
        }
    }

}
