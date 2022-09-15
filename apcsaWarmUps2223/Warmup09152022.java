package apcsaWarmUps2223;

import java.util.Scanner;

public class Warmup09152022 {

    public static void main(String[] args)
    {
        System.out.println("1-7 enter a number for matching weekday");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a==1) System.out.println("Monday");
        if(a==2) System.out.println("Tuesday");
        if(a==3) System.out.println("Wednesday");
        if(a==4) System.out.println("Thursday");
        if(a==5) System.out.println("Friday");
        if(a==6) System.out.println("Saturday");
        if(a==7) System.out.println("Sunday");
        if(a<1) System.out.println("Invalid");
        if(a>7) System.out.println("Invalid");


    }
}

