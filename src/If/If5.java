package If;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 = ");
        int number = scanner.nextInt();
        System.out.print("Enter number2 = ");
        int number2 = scanner.nextInt();
        System.out.print("Enter number3 = ");
        int number3 = scanner.nextInt();
        int n = 0, b = 0;
        if (number > 0) {
            n = n + 1;
        } else b = b + 1;
        if (number2 > 0) n = n + 1;
        else b = b + 1;
        if (number3 > 0) n = n + 1;
        else b = b + 1;
        System.out.println("Positive number = " + n);
        System.out.print("Negative number = " + b);
    }
}
