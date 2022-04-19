package While;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        while (a>3){
            a=a-3;

            }if (a==3){
            System.out.println("3 ning darajasi ");

        }else System.out.print("3 ning darajasi emas");
    }
}
