package For;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N  = ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i - 1;

            System.out.println(sum);
        }


    }
}
