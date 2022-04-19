package For;

import java.util.Scanner;

public class If6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 kg necha pul  = ");
        int a = sc.nextInt();
        for (double i = 1.1; i <= 2; i += 0.1) {
            System.out.println("  " + i * a + "   $");

        }
    }
}
