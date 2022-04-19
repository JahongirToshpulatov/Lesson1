package If;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A = ");
        int number = scanner.nextInt();
        System.out.print("Enter B = ");
        int number2 = scanner.nextInt();

        int n=number + number2;
        if (number != number2) {
            System.out.println("A + B = " + n);
            System.out.println("A + B = " + n);
        } else {
            System.out.println("A = " + 0);
            System.out.println("B = " + 0);
        }

    }
}