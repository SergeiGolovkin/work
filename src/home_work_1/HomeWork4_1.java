package home_work_1;

import java.util.Scanner;

public class HomeWork4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите число");
        int numbe = in.nextInt();
        if (numbe%2==1)
            System.out.println("Введеное число нечетное");
    }
}
