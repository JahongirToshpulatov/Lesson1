
package Case;

import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int b=scanner.nextInt();
        System.out.print("Enter amal = ");
        switch (scanner.nextInt()){
            case 1: System.out.print(a+b);break;
            case 2: System.out.print(a-b);break;
            case 3: System.out.print(a/b);break;
            case 4: System.out.print(a*b);break;
        }

    }


}
