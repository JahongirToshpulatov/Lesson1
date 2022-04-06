package Begin;

import java.util.Scanner;

public class Begin21 {
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
        System.out.print("Enter C1 = ");
        int c1=ok.nextInt();
        System.out.print("Enter C2 = ");
        int c2=ok.nextInt();
        int p=((x1-x2)+(y2-y1)+(c1-c2))/2;
        System.out.print(Math.sqrt(p*(p-(x1-x2)*(p-(y2-y1)*(p-(c1-c2))))));
    }
}
