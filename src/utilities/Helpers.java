package utilities;

import java.util.Collection;
import java.util.stream.Collectors;

public class Helpers {

    public static <T> String collectionToString(Collection<T> collection) {
        String str = collection.stream().map(Object::toString).collect(Collectors.joining(", "));
        return String.format("[%s]",str);
    }

    public static <T> void printCollection(Collection<T> collection) {
        System.out.println(collectionToString(collection));
    }
}
