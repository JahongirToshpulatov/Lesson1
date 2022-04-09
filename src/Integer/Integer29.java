package Integer;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter A = ");
        int a=ok.nextInt();
        System.out.print("Enter B = ");
        int b=ok.nextInt();
        System.out.print("Enter C = ");
        int c=ok.nextInt();
        System.out.println("squares placed = "+ a*b/Math.pow(c,2));
        System.out.print("Unused part = "+(a*b-a*b/c));

    }
}

