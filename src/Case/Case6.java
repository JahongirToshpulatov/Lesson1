
package Case;

import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Enter amal = ");
        switch (scanner.nextInt()){
            case 1: System.out.print(a/10);break;
            case 2: System.out.print(a*100);break;
            case 3: System.out.print(a);break;
            case 4: System.out.print(a/1000);break;
            case 5: System.out.print(a/100);break;
        }

    }


}
