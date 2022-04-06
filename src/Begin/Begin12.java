package Begin;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print(" enter the side of triangle  = ");
        int a=ok.nextInt();
        System.out.print("enter the side of triangle  = ");
        int b=ok.nextInt();
        System.out.println(" The Gipotuniza  is "+Math.sqrt(Math.pow(a,2)+b*b) );
        System.out.println(" the perimeter P of the triangle  is "+(a+b+Math.sqrt(Math.pow(a,2)+b*b)));
}
}