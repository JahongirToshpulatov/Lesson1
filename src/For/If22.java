package For;

import java.util.Scanner;

public class If22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("X = ");
        int x = sc.nextInt();
        double fact = 1;
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += (Math.pow(x,i) / fact);
            System.out.print(fact + "  ");
        }
        System.out.print("Sum = " + sum);


    }
}
