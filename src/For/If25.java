package For;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("X = ");
        int x = sc.nextInt();
        double fact = 1;
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            fact *= 2 * i ;
            sum += (Math.pow(x, 2 * i ) / fact) * Math.pow(-1, i);
            System.out.print(fact + "  ");
        }
        System.out.print("Sum = " + sum);


    }
}
