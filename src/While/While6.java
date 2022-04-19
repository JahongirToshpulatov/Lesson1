package While;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        int count = 0;
        while (a >= 2) {
            count++;
            a = a / 2;

        }
        System.out.print(count);
    }
}
