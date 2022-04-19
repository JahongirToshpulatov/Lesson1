package For;

import java.util.Scanner;

public class If16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n=sc.nextInt();
        System.out.print("A = ");
        int a=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (n<Math.pow(a,i)) break;
            System.out.print("  "+Math.pow(a,i));

        }


    }
}
