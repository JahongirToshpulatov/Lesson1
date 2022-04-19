package While;

import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Prize = ");
        int a = sc.nextInt();
        double d=2*a,p=20, count=0;
        while (a<=d){
            a+=a*0.2;
            count++;
        }

        System.out.println(count+"  Moths");
    }
}
