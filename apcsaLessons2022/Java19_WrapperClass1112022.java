package apcsaLessons2022;

public class Java19_WrapperClass1112022
{
    public static void main(String[] args)
    {

/*
    // WRAPPER CLASS
    wrapper class is dedicated to its primitives (int byte long short boolean double)
    wrapper class names stats with capital letter
    every primitive has its own wrapper class
    wrapper class is different then primitives since they are objects.

    PRIMITIVES(default values)                WRAPPER CLASS(default names)
    byte           0                          Bye                null
    short          0.0                        Short              null
    long           0                          Long               null
    float          0                          float              null
    double         0                          double             null
    boolean        false                      boolean            null
    char           ' '                        char               null
 */


        // Boxing and AutoBoxing
        // if you convert primitive to wrapper it is autoboxing/boxin
        int a = 3;
        Integer b = a;

        // Unboxing
        // if you assign/convert wrapper to primitive it is unboxing
        Character c = 'A';
        char c2 = c; //  unboxing

        // you can convert a double to an integer but you cannot convert a Double to Integer
        // since wrapper class is dedicated to its primitives.
        int d = 3;
        double e = d;

        Integer f = 3;
        //Double g =f; // since wrapper class is dedicated to its primitives

        // WRAPPER CLASS METHODS
        int maxNumberOfGivenTwoInt = Integer.max(3,6);
        int maxNumberOfIntClass = Integer.MAX_VALUE;
        System.out.println(maxNumberOfIntClass);
        System.out.println(Integer.MIN_VALUE;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.sum(5,8));
        System.out.println(Integer.hashCode(6));

        String str = "123";
        int number = 123;

        System.out.println(Integer.toString(123));
        System.out.println(Integer.valueOf(str));
        System.out.println(String.valueOf(123));
        System.out.println(Integer.parseInt(str)+123);
        double p =3.9;
        double k = (int)p;
        System.out.println(k);



    }
}
