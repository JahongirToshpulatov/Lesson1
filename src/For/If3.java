package For;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1  = ");
        int a=sc.nextInt();
        System.out.print("Enter number2 = ");
        int b=sc.nextInt();
        for (int i = b; i >=a ; i--) {
            System.out.print("  "+i);

        }
    }
}
