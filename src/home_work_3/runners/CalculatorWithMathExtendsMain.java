package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculation = new CalculatorWithMathExtends();
        double result2 = calculation.division(28,5);
        double result3 = calculation.multiplication(result2,result2);
        double result4 = calculation.multiplication(15,7);
        double result5 = calculation.addition(4.1,result4);
        double result6 = calculation.addition(result3,result5);
        System.out.println(result6);                                            // результаат = 140.45999999999998

    }

}