package home_work_2.loops;

import java.util.Scanner;

public class loops1_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //System.out.println("Введите целое число");
        //int a = console.nextInt();
        //System.out.println("Наибольшая цифра = " + loops1_5_1(a));

        //System.out.println("Введите из скольки чисел вычислить вероятность четных случайных чисел");
        //int ite = console.nextInt();
        //System.out.println("Процент выпадения четных случайных чисел " + loops1_5_2(ite) + "%");

        System.out.println("Введите целое число");
        int c = console.nextInt();
        System.out.println("Введите второе целое число");
        int f = console.nextInt();
        System.out.println("Ряд Фибоначи из чисел " + c + " " + f + " " + loops1_5_3(c,f));
    }
    public static int loops1_5_1 (int a){
        String strNum = Integer.toString(a);
        int max = a % 10;
        a = a / 10;
        for (int i = 0; i < strNum.length(); i++) {
            if (a % 10 > max){
                max = a % 10;
                a = a / 10;
            }
            else {
                a = a / 10;
            }
        }
        return max;

    }
    public static float loops1_5_2(int  ite){
        int g = 0;
        int number;
        for (int i = 0; i < ite; i++) {
            number = (int) (Math.random() * 100);
            if (number % 2 == 0){
                g = g++;
            }
        }
        float pro = (ite / g) * 100;

        return pro;
    }
    public static String loops1_5_3(int c, int f){
        String fibonachi = "";
        for (int i = 0; i < 10; i++) {
            int fib = c + f;
            c = f;
            f = fib;
            fibonachi += " " + f;
        }
        return fibonachi;
    }

}
