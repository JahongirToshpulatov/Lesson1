package If;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A = ");
        int number = scanner.nextInt();
        System.out.print("Enter B = ");
        int number2 = scanner.nextInt();
        if (number > number2) {
            System.out.println("A = " + number2);
            System.out.print("B = " + number);
        } else {System.out.println("A = " + number);
        System.out.print("B = " + number2);}

    }
}