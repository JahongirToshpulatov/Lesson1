package Begin;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print(" Enter a Fahrenheit temperature = ");
        int t=ok.nextInt();
        System.out.print("The Fahrenheit temperature TF is"+(t-32)*5/9);
    }
}
