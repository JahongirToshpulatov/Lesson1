package Boolean;

import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();
        System.out.print("Enter C = ");
        int c = sc.nextInt();
        double d=Math.pow(b,2)-4*a*c;
        System.out.print(d>=0);
    }
}
