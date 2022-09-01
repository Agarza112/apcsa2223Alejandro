package apcsaLessons2022;

public class Java4_RelationalComparisonOperators
{
    public static void main(String[] args)
    {
        /*
        //RELATIONAL/COMPARISON OPERATORS

        All relational operators return Boolean(true or false)
            Description             Operator
                >                   Greater than
                >=                  Greater than or equal
                <                   less than
                <=                  less than or equal
                ==                  Equal
                !=                  Not equal
         */
        System.out.println(6<3);
        System.out.println(6>3);
        System.out.println(6<=3);
        System.out.println(6>=3);
        System.out.println(6==3);
        System.out.println(3==3);
        System.out.println(6!=3);

        int b;
        b=2;
        int a = 2;


        System.out.println("fist number is greater than second number " + (b>=a));

        /*
            LOGICAL OPERATORS

            Operator    Description
                &&          Bitwise Logical AND
                !!          Bitwise Logical Inclusive OR
                ^           Bitwise Logical Exclusive OR
         */

        System.out.println(true&&true);  // true
        System.out.println(true&&false); // false
        System.out.println(false&&true); // false
        System.out.println(false&&false);// false

        System.out.println(true||true);  // true
        System.out.println(true||false); // true
        System.out.println(false||true); // true
        System.out.println(false||false);// false
        // ^ if both con
        System.out.println(true^true);  // false
        System.out.println(true^false); // true
        System.out.println(false^true); // true
        System.out.println(false^false);// false

        System.out.println(!true); // false exclamation mark turns return to false vv.

        /*
          Order of Precedence           Operators                   Description
                1                   -(unary negation)!
                2                         * / %
                3                          + -
                4                        < > <= >=
                5                         == !=
                6                          &&
                7                          ||
                8                    = += -= *= /= %=


         */
    }
}
