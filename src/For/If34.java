package For;

import java.util.Scanner;

public class If34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        double sum = 0;
        double a = 1, b = 2;
        for (int i = 0; i < n; i++) {
            sum = (a + 2 * b) / 3;
            System.out.println("  " + sum);
            a = b;
            b = sum;

        }


    }
}
