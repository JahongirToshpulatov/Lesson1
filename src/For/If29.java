package For;

import java.util.Scanner;

public class If29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("Nechta bo'lakka bolsin =  ");
        int n = sc.nextInt();

        int d = (b - a) / n;
        for (int i = a; i < b; i += d) {

            System.out.print("  " + i);


        }

    }
}
