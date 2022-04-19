package For;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int fact = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            fact *= i;
            sum += fact;
            System.out.print(fact + "  ");
        }
        System.out.print("Sum = " + sum);


    }
}
