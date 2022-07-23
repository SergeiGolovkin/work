package home_work_2.loops;

import java.util.Scanner;

public class loops1_1 {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        System.out.println("Ведите целое число");
        long num = console.nextLong();
        long product = 1;
        for (long i = 1; i < num+1; i++){
            System.out.print(i);
            product = product * i;

            if (i == num) {
                break;
            }
            System.out.print(" * ");
        }
        System.out.print(" = " + product);

    }
}
