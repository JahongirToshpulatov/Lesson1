package Begin;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args){
        Scanner ok=new Scanner(System.in);
        System.out.print(" A  = ");
        int a=ok.nextInt();
        System.out.print("B = ");
        int b=ok.nextInt();
        System.out.print("C = ");
        int c=ok.nextInt();
        System.out.println(Math.abs(a*c-b*c));
    }
}
