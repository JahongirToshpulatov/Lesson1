package While;

import java.util.Scanner;

public class While24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        int a = 1, b = 1, sum = 0;
        while (n > sum) {
            sum = a + b;
            a = b;
            b = sum;


        }
        if (sum == n) {
            System.out.println("Fibanachi number");
        } else System.out.println("No fibonachi number");


    }

}
