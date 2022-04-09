package Boolean;

import java.util.Scanner;

public class Boolean11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();

        boolean d = (((a % 2 == 1) && (b % 2 == 1))) || ((a % 2 == 0) && (b % 2 == 0));
        System.out.print(d);
    }
}
