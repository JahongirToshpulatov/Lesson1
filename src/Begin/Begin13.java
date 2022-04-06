package Begin;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print(" enter R1   = ");
        int r1=ok.nextInt();
        System.out.print("enter R2   = ");
        int r2=ok.nextInt();
        System.out.println(3.14*r1*r1 );
        System.out.println(" "+3.14*r2*r2);
        int i = r1 * r1 - r2 * r2;
        System.out.println(3.14*i);

    }
}
