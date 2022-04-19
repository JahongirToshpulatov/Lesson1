package If;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = scanner.nextInt();
        System.out.print("Enter B = ");
        int b = scanner.nextInt();
        System.out.print("Enter C = ");
        int c = scanner.nextInt();

        if (a==b){
            System.out.println(3);
        }else if (b==c){
            System.out.println(1);
        }else if (c==a) System.out.println(2);
        else System.out.println("Error ");


    }
}