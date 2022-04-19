package While;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A = ");
        int a=sc.nextInt();
        System.out.print("Enter B = ");
        int b=sc.nextInt();
        while (a>b){
            a=a-b;
        }
        System.out.println(a);
    }
}
