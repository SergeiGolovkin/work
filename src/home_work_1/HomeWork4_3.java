package home_work_1;

import java.util.Scanner;

public class HomeWork4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();
        System.out.println("Введите еще одно число");
        int b = in.nextInt();
        if (a % b == 0){
            System.out.println(a + " делиться на " + b);
        } else if (b%a == 0) {
            System.out.println(b + " делиться на " + a);
        }
        else{
            System.out.println("Числа не делятся ");
        }
    }
}
