package apcsaProject2223;

import java.util.Scanner;

public class ProjectMonthConverer09152022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get the month and days in it");
        int a = scanner.nextInt();

        if(a==1) System.out.println("January,31");
        if(a==2) System.out.println("February,28/29");
        if(a==3) System.out.println("March,31");
        if(a==4) System.out.println("April,30");
        if(a==5) System.out.println("May,31");
        if(a==6) System.out.println("June,30");
        if(a==7) System.out.println("July,31");
        if(a==8) System.out.println("August,31");
        if(a==9) System.out.println("September,30");
        if(a==10) System.out.println("October,31");
        if(a==11) System.out.println("November,30");
        if(a==12) System.out.println("December,31");


    }

}
