package While;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();
        int count = 0;
        while (a > b) {
            a = a - b;
            count++;
        }
        System.out.println("count = "+count );
        System.out.println("Qoldiq = "+a);
    }
}
