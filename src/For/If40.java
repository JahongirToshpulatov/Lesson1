package For;

import java.util.Scanner;

public class If39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b=sc.nextInt();
        for (int i = a; a <=b ; a++) {
            for (int j = 0; j < a; j++) {
                System.out.print("  "+a+"  ");

            }

        }

    }
}
