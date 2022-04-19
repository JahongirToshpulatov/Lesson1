package While;

import java.util.Scanner;

public class While23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();

        int sum = 0, d = 1;
        while (a > d) {
            d++;
            if (a % d == 0 && b % d == 0) {
                sum = d;
            } else ;
        }
        System.out.println(sum);


    }

}
