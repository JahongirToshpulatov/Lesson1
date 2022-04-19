package If;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year = ");
        double x = scanner.nextInt();
        if (x%4==0&&x%400==0)System.out.println(365+" days");
        else System.out.print(366+" days");



    }

}