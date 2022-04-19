package Best_of_Best;

import java.util.Scanner;

public class Best_of_Best1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N = ");
        int n=sc.nextInt();
        boolean d=n%4==0||n==1;
        System.out.println(d);
    }
}
