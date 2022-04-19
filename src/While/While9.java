package While;

import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int n = sc.nextInt();
        int k = 0;
        while (k * k < n) {
            k += 1;
        }
        System.out.println(k-1);

    }
}
