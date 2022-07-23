package home_work_2.loops;

import java.util.Scanner;

public class loops_1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число которое мы будем возводить в степень");
        double num = console.nextDouble();
        System.out.println("Ведите число в которое буде возводить");
        int e = console.nextInt();
        double result = 1;
        for (int i = 0; i < e; i++)
                result *= num;
        System.out.println(num + " ^ " + e + " = " + result);
    }
}
