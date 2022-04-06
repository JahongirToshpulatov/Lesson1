package Begin;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print(" enter the first number = ");
        int a=ok.nextInt();
        System.out.print("enter the second number = ");
        int b=ok.nextInt();
        System.out.println(" The sum is "+a+b );
        System.out.println(" the difference is "+(a-b));
        System.out.println("Product is "+ a* b);
        System.out.println(" the quotient of their squares is "+ a/ b);
    }
}
