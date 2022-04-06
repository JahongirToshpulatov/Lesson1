package Begin;

import java.util.Scanner;

public class Begin15 {
        public static void main(String[] args) {
            Scanner ok=new Scanner(System.in);
            System.out.print(" enter L = ");
            int a=ok.nextInt();

            System.out.println(" R = "+ a/6.28);
            System.out.println("S = "+3.14*Math.pow(a/6.28,2));
        }

}