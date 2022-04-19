package While;

import java.util.Scanner;

public class While11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int n = sc.nextInt();
        int k = 1, count=0, sum=0;
        while (sum <= n) {
            k+=1;
            sum+=+k;

        }
        System.out.println("Sum = "+sum);
        System.out.println(k-1);

    }
}
