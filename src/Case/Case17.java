

package Case;

import java.util.Scanner;

public class Case16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age=scanner.nextInt();
        switch (age/10) {
            case 1:
                System.out.print("O'n  ");
                break;
            case 2:
                System.out.print("Yigirma  ");
                break;
            case 3:
                System.out.print("Ottiz  ");
                break;
            case 4:
                System.out.println("qirq  ");
                break;
            case 5:
                System.out.print("Ellek  ");
                break;
            case 6:
                System.out.print("Otmish  ");
                break;
            case 7:
                System.out.print("Yetmis  ");
                break;
            case 8:
                System.out.print("Sakso  ");
                break;
            case 9:
                System.out.print("Toqson  ");
                break;

        }


        switch (age%10) {
            case 1:
                System.out.print("bir  ");
                break;
            case 2:
                System.out.print("ikki  ");
                break;
            case 3:
                System.out.print("Uch  ");
                break;
            case 4:
                System.out.println("tort  ");
                break;
            case 5:
                System.out.print("fesh  ");
                break;
            case 6:
                System.out.print("Olti  ");
                break;
            case 7:
                System.out.print("Yetti  ");
                break;
            case 8:
                System.out.print("Sakkiz  ");
                break;
            case 9:
                System.out.print("Toqqiz  ");
                break;

        }

    }


}
