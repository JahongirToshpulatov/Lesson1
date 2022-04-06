package Begin;

import java.util.Scanner;

public class Begin25 {
    public static void main(String[] args){
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter an independent variable x = ");
        int x=ok.nextInt();
        double y=3*Math.pow(x,6)-6*Math.pow(x,2)-7;
        System.out.print(" Y = "+y);
    }
}
