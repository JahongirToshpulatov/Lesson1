package Begin;

import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print(" enter the radius R of a circle = ");
        int a=ok.nextInt();
        System.out.println(" the length L of the circumference is "+2*3.14*a );
        System.out.println("the area S of the circle is "+3.14*Math.pow(a,2));
    }
}
