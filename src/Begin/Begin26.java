package Begin;

import java.util.Scanner;

public class Begin26 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter an independent variable x = ");
        int x=ok.nextInt();
        double y=4*Math.pow(x-3,6)-7*Math.pow(x-3,3)+2;
        System.out.print(" Y = "+y);
    }
}
