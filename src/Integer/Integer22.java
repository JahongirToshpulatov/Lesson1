package Integer;

import java.util.Scanner;

public class Integer22 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter seconds = ");
        double s=ok.nextInt();
        double m=  (s/3600);
        System.out.print(m+" Hours ");
        System.out.print(s-m*3600+" Second");
    }
}
