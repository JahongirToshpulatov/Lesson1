package For;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1  = ");
        int a = sc.nextInt();
        // System.out.print("Enter number2 = ");
        // int b=sc.nextInt();
        double sum = 0;
        for (double i = 1; i < a; i++) {
            sum += 1 / i;

        }
        System.out.print(sum);
    }
}
