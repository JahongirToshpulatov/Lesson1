package If;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        if (x > 2 && x < -2) System.out.println(2 * x);
        else System.out.println(-3 * x);


    }

}