package While;

import java.util.Scanner;

public class While13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int n = sc.nextInt();
        double k = 1, count=0, sum=0;
        while (sum <= n) {
            k+=1;
            sum+=1/k;

        }
        System.out.println("Sum = "+sum);
        System.out.println("K = "+k);

    }
}
