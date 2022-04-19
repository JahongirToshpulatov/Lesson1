package For;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 kg necha pul  = ");
        int a = sc.nextInt();
        for (double i = 0.1; i <= 1; i += 0.1) {
            System.out.println("  " + i * a + "   Som");

        }
    }
}
