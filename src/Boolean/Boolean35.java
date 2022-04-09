package Boolean;

import java.util.Scanner;

public class Boolean35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X1 = ");
        int x1=sc.nextInt();
        System.out.print("Y1 = ");
        int y1=sc.nextInt();
        System.out.print("X2 = ");
        int x2=sc.nextInt();
        System.out.print("Y2 = ");
        int y2=sc.nextInt();
        boolean d=(x1+y1)%2==1&&((x2+y2)%2==1);
        System.out.print(d);
    }
}
