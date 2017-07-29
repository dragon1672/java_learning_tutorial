package tutorial.basics;

public class B_BasicVars {
    public static void main(String ... args) {
        System.out.println("Lets creates some variables");

        int integer = 42;

        float floatyMcFloatFace = 3.14f;

        double doubleTheFloating = 3.14159;

        System.out.println("Strings are made with double quotes wrapping them. But you can also put a quote in a string like \" that.");
        // the '\' character is used for 'escaping' character

        System.out.println("You can have \"quotes\" and \\slashes\\ all you want if you escape them");

        // you can create strings by concatenating them, even with other variables types (they will get auto converted to strings)

        String allTheNumbers = "All my numbers are " + integer + " and " + floatyMcFloatFace + " and " + doubleTheFloating;

        //println can also take variables
        System.out.println(allTheNumbers);

        System.out.println("My the best number is");
        System.out.println(integer);
    }
}
