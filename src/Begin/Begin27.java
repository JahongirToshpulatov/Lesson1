package Begin;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.println("Enter A = ");
        int a=ok.nextInt();
        System.out.println("A2 = "+Math.pow(a,2));
        System.out.println("A4 = "+Math.pow(a,4));
        System.out.println("A8 = "+Math.pow(a,8));
    }
}
