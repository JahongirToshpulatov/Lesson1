package Case;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number = ");
        switch (scanner.nextInt()){
            case 1: System.out.println(" Bad");break;
            case 2: System.out.println(" Qoniqar sz");break;
            case 3: System.out.println(" Qoniqarli ");break;
            case 4: System.out.println(" Good");break;
            case 5: System.out.println(" The best");break;
        }
    }
}
