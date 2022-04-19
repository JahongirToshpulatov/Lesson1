package For;

import java.util.Scanner;

public class If32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        double sum=0;
        double d = 1;
        for (int i = 1; i <= n; i++) {
            sum = (d + 1) / i;
            d = sum;
            sum+=sum;
        }

        System.out.print("Sum = " + sum + "  ");

    }
}
