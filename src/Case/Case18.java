

package Case;

import java.util.Scanner;

public class Case18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age=scanner.nextInt();
        switch (age/100) {
            case 1:
                System.out.print("Bir yuzi  ");
                break;
            case 2:
                System.out.print("Ikki yuzi  ");
                break;
            case 3:
                System.out.print("Uch yuzi  ");
                break;
            case 4:
                System.out.println("Tort yuzi  ");
                break;
            case 5:
                System.out.print("Besh yuzi  ");
                break;
            case 6:
                System.out.print("Olti yuzi  ");
                break;
            case 7:
                System.out.print("Yeti yuzi  ");
                break;
            case 8:
                System.out.print("Sakkiz yuzi  ");
                break;
            case 9:
                System.out.print("Toqqiz yuzi  ");
                break;

        }

        int a=age/100;
        int d=age/10;

        switch (d-a*10) {
            case 1:
                System.out.print("On  ");
                break;
            case 2:
                System.out.print("Yigizma   ");
                break;
            case 3:
                System.out.print("ottiz  ");
                break;
            case 4:
                System.out.println("qirq  ");
                break;
            case 5:
                System.out.print("ellik  ");
                break;
            case 6:
                System.out.print("Oltmish  ");
                break;
            case 7:
                System.out.print("Yetmish  ");
                break;
            case 8:
                System.out.print("Sakson  ");
                break;
            case 9:
                System.out.print("Toqson  ");
                break;

        } switch (age%10){
            case 1:
                System.out.print("bi  ");
                break;
            case 2:
                System.out.print("ikki   ");
                break;
            case 3:
                System.out.print("uch  ");
                break;
            case 4:
                System.out.println("tort  ");
                break;
            case 5:
                System.out.print("besh  ");
                break;
            case 6:
                System.out.print("Olti  ");
                break;
            case 7:
                System.out.print("Yetti  ");
                break;
            case 8:
                System.out.print("Sakiz  ");
                break;
            case 9:
                System.out.print("Toqiz  ");
                break;
        }

    }


}
