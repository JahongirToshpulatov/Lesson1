package Begin;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        System.out.print(" enter the edge a of a cube = ");
        int a = ok.nextInt();
        System.out.println(" the volume is " + Math.pow(a,3));

        System.out.println("The surface is "+6*Math.pow(a,2));
    }
}