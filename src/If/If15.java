package If;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = scanner.nextInt();
        System.out.print("Enter B = ");
        int b = scanner.nextInt();
        System.out.print("Enter C = ");
        int c = scanner.nextInt();

        if (a > b && b > c) {
            System.out.println(a + b);
        } else if (a > b && b < c) {
            System.out.println(a + c);
        } else if (b > a && a > c) System.out.println(b + a);
        else if (b > a && a < c) System.out.println(b + c);
        else if (c > b && b > a) System.out.println(c + b);
        else if (c > b && b < a) System.out.println(c + a);

    }
}