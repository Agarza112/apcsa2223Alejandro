package apcsaProject2223;

package Week11;

public class ProjectFactorial102022 {
    public static void main(String[] args)
    {
        // write a program that can return the factorial number of any given number
        //            Ex:
        //                input: 5
        //                output: 120
        //
        //            because:
        //                5! = 5 * 4 * 3 * 2* 1 = 120

        int number = 5;
        int factorial = 1;
        for(int i =1;i;i++)
        {
            System.out.println(i);
            factorial=factorial*i;
            System.out.println("factorial = "+factorial);
        }
        System.out.println(factorial);

    }
}