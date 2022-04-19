package If;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = scanner.nextInt();
        System.out.print("Enter B = ");
        int b = scanner.nextInt();
        System.out.print("Enter C = ");
        int c=scanner.nextInt();
        if (a>b&&b>c) System.out.println(b);
        else if (a>b&&b<c){
            if (a>c)System.out.println(c);
            else System.out.println(c);
        }else if (b>a&&a>c)System.out.println(a);
        else if (b>a&&a<c){
            if (b>c)System.out.println(c);
            else System.out.println(b);
        }else if (c>b&&b>a)System.out.println(b);
        else if (c>b&&b<a){
            if (c>a)System.out.println(a);
            else System.out.println(c);
        }

    }
}