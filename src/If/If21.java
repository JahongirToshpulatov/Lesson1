package If;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X1 = ");
        int x = scanner.nextInt();
        System.out.print("Enter Y1 = ");
        int y = scanner.nextInt();
        if (x == 0 && y == 0) {
            System.out.println(0);
        } else if (y == 0) System.out.println(1);
        else if (x==0)System.out.println(2);

        else System.out.println(3);

    }
}