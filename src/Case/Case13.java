

package Case;

import java.util.Scanner;

public class Case13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=4;
        switch (scanner.nextInt()){
            case 1:System.out.println("Katet = "+a);break;
            case 2:System.out.println("Gipotuniza = "+a*Math.sqrt(2));break;
            case 3:System.out.println("Blandlik = "+a/Math.sqrt(2));break;
            case 4:System.out.println("Yuza = "+a/Math.sqrt(2)*a/Math.sqrt(2)/2);break;
        }


    }


}
