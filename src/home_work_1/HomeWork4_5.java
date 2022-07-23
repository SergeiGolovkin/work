package home_work_1;

import java.util.Scanner;

public class HomeWork4_5 {
    public static void main(String[] args) {
        String a_char = "A";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите букву A");
        String in_char = in.next();
        if (in_char.equals(a_char)){
            System.out.println("Спасибо.");
        }
        else{
            System.out.println("Вы ввели: " + in_char);
        }
    }
}
