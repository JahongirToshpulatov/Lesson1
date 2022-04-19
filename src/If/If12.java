package If;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = scanner.nextInt();
        System.out.print("Enter B = ");
        int b = scanner.nextInt();
        System.out.print("Enter C = ");
        int c = scanner.nextInt();

        if (a > b && b > c) System.out.println(c);
        else if (a > b && b < c) System.out.println(b);
        else if (b > c && c > a) System.out.println(a);
        else if (b > c && c < a) System.out.println(c);
        else if (c > a && a > b) System.out.println(b);
        else System.out.println(a);


    }
}