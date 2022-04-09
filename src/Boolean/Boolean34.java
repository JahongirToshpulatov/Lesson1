package Boolean;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a=sc.nextInt();
        System.out.print("B = ");
        int b=sc.nextInt();
        boolean d=(a+b)%2==1;
        System.out.print(d);
    }
}
