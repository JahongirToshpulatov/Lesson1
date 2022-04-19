package For;

import java.util.Scanner;

public class If36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("K = ");
        int k = sc.nextInt();
        int sum = 0, d=1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=k; j++) {
                d*=j;

            } sum+=d;

        }
        System.out.println("Sum = "+sum);



    }
}
