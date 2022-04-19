package For;

import java.util.Scanner;

public class If31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n=sc.nextInt();
        double sum=0;
        double d = 2;
        for (int i = 0; i < n; i++) {
            sum += 2 + 1 / d;
            d = sum;
        }

        System.out.print("Sum = " + sum + "  ");


    }
}
