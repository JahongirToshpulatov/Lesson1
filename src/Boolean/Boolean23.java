package Boolean;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        int b = a / 100;
        int d = a / 10 - b * 10;
        int c = a % 10;
        boolean w = b==c;
        System.out.print(w);
    }
}
