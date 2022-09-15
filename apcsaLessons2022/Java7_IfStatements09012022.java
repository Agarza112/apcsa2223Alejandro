package apcsaLessons2022;

import java.util.Scanner;

public class Java7_IfStatements09012022
{
    public static void main(String[] args)
    {
        /*
        LOGICAL STATEMENTS
        The if statement evaluates a condition. If the condition evaluates to true, any statements
        in the code block are executed.

        KEYWORD
          if        CONDITION (MUST BE A BOOLEAN TRUE/FALSE)
          {
                OUTPUT COMMAND TO EXECUTE IF THE CONDITION IS TRUE
          }

         */


        /*
        Task
        Write in java program:
        1) Declare a variable and initialize user age.
        2) Then th program will show if the user is eligible to vote. A person who is eligible to
        vote must be older than or equal to 18 years old
         */

        System.out.println("enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        If(age>18);
        {
            System.out.println("you are able to vote");
        }
        {
            System.out.println("you are able to vote");
        }
        {
            System.out.println("you can not vote");
        }

        System.out.println("please enter 3 different number");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter first number ");
        int number1 = scanner1.nextInt();
        System.out.println("enter second number ");
        int number2 = scanner1.nextInt();
        System.out.println("enter third number");
        int number3 = scanner.nextInt();

        if(number1>number2){
            if(number1>number3)
                System.out.println("The highest number is"+number1);
        }
        if(number2>number1){
            if(number2>number3)
                System.out.println("The highest number is"+number2);
        }
        if(number3>number2){
            if(number3>number3)
                System.out.println("The highest number is"+number3);
        }

        System.out.println("enter 2 number to check if they are equal or not");
        int n1 = scanner1.nextInt();
        int n2= scanner1.nextInt();
        if(n1 == -n2)
        {
            System.out.println("they are equal");
        }
        else
        {
            System.out.println("thy are not");
        }
}

    private static void If(boolean b) {
    }
}
