package Begin;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner ok=new Scanner(System.in);
        System.out.print("Enter kg = ");
        int a=ok.nextInt();
        System.out.print("Enter cost = ");
        int cost=ok.nextInt();
        System.out.println(" 1 kg sweet is "+cost/a +" $ " );
        System.out.print(" How much you need = ");
        int need=ok.nextInt();
        System.out.print(need*cost/a+" $ ");

    }
}
