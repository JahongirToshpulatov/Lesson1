package Integer;

import java.util.Scanner;

public class Integer26 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter seconds = ");
        int k=ok.nextInt();
        int s=(k+1)%7;
        System.out.print(s);

    }
}
