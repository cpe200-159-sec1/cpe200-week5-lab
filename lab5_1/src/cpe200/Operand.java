package cpe200;

import java.util.DoubleSummaryStatistics;

public class Operand {
    private String operand;

    public Operand(String operand) {
        this.operand=operand;
    }

    public Operand(int operand) {
        this.operand = Integer.toString(operand);
    }

    public Operand(double operand) {
        this.operand = Double.toString(operand);
    }

    public String getOperand(){
        return operand;
    }
}
