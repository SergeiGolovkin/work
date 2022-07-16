package Home_Work_1;

import java.util.Scanner;

public class HomeWork4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int year = in.nextInt();
        if (((year % 4 == 0) && (year % 100 > 0)) || ((year % 400 == 0) && (year % 100 == 0) )){
            System.out.println(year + " высокосный год");
        }
        else {
            System.out.println(year + " не высокосный год");
        }
    }
}
