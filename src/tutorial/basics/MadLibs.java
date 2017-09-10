package tutorial.basics;

import java.util.Scanner;

public class MadLibs {
    public static void main(String ... args) {
        runMadLibs();
    }

    static void runMadLibs() {

        // Gotta use a loop
        // Have a field that requires me to enter one of a set list of items, eg: enter allowed pet; cat/dog/rat/duck

        // How to compare strings
        // Use .equals
        String nameFromUser =getUserInput();

        if(nameFromUser.equals("steve")) {
            //do stuff
        } else if(nameFromUser.equals("bob")) {

        } else {

        }

        /*
        We went on a camping trip and took __ number of items, they were "___","___","___",..."___",
         */

    }

    static int getNumberFromUser() {
        return new Scanner(System.in).nextInt();
    }

    static String getUserInput() {
        return new Scanner(System.in).nextLine();
    }
}
