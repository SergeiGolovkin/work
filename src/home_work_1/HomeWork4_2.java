package home_work_1;

import java.util.Scanner;

public class HomeWork4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа через клавишу enter");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((( a > b ) && ( b > c )) || (( a < b ) && ( b < c ))){
            System.out.println("Среднее число " + b);
        } else if ((( c > a ) && ( a > b )) || (( a > c ) && ( a < b ))) {
            System.out.println("Среднее число " + a);
        } else if ((( b > c ) && ( c > a ))  || (( c > b ) && ( c < a ))) {
            System.out.println("Среднее число " + c);
        } else if ((a == c) || (b == c) || ( a==b )) {
            System.out.println("Есть равные числа");
        }
    }
}
