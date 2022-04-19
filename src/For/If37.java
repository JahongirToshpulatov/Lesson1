package For;

import java.util.Scanner;

public class If37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int sum = 0, d = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                d *= i;

            }
            sum += d;

            d = 1;
        }
        System.out.println("Sum = " + sum);


    }
}
