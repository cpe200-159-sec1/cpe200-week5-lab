package cpe200;

public class Operand {
    private String operand;

    public Operand(String operand) {
        this.setOperand(operand);
    }

    public Operand(int operand) {
        this.setOperand(Integer.toString(operand));
    }

    public Operand(double operand) {
        this.setOperand(Double.toString(operand));
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }
}
