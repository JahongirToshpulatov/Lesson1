package For;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("X = ");
        int x = sc.nextInt();
        double fact = 1;
        double sum = 0;
        for (int i = 1; i <=n; i++) {
            sum+=Math.pow(x,i)/i*Math.pow(i,i-1);

        }System.out.print(sum);


    }
}
