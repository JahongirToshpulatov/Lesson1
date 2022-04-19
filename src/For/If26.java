package For;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("X = ");
        int x = sc.nextInt();
        double fact = 1;
        double sum = 0;
        for (int i = 1; i <=n; i++) {
            sum+=Math.pow(x,2*i+1)/i*Math.pow(i,2*i+1);

        }System.out.print(sum);


    }
}
