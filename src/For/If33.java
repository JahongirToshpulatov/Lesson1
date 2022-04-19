package For;

import java.util.Scanner;

public class If33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int sum = 0;
        int a = 1, b = 1;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            System.out.println("  " + sum);
            a = b;
            b = sum;

        }


    }
}
