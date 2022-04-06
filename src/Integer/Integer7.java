package Integer;

import java.util.Scanner;

public class Integer7 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter number = ");
        int a=ok.nextInt();
        int q=a/10;
        int s=a%10;
        System.out.print(s+q);
    }
}
