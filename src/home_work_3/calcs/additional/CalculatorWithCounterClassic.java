package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    public long i;
    public void incrementCountOperation() {
        i++;
    }

    public long getCountOperation() {
        return i;
    }
}
