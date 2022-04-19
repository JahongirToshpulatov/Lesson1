package If;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = scanner.nextInt();
        if (number > 0) System.out.print(number + 1);
        else  System.out.print(number);
    }
}
