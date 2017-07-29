package tutorial.basics;

import utilities.Helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_BasicCollections {
    public static void main(String... args) {
        // Collections are awesome, they can store multiple of a type

        // Lists are the most common
        // They store values based off an index (position) in the list
        List<String> myStringList = Arrays.asList("first", "second", "third");

        // You can get items from that list by calling "get"

        String theFirstElement = myStringList.get(0); // the index starts at 0

        System.out.println(theFirstElement);

        // If you try and get an item that isn't in the list it will crash the program
        String goodLuck = myStringList.get(102);
        // Pro tip: you can comment out anything!
        // int badVar = "bad Code";

        System.out.println("Some of the other properties on a list might help");
        System.out.println("like the size of the list: "+myStringList.size());
        System.out.println("checking if it contains 'first' "+myStringList.contains("first"));
        System.out.println("checking if it contains 'billy jean' "+myStringList.contains("billy jean"));

        System.out.println("if you print out a list it doesn't look pretty :(");
        System.out.println(myStringList);

        System.out.println("Use a helper function I made: "+ Helpers.collectionToString(myStringList));

        // or just use the print method
        Helpers.printCollection(myStringList);

        List<Integer> coolestNumbers = new ArrayList<>(); // you can also 'build' and manipulate a list
        coolestNumbers.add(102);
        coolestNumbers.add(42);
        Helpers.printCollection(coolestNumbers);
        coolestNumbers.remove(0); // this takes in an index, so it will remove the first element
        Helpers.printCollection(coolestNumbers);
    }
}
