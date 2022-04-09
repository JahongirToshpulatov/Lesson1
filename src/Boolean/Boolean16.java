package Boolean;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        boolean d=a>9&&a<100&&a%2==0;
        System.out.print(d);
    }
}
