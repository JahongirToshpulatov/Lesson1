package While;

import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d=10 ,p=20, count=0;
        while (d<200){
            d+=d*0.2;
            count++;
        }

        System.out.println(count+"  Days");
        System.out.println(d+" Km");
    }
}
