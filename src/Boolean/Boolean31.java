package Boolean;

import java.util.Scanner;

public class Boolean31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" A = ");
        int a=sc.nextInt();
        System.out.print("B = ");
        int b=sc.nextInt();
        System.out.print("C = ");
        int c=sc.nextInt();
        boolean d=(a==b||b==c)&&((a<b+c)&&(b<a+c)&&(c<a+b));
        System.out.print(d);
    }
}
