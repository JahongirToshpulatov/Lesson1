package For;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        double fact=1;
        double sum=1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
            sum+=(1/fact);
            System.out.print(fact+"  ");
        } System.out.print("Sum = "+sum);


    }
}
