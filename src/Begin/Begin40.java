package Begin;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("A1 = ");
        int a=ok.nextInt();
        System.out.print("B1 = ");
        int b=ok.nextInt();
        System.out.print("C1 = ");
        int c=ok.nextInt();
        System.out.print("A2 = ");
        int a2=ok.nextInt();
        System.out.print("B2 = ");
        int b2=ok.nextInt();
        System.out.print("C2 = ");
        int c2=ok.nextInt();
        int d=a*b2-a2*b;

        System.out.println("X = "+(c*b2-c2*b)/d);
        System.out.println("X = "+(a*c2-a2*c)/d);
    }
}
