package cpe200;

import java.math.BigDecimal;

public class Operand {
    protected String operand;

    public Operand(String operand) {
        this.operand = operand;
    }

    public Operand(int operand) {
        this.operand = Integer.toString(operand);
    }

    public Operand(double operand) {
        this.operand = Double.toString(operand);
    }
}
