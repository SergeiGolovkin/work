package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    public double exponentiation (double a, int b) {
        double result = Math.pow(a, b);
        return result;
    }

    public double module (double a){
        double result = Math.abs(a);
        return result;
    }
    public double sqrt (double a){
        double result = Math.sqrt(a);
        return result;
    }
}
