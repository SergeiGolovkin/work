package home_work_2.loops;

import java.util.Scanner;

public class loops1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (console.hasNextInt()) {
            int num = console.nextInt();
            multiply(num);
        } else if (console.hasNextDouble()) {
            System.out.println("Введене не целое число");
        } else if (console.hasNextLine()) {
            System.out.println("Ввели не число");
        }
    }

    public static int multiply(int num){
        String strNum = Integer.toString(num);
        int[] a = new int[strNum.length()];
        long multiplyNumber = 1;
        for (int i = 0; i < a.length; i++)
            if (num > 9) {
                a[i] = num % 10;
                num = num / 10;
                multiplyNumber = multiplyNumber * a[i];
            } else {
                a[i] = num;
            }

        for(int i = a.length - 1; i >=0;i--) {
            if (i != 0)
                System.out.print(a[i] + " * ");
            else {
                System.out.print(a[i] + " = " + multiplyNumber);
            }
        }
        return num;
    }
}

