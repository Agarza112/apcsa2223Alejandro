package apcsaProject2223;

import java.util.Scanner;

public class ProjectNumberConverter09152022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //write a java program that cna convert numbers between 0 ~ 9 to words,
        //if the number is greater than 9 or less than zero, out put should be "Invalid".

        System.out.println("Enter a numerical number that you would like to convert to text");
        int a = scanner.nextInt();

        if(a==1)
        {
            System.out.println("One");
        }

        else if(a==2)
        {
            System.out.println("Two");
        }
        else if(a==3)
        {
            System.out.println("Three");
        }
        else if(a==4)
        {
            System.out.println("Four");
        }
        else if(a==5)
        {
            System.out.println("Five");
        }
        else if(a==6)
        {
            System.out.println("Six");
        }
        else if(a==7)
        {
            System.out.println("Seven");
        }
        else if(a==8)
        {
            System.out.println("Eight");
        }
        else if(a==9)
        {
            System.out.println("Nine");
        }
        else if(a>1)
        {
            System.out.println("Invalid");
        }
        else if(a<9)
        {
            System.out.println("Invalid");
        }





    }
}
