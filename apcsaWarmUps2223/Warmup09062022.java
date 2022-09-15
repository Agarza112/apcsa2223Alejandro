package apcsaWarmUps2223;

import java.util.Scanner;

public class Warmup09062022 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number grade did the test receive?");
        int grade = scanner.nextInt();

        if(grade < 60)
        {
            System.out.println("Fail");
        }

        if(grade >= 60 && grade < 90)
        {
            System.out.println("Pass");
        }

        if(grade >= 90) {
            System.out.println("Passed with Distinction");
        }
    }
}

