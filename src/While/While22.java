package While;

import java.util.Scanner;

public class While22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n=sc.nextInt();
        int sum=0, count=0, d=1;
        while (n>sum){
            d+=1;
            if (n%d==0){
                count++;
            }else ;
            sum++;

        }
        if (count>=2)System.out.println("Tub emas");
        else System.out.println("Tub ");

    }
}
