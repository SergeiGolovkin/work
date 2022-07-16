package Home_Work_1;
import java.util.Objects;
import java.util.Scanner;

public class HomeWork6_2 {
    public static void main(String[] args) {
        String vasia = "Вася";
        String nastya = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name_in = in.next();
        if (Objects.equals(vasia,name_in)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(nastya,name_in)){
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
