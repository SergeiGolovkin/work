package home_work_2.loops;

import java.util.Scanner;

/**
 * Метод main просит ввести чиcло
 * и выводит результат вычислений до переполнения числа в long и после переполнения в long
 */

public class loops1_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int number = console.nextInt();
        max(number);

    }
    public static long max (long number){
        long a = 1;
        long c = 1;
        for (int i = 0;; i++) {
            a *= number;
            if (a < 0) {
                System.out.println("Значение после переполнения = " + a);
                for (int j = 0; j < i; j++) {
                    c = c * number;
                }
                System.out.println("Значение до переполнения = " + c);
                break;
            }
        }
        return a;
    }
}
