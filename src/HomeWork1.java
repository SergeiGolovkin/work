package Home_Work_1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int numbe1= in.nextInt();                     // 0001 1100
        System.out.println("Введите еще одно число");
        int numbe2 = in.nextInt();                    // 0001 1111

        System.out.println(numbe1 | numbe2);          // 0001 1111
        System.out.println(numbe1 & numbe2);          // 0001 1100
    }
}
