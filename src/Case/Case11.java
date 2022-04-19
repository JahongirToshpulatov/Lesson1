

package Case;

import java.util.Scanner;

public class Case10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kochish = ");
        switch (scanner.nextInt()){
            case 1:System.out.println("Shimol");break;
            case 2:System.out.println("Janub");break;
            case 3:System.out.println("Sharq");break;
            case 4:System.out.println("G'arb");break;
        }
        System.out.print("Enter kamanda = ");
        switch (scanner.nextInt()){
            case 0:System.out.println("Keep going ");break;
            case 1:System.out.println("left ");break;
            case 2:System.out.println("right ");break;
        }




    }


}
