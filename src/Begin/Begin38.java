package Begin;

import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("A = ");
        int a=ok.nextInt();
        System.out.print("B = ");
        int b=ok.nextInt();
        System.out.print("C = ");
        int c=ok.nextInt();
        double d=Math.sqrt(b*b-4*a*c);
        System.out.println("X1 = "+(-b+d)/(2*a));
        System.out.println("X2 = "+(-b-d)/(2*a));

    }
}
