package For;

import java.util.Scanner;

public class If23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("X = ");
        int x = sc.nextInt();
        double fact = 1;
        double sum = 1;
        for (int i = 0; i <= n; i++) {
            fact *= 2 * i + 1;
            sum += (Math.pow(x, 2 * i + 1) / fact) * Math.pow(-1, i);
            System.out.print(fact + "  ");
        }
        System.out.print("Sum = " + sum);


    }
}
