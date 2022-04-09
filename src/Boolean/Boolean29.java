package Boolean;

import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X1 = ");
        int x1 = sc.nextInt();
        System.out.print("Enter Y1 = ");
        int y1 = sc.nextInt();
        System.out.print("Enter X2 = ");
        int x2=sc.nextInt();
        System.out.print("Enter Y2 = ");
        int y2=sc.nextInt();
        System.out.print("Enter X = ");
        int x = sc.nextInt();
        System.out.print("Enter Y = ");
        int y = sc.nextInt();
        boolean d=Math.abs(x1)<Math.abs(x)&&Math.abs(x2)>Math.abs(x)&&Math.abs(y1)<Math.abs(y)&&Math.abs(y2)>Math.abs(y);
        System.out.print(d);
    }
}
