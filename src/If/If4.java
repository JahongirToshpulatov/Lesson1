package If;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = scanner.nextInt();
        if (number > 0) System.out.print(number + 1);
        else if(number<0) System.out.print(number-2);
        else System.out.print(" 10 ");
    }
}
