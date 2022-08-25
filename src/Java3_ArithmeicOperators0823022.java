package src;

public class Java3_ArithmeicOperators0823022 {
    //  If you need to change the class name
    //  you can not do it directly
    //  use refractor option right clicking the class
    public static void main(String[] args)
    {
        //ARITMETIC OPERATORS
// priority is just like the algebra +-*/%
//        OPERATOR      USE                 DESCRIPTION                 EXAMPLE
/*
             +          x+y                 adds c and y                3+7=10
             -          x-y                 subtract y and a            12-3=19
             *          x*y                 multiply x and y            3*4=12
             /          x/y                 divide x by y               12/4=3
             %          x%y                 remainder                   8%6=2
             -          -x                  arithmetically negates x    int a = 3 , -a = -3;
             ++         X++                 it increases the number by 1   a++
             --         --x                 it decreases th number by 1     a--
 */
        System.out.println(3+7);//10
        System.out.println(8-2);//6
        System.out.println(4*6);//24
        System.out.println(3*2.3);// if you using decimal result will contain decimals
        int a = 3;
        int b =5 ;
        double c = 3;
        double d = 5;

        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);  // it returns only whole number since it is whole number
        System.out.println(c/d);  // it returns decimal number since variations are double

        // CONCATINATOR
        // writing different data types within sout. if you put a string it won't be considered as arithmetic unless
        // you out math within pharanthesis
        System.out.println("collection of five and is"+5+3); // this does not do the math
        System.out.println("collection of five and three is"+a+b); // thi does not do the math
        System.out.println("collection of five and hree is"+"5"+"3"); // this line contains only string
        System.out.println("collection of five and three is"+(5+3));  // this is going to do the math within phar
        System.out.println("collection of five and three is"+(a+b));  // this is going to do the math within phar//
        System.out.println("c"+(a+b));  //  this is going to do the math within phar//
        System.out.println((5-2)+(4*7));    // java and arithmeic handles pharanthesis first.
        System.out.println(5*2.3);          // it will return a float number since it has a float number.
        int number = 3;
        System.out.println(number);
        System.out.println(++number);
        System.out.println(number++);
        System.out.println(number);

        int number2 = 7;
        System.out.println("number2 = " + number2); //7
        number2--; // 6
        System.out.println("number2 = " + number2); //6
        System.out.println(--number2); // 5
        System.out.println(number2--); // print but then will be 4
        System.out.println(number2);   // 4

        // CASTING
        // casting conerts data types one to another if it is possible
        double dd =1.3;
        System.out.println(dd);
        System.out.println((int)dd );

        // IMPLICIT CASTING
        double d1 = 3000; // 3000 is a whole number which isn but since data type is double it return as double
        long l = asdf;
        System.out.println(d1);
        System.out.println(l);

        // EXPLICIT CASTING
        double price = 200.55;
        System.out.println((int)price);

        // SHORTHAND OPERATOR
        int number3 =
        number3 = 5+5; //10
        number3=5; //number 3 = 5+5;

        int numberA = 33;
        System.out.println(numberA);
        numberA*=3;
        System.out.println(numberA);
        numberA/=3;
        System.out.println(numberA);
        numberA-=9;
        System.out.println(numberA);
        numberA%=3;
        System.out.println(numberA);
    }
}
