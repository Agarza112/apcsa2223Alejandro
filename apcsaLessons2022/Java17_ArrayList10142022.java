package apcsaLessons2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Java17_ArrayList10142022
{
    public static void main(String[] args)

    {
        // ARRAYLISTS
        // presented in java util class.
        // is an ordered collection of values
        // ArrayList is dynamic size arrays. so you do not have to specify
        // we can add and remove arrays to form arraylist
        // arraylist does not support primitives it only stores object

        // DECLARATION
        ArrayList<String> arrlist = new ArrayList<>();
        // or
        ArrayList<String> arrlist2 = new ArrayList<String>();
        // or
        ArrayList<String> list10 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        // ARRAYLIST METHODS

        // ADD
        arrlist.add("Kristian");
        arrlist.add("Alejandro");
        arrlist.add("Nathaniel");
        System.out.println(arrlist);

        // GET
        System.out.println(arrlist.get(1));

        // SIZE
        System.out.println(arrlist.size());

        // CLEAR
        //clears the array and removes all the values
        arrlist.clear();
        System.out.println(arrlist);

        // SET
        arrlist.add(0, "Trent");
        System.out.println(arrlist);
        arrlist.set(0,"Christopher");
        System.out.println(arrlist);

        // CONTAINS
        System.out.println(arrlist.contains("Christopher"));
        System.out.println(arrlist.contains("Trent"));

        // EQUALS METHOD you will check if two arraylist are the same or not
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b","c"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("a","b","c"));
        System.out.println(arr1.equals(arr2)); // this will return true
        System.out.println(arrlist.equals(arr2)); // this will return false

        // REMOVE METHOD
        System.out.println(arr1);
        arr1.remove("b");
        System.out.println(arr1);

        // INDEX METHOD
        System.out.println(arr2.indexOf("c"));
        System.out.println(arr1.indexOf("c"));

        // LAST INDEX OF
        arr2.add("4");
        arr2.add("5");
        arr2.add("6");
        arr2.add("a");
        System.out.println(arr2.lastIndexOf("a"));
        System.out.println(arr2.indexOf("a"));

        //Empty checks if the list is empty
        System.out.println(arr2.isEmpty());
        arr2.clear();
        System.out.println(arr2.isEmpty());


    }
}
