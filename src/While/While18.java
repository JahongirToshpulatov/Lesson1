package While;

import java.util.Scanner;

public class While17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n=sc.nextInt();
        System.out.print("Enter M = ");
        int count=0;
        int m=sc.nextInt();
        while (m<n){
            n=n-m;
            count++;
        }
        System.out.println(count+" butun qismi");
        System.out.print(n+" Qoldiq");
    }
}
