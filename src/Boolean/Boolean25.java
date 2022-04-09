package Boolean;

import java.util.Scanner;

public class Boolean25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X = ");
        int a = sc.nextInt();
        System.out.print("Enter Y = ");
        int b = sc.nextInt();
        boolean d=a<0&&b>0;
        System.out.print(d);
    }
}
