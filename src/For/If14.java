package For;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N  = ");
        int n = sc.nextInt();
        double t = 0;
        for (double i = 1; i < n; i++) {
            t += (1 + i / 10) * Math.pow(-1, i + 1);


        }
        System.out.println(t);


    }
}
