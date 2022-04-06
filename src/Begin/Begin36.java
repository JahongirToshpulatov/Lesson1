package Begin;

import java.util.Scanner;

public class Begin36 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter boat km/h = ");
        int v=ok.nextInt();
        System.out.print("Enter water km/h = ");
        int v1=ok.nextInt();
        System.out.print("Enter time1 = ");
        int t1=ok.nextInt();
        System.out.print((v+v1)*t1);
    }
}
