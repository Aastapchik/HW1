import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int temp = 0; Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");

        // 0 задача
        System.out.print("Введите имя пользователя: ");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);

        // 1 задача
        System.out.println("Введи число b: "); float b = scanner.nextFloat();
        System.out.println("Введи число c: "); float c = scanner.nextFloat();
        System.out.println("Значение выражения равно " + (4*(b+c-1)/2));

        // 2 задача
        while(temp == 0) {
            System.out.println("Введите двухзначное число: ");
            int n = scanner.nextInt();
            if ((n < 10) || (n > 99)) System.out.println("Число n не двухзначное");
            else {
                int sec_num = n % 10;
                int fst_num = (n - n % 10) / 10;
                System.out.println("Сумма цифр равна: " + (fst_num + sec_num));
                temp = 1;
            }
        }
        temp = 0;

        // 3 задача
        while (temp == 0) {
            System.out.println("Введите трехзначное число: ");
            int q = scanner.nextInt();
            if ((q < 100) || (q > 999)) System.out.println("Число n не трехзначное");
            else {
                int q1 = q % 100;
                int third_q = q1 % 10; int sec_q = (q1 - q1%10)/10;
                int fst_q = (q - 10*sec_q - third_q)/100;
                System.out.println("Сумма цифр равна: " + (fst_q+sec_q+third_q));
                temp = 1;
            }
        }

        // 4 задача
        System.out.println("Введи действительное число: "); float v = scanner.nextFloat();
        System.out.println("Округленное число равно: " + Math.round(v));

        // 5 задача
        System.out.println("Введи число q: "); double z = scanner.nextDouble();
        System.out.println("Введи число w: "); double w = scanner.nextDouble();
        int integer = (int) Math.floor(z/w); int fl = (int) (z - w*integer);
        System.out.println("Отношение чисел равно " + integer + " целых и " + fl + " в остатке");

        // 6 задача
        System.out.println("Введи число а: "); int a = scanner.nextInt();
        System.out.println("Введи число b: "); int b1 = scanner.nextInt();
        //int t = a; a = b1; b1 = t;
        a += b1; b1 -= a; b1 = -b1; a -= b1;
        System.out.println("Число а равно " + a);
        System.out.println("Число b равно " + b1);
        
    }
}
