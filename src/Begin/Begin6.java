package Begin;

import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        System.out.print(" enter A = ");
        int a = ok.nextInt();
        System.out.print(" enter B = ");
        int b = ok.nextInt();
        System.out.print(" enter C = ");
        int c = ok.nextInt();
        System.out.println(" The volume  is "+ a*b*c );
        System.out.println("the surface area is "+2*(a*b+b*c+c*b));
    }
}