package Integer;

import java.util.Scanner;

public class Integer12 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter number = ");
        int a=ok.nextInt();
        int s=a%100;
        int t=s%10;
        System.out.print(t);
        System.out.print(s/10);
        System.out.print(a/100);

    }
}
