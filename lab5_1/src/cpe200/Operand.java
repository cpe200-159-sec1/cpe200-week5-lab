package cpe200;

public class Operand {
    private  String operand;

    public Operand(String operand) {
        this.operand = operand;
    }

    public Operand(int operand) {
        this.operand = Integer.toString(operand);
    }

    public Operand(double operand) {
        String temp = Double.toString(operand);
        temp = temp.indexOf(".") < 0 ? temp : temp.replaceAll("0*$", "").replaceAll("\\.$", "");
        this.operand = temp;
    }

    public String getOperand(){
        return this.operand;
    }

}
