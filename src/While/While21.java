package While;

import java.util.Scanner;

public class While20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int sum=0, count=0, d=0;
        int n=sc.nextInt();
        while (n>=1){
            d=n%10;
            if (d==2){
                count++;
            }else
            sum+=d;
            n=n/10;
        } if (count>=1) System.out.println("Yes");
        else  System.out.println("No");

    }
}
