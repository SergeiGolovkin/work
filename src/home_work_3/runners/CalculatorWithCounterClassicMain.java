package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

        CalculatorWithCounterClassic calculation = new CalculatorWithCounterClassic();
        double result2 = calculation.division(28, 5);
        calculation.incrementCountOperation();
        double result3 = calculation.multiplication(result2, result2);
        calculation.incrementCountOperation();
        double result4 = calculation.multiplication(15, 7);
        calculation.incrementCountOperation();
        double result5 = calculation.addition(4.1, result4);
        calculation.incrementCountOperation();
        double result6 = calculation.addition(result3, result5);
        System.out.println(result6);                                       // результат = 140.45999999999998
        System.out.println(calculation.getCountOperation());               // количество обращений 4
    }
}
