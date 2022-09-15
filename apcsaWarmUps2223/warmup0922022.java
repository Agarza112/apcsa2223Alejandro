package apcsaWarmUps2223;

import java.util.Scanner;

public class warmup0922022
{
    public static void main(String[] args)
    {
        System.out.println("enter 3 numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("the minimum number of 3 entry is "+Math.min(Math.min(a,b),Math.min(b,c)));
    }
}
