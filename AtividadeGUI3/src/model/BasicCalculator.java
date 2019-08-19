package model;

public class BasicCalculator {
    private double op1, op2, result;

    public double getAdd(String value1,String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        result = op1 + op2;
        return result;
    }

    public double getSub(String value1,String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        result = op1 - op2;
        return result;
    }

    public double getMult(String value1,String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        result = op1 * op2;
        return result;
    }

    public double getDiv(String value1,String value2){
        op1 = Double.parseDouble(value1);
        op2 = Double.parseDouble(value2);
        result = op1 / op2;
        return result;
    }
}
