package home_work_1;

public class HomeWork2 {
    public static void main(String[] args) {
        int b = 2;
        int a = 8;
        int p1 = 5+2/8;             // 2/8  5+0.25  == 5.25 int целое число, а 5,25 меньше 6
        int p2 = (5 + 2) / 8;       // 5+2   7/8  == 0.875, int целое число, а 0,875 меньше 1
        int p3 = (5 + b++) / 8;
        //int p4 = (5 + b++) / --a;   //(5 + 2++) / --a = 1, ++ можно применять только к переменным,
        int p5 = (5 * 2 >> b++) / --a;
        int p6 = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a;
        //boolean p7  = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --a;
        boolean p8 = 6 - 2 > 3 && 12 * 12 <= 119;
        boolean p9 = true && false;


        System.out.println("5+2/8 = " + p1);
        System.out.println("(5 + 2) / 8 = " + p2);
        System.out.println("(5 + 2++) / 8 = " + p3);
        //System.out.println("(5 + 2++) / --a = " + p4);
        System.out.println("(5 * 2 >> 2++) / --a = " + p5);
        System.out.println("(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --a = " + p6);
        //System.out.println("(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --a = " + p7);
        System.out.println("6 - 2 > 3 && 12 * 12 <= 119 = " + p8);
        System.out.println("true && false =" +p9);


    }
}
