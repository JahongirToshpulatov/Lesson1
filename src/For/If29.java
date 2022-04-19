package For;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("X = ");
        int x = sc.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(-1,i)*(2 * i - 3) * Math.pow(x, i) / ((2 * i));

        }
        System.out.print(sum);


    }
}
