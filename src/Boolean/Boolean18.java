package Boolean;

import java.util.Scanner;

public class Boolean18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b=sc.nextInt();
        System.out.print("Enter C = ");
        int c=sc.nextInt();
        boolean d=a==b||b==c||c==a;
        System.out.print(d);
    }
}
