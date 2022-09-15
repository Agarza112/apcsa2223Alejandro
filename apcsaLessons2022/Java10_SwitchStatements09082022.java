package apcsaLessons2022;

public class Java10_SwitchStatements09082022
{
    public static void main(String[] args)
    {
        //  Switch statement can be used for Limited case it is defined by an expression which can be
        //  string boolean or integer here t is how we will use

        int h = 0;
        switch (h)
        {
            case 1:
                System.out.println("it is number1");
                break;
            case 2:
                System.out.println("it is number2");
                break;
            case 3:
                System.out.println("it is number3");
                break;
            default:
                System.out.println("default case");

        }
    }
}
