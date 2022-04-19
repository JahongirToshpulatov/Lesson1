package If;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1 = ");
        int number = scanner.nextInt();
        System.out.print("Enter number2 = ");
        int number2 = scanner.nextInt();
        if (number>number2) System.out.print(number);
        else System.out.print(number2);
    }
}
