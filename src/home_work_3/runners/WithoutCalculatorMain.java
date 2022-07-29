package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double a = 4.1;
        int b = 15;
        int c = 7;
        float d = 28;
        float e = 5;
        double result = a + b * c + ((d/e) * (d/e));             // result = 140.45999870300292
        double result1 = 4.1 + 15 * 7 + (( 28 / 5) * (28 / 5));  // result = 134.1
        System.out.println( "result = " + result);
        System.out.println("result1 = " + result1);

    }
}
