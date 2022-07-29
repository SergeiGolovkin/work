package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

/**
 * расчет выражения при помощи методов класса CalculatorWithOperator
 * 4.1 + 15 * 7 + (28 / 5) ^ 2
 *
 */

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculation = new CalculatorWithOperator();

        double result2 = calculation.division(28,5);
        double result3 = calculation.multiplication(result2,result2);
        double result4 = calculation.multiplication(15,7);
        double result5 = calculation.addition(4.1,result4);
        double result6 = calculation.addition(result3,result5);
        System.out.println(result6);

    }


}
