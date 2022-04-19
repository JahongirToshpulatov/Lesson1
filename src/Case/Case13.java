

package Case;

import java.util.Date;
import java.util.Scanner;

public class Case12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r=5;
        switch (scanner.nextInt()) {
            case 1:System.out.println("R = "+r);break;
            case 2:System.out.println("R = "+2*r);break;
            case 3:System.out.println("R = "+2*Math.PI*r);break;
            case 4:System.out.println("R = "+3.14*Math.pow(r,2));break;
        }


    }


}
