import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        S
        int a, b, c, d;


        System.out.println("Введіть перше число");
        a = s.nextInt();
        System.out.println("Твій номер" + a);
        System.out.println("ВВедіть друге число");
        b = s.nextInt();
        System.out.println("Виберіть операцію " +
                "1: +; " +
                "2: -; " +
                "3: *; " +
                "4: /;");
        c = s.nextInt();

        switch (c){
            case 1: d = a + b;
                System.out.println("Твой результат" + d);
                break;
            case 2: d = a - b;
                System.out.println("Твой результат" + d);
                break;
            case 3: d = a * b;
                System.out.println("Твой результат" + d);
                break;
            case 4: d = a / b;
                System.out.println("Твой результат" + d);
                break;
        }



//        if (c == 1) {
//            d = a + b;
//            System.out.println("Твой результат" + d);
//        }
//        if (c == 2) {
//            d = a - b;
//            System.out.println("Твой результат" + d);
//        }
//        if (c == 3) {
//            d = a * b;
//            System.out.println("Твой результат" + d);
//        }
//        if (c == 4) {
//            d = a / b;
//            System.out.println("Твой результат" + d);
//        }


    }
}
