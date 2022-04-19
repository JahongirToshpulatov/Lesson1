package If;

import java.util.Scanner;

public class If17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = scanner.nextInt();
        System.out.print("Enter B = ");
        int b = scanner.nextInt();
        System.out.print("Enter C = ");
        int c = scanner.nextInt();

        if (a < b && b < c) {

            System.out.println(2 * a);
            System.out.println(2 * b);
            System.out.println(2 * c);
        } else if (a > b && b > c) {
            System.out.println(2 * a);
            System.out.println(2 * b);
            System.out.println(2 * c);

        } else {
            System.out.println(-a);
            System.out.println(-b);
            System.out.println(-c);

        }

    }
}