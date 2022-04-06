package Integer;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter A= ");
        double a=ok.nextInt();
        System.out.print("Enter B= ");
        double b=ok.nextInt();
        System.out.print((double)(a/b*1.0)+" Times" );
    }
}
