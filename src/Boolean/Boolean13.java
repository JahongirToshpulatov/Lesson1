package Boolean;

import java.util.Scanner;

public class Boolean13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();
        System.out.print("Enter C = ");
        int c=sc.nextInt();
        boolean d=a>0||b>0||c>0;
        System.out.print(d);
    }
}
