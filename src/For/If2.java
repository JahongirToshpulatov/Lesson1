package For;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1  = ");
        int a=sc.nextInt();
        System.out.print("Enter number2 = ");
        int b=sc.nextInt();
        for (int i = a; i <=b ; i++) {
            System.out.print("  "+i);

        }
    }
}
