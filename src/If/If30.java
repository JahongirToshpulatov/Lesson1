package If;

import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year = ");
        double x = scanner.nextInt();

        if (x>0&&x<9&&x%2==0){
            System.out.println("1 xonali"+"  Juft son");
        }else if (x>0&&x<9&&x%2==1){
            System.out.println("1 xonali"+"  Toq son");
        }else if (x>9&&x<100&&x%2==0) {
            System.out.println("2 Xonali "+" Juft son");
        }else if (x>9&&x<100&&x%2==1){
            System.out.println("2 Xonali son "+" Toq");
        }else if (x>99&&x<1000&&x%2==0){
            System.out.println("3 Xonali son "+" Juft ");
        }else if (x>99&&x<1000&&x%2==1)System.out.println("3 xonali "+" Toq");
        else System.out.println("Error");

    }

}