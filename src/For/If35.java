package For;

import java.util.Scanner;

public class If35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        double sum = 0;
        double a = 1, b = 2, c=3;
        for (int i = 0; i < n; i++) {
            sum =c+b-2*a;
            System.out.println("  " + sum);
            b = sum;
            b=sum-b;

        }


    }
}
