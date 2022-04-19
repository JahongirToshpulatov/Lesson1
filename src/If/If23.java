package If;

import java.util.Scanner;

public class If22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X1 = ");
        int x = scanner.nextInt();
        System.out.print("Enter Y1 = ");
        int y = scanner.nextInt();
        if (x > 0 && y > 0) System.out.println("1 - coordinate");
        else if (x < 0 && y > 0) System.out.println("2-coordinate");
        else if (x < 0 && y < 0) System.out.println("3-coordinate");
        else System.out.println("4-coordinate");
    }
}