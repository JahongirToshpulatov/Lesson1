package Begin;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.println("Enter A = ");
        int a=ok.nextInt();
        System.out.println("A2 = "+Math.pow(a,2));
        System.out.println("A3 = "+Math.pow(a,3));
        System.out.println("A5 = "+Math.pow(a,5));
        System.out.println("A10 = "+Math.pow(a,10));
        System.out.println("A15 = "+Math.pow(a,15));
    }
}
