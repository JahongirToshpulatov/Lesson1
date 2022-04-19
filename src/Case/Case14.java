

package Case;

import java.util.Scanner;

public class Case14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=4;
        switch (scanner.nextInt()){
            case 1:System.out.println("Tomon = "+a);break;
            case 2:System.out.println("Ichki chizilhan aylana radiusi = "+a*Math.sqrt(12));break;
            case 3:System.out.println("Tashqi chizilgan aylana radiuse = "+a*Math.sqrt(12)*2);break;
            case 4:System.out.println("Yuza = "+a*a*Math.sqrt(3)/4);break;
        }


    }


}
