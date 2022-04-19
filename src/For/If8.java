package For;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1  = ");
        int a = sc.nextInt();
        System.out.print("Enter number2 = ");
        int b=sc.nextInt();
        int sum=1;
        for (double i = a; i < b; i ++) {
            sum*=i;

        } System.out.print(sum);
    }
}
