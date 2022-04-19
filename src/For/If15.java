package For;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N  = ");
        int n = sc.nextInt();
        System.out.print(" A = ");
        int a = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= a;


        }
        System.out.println(sum);


    }
}
