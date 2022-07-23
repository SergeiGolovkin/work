package home_work_1;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        sleepIn();
    }

public static boolean sleepIn(){

    Scanner in = new Scanner(System.in);
    System.out.println("Сегодня на работу? 0 - сегодня выходной; 1 - да на роботу; 2 - у меня отпуск");
    int answer = in.nextInt();
    boolean weekday = (answer == 1);
    boolean vacatio = (answer == 0) || (answer == 2);
    if (vacatio){
        System.out.println("Можно спать дальше");
    } else if (weekday) {
        System.out.println("Пора идти на работу");
    }
    else{
        System.out.println("Вы некоректно ответили");
    }
    return weekday;
}
}
