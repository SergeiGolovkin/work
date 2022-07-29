package home_work_3.calcs.simple;

public class CalculatorWithOperator {
    public double division (double a, double b){
        double result = a / b;
        return result;
    }
    public double multiplication (double a, double b ){
        double result = a * b;
        return result;
    }
    public double addition ( double a, double b){
        double result = a + b;
        return result;
    }
    public  double subtraction (double a, double b){
        double result = a - b;
        return result;
    }
    public double exponentiation (double a, int b){
        double result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;
    }
    public double module (double a){
        double result;
        int b = -1;
        if (a < 0)
            result = a * b;
        else
            result = a;
        return result;
    }
    public double sqrt (double a){
        double result;
        result = Math.sqrt(a);
        return result;
    }
}
