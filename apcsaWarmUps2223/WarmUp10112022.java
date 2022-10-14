package apcsaWarmUps2223;

import java.util.Scanner;

public class WarmUp10112022
{
    public static void main(String[] args)
    {
        //. write a program that can ask the user "enter a number" five times and return the maximum number
        //hint: you will need for loop and if statement

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int[] arr = {a,b,c,d,e};
        for(int i = 0 ; i<arr.length ; i++)
            int max = a;
        {
            if(arr)[i]>max)
            {
                max=arr[i];
                }
        }
        System.out.println("max "+ max);

    }
}
