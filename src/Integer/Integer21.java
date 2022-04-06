package Integer;

import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        System.out.print("Enter seconds = ");
        double s = ok.nextInt();
        int m = (int) (s / 60);
        System.out.print(m + " minut ");
        System.out.print(s - m * 60 + " Second");
    }
}
