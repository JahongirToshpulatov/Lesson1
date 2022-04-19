package While;

import java.util.Scanner;

public class While27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        int a = 1, b = 1, sum = 0, i=0;
        while (n > sum) {
            i++;
            sum = a + b;
            a = b;
            b = sum;

        }
        System.out.println(i);
    }

}
