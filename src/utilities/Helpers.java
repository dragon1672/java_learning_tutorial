package utilities;

import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Helpers {

    public static <T> String collectionToString(Collection<T> collection) {
        String str = collection.stream().map(Object::toString).collect(Collectors.joining(", "));
        return String.format("[%s]",str);
    }

    public static <T> void printCollection(Collection<T> collection) {
        System.out.println(collectionToString(collection));
    }

    public static int readIntFromUser() {
        return new Scanner(System.in).nextInt();
    }

    public static String readStringFromUser() {
        return new Scanner(System.in).next();
    }

    public static int readCharFromUser() {
        String userString = readStringFromUser();
        assert userString.length() == 1;
        return userString.charAt(0);
    }
}
