package Integer;

import java.net.SocketOption;
import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter seconds = ");
        int k=ok.nextInt();
        System.out.print("Enter N = ");
        int n=ok.nextInt();
        int s=(k+n)%7;
        System.out.print(s);

    }
}

