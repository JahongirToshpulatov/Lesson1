package Begin;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args){
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter The first number = ");
        int a=ok.nextInt();
        System.out.print("Enter the second number = ");
        int b=ok.nextInt();
        int c=b;
        b=a;
        a=c;
        System.out.println(" the second number =  "+a);
        System.out.println(" the first number =  "+b);

    }
}
