package For;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("A = ");
        int a = sc.nextInt();
        int sum = 0;
        double p=0;
        for (int i = 0; i < n; i++) {
            p=Math.pow(a,i)*Math.pow(-1,i);
            if (n<p) break;
            sum+=p;
            System.out.print("  "+p+"  ");

        }
        System.out.print("Sum =   " + sum);


    }
}
