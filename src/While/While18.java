package While;

import java.util.Scanner;

public class While18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n=sc.nextInt();
        while (n>=1){
            System.out.print(n%10+"  ");
            n=n/10;
        }

    }
}
