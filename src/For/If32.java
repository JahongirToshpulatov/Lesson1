package For;

import java.util.Scanner;

public class If31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        double sum = 1;
        double a = 0;
        for (int i = 0; i < n; i++) {

            sum += 1 / sum;
            a = sum;


        }
        System.out.println(sum);

    }
}
