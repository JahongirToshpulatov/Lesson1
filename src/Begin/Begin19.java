package Begin;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args){
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter X1 = ");
        int x1=ok.nextInt();
        System.out.print("Enter X2 = ");
        int x2=ok.nextInt();
        System.out.print("Enter Y1 = ");
        int y1=ok.nextInt();
        System.out.print("Enter Y2 = ");
        int y2=ok.nextInt();
        System.out.print(Math.abs(x1-x2)*Math.abs(y2-y1));
    }
}
