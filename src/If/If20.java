package If;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = scanner.nextInt();
        System.out.print("Enter B = ");
        int b = scanner.nextInt();
        System.out.print("Enter C = ");
        int c = scanner.nextInt();

        int d = Math.abs(Math.abs(b) - Math.abs(a)), z = Math.abs(Math.abs(c) - Math.abs(a));
        if (d > z) {
            System.out.println(c);
            System.out.println(z);
        } else {
            System.out.println(b);
            System.out.println(d);
        }


    }
}