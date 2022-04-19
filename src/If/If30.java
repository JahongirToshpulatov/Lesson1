package If;

import java.util.Scanner;

public class If29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year = ");
        double x = scanner.nextInt();
        if (x > 0) {
            System.out.println("Positive number ");
            if (x%2==1) System.out.println("even number");
            else System.out.println("Odd number ");

        }else if (x<0)System.out.println("Negative number");
        else if (x%2==1)System.out.println(" Even number ");
        else System.out.println("Odd number");

        if (x==0) System.out.println(0);



    }

}