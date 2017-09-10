package tutorial.basics;

import java.util.Scanner;

public class D_FunctionTime {
    public static void main(String ... args) {
        // functions allow you to reuse code and make everything easier to read
        // functions have 3 main parts, a return type, a name, and parameters
        // Lets make a basic calculator

        int a = 100;
        int b = 23;

        int sum = add(a,b);


        System.out.println(sum);
    }

    // ignore the private static bit for now
    static int add(int a, int b) {
        // You are free to make things complicated if you want.
        return sub(a, b * -1);
    }

    /**
     * This is known as a Java Doc, it is the official way to document a method, Right here you should have what the method does.
     * "subtracts 2 numbers"
     * @param a (Here you place a description of the parameter) the first number to subtract from
     * @param b the number to subtract
     * @return (now explain what is being returned) a minus b
     */
    static int sub(int a, int b) {
        return a - b;
    }
}
