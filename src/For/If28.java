package For;

import java.util.Scanner;

public class If27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("X = ");
        int x = sc.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (2 * i - 1) * Math.pow(x, 2 * i + 1) / ((2 * i) * (2 * i + 1));

        }
        System.out.print(sum);


    }
}
