package apcsaProject2223;

import java.util.Scanner;

public class ProjectLeapYear09152022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  year to find leap year");
        int year = scanner.nextInt();

        if(year%4==0){
            System.out.println("is a leap year");
        }
        else{
            System.out.println("is not a leap year");
        }
    }
}
