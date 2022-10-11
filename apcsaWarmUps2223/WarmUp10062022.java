package apcsaWarmUps2223;

public class WarmUp10062022
{
    public static void main(String[] args) {
        String str = "abcdabcd";
        String currentLetter = "";
        //write a program that can remove duplicated characters from a string
       // then this means the letter has no dublication.

        System.out.println(str.indexOf("a")==str.lastIndexOf("a"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        String str2 = String.valueOf(str.charAt(str.lastIndexOf("a")));
        System.out.println(str.replace(String.valueOf(str.charAt(str.lastIndexOf("a")))));
        String str3 = str;
        for(int i = 0 ; i<str.length();i++)

            String currentLetter = String.valueOf(str.charAt(i));

        if(str.indexOf(currentLetter)!=str.lastIndexOf(currentLetter));
        {


        }
    }
}
