package While;

import java.util.Scanner;

public class While19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int sum=0, count=0, d=0;
        int n=sc.nextInt();
        while (n>=1){
            count++;
            d=n%10;
            sum+=d;
            System.out.print(d+"  ");
            n=n/10;
        }
        System.out.println("Raqmlari yigindisi = "+sum);
        System.out.println("Count = "+count);

    }
}
