package Begin;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args){
        Scanner ok=new Scanner(System.in);
        System.out.print("A = ");
        int a=ok.nextInt();
        System.out.print("B = ");
        int b=ok.nextInt();
        System.out.print("C = ");
        int c=ok.nextInt();
        int d=c;
        c=b; b=a; a=d;
        System.out.println(" C =  "+c);
        System.out.println(" B =  "+b);
        System.out.println("A = "+a);
}
}
