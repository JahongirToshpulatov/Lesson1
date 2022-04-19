package While;

import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int n = sc.nextInt();
        int k = 1, count=0;
        while (3*k < n) {
            count++;
            k *= 3;
        }
        System.out.println(count);

    }
}
