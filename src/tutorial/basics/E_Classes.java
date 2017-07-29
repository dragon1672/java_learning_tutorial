package tutorial.basics;

import tutorial.basics.e_classes.Human;
import tutorial.basics.e_classes.Person;
import tutorial.basics.e_classes.SimpleClass;

public class E_Classes {
    public static void main(String ... args) {
        // Java is known as an Object Oriented language.

        /*
        Some terminology
            class: the template for creating an instance
            instance: a var created from a class
            static: globally accessible/exists regardless of classes
         */

        // We have already been in a class, but just sticking in a static method
        // To create a class you call it's constructor
        SimpleClass simpleClass = new SimpleClass();
        // Lets create a class with state
        Human human = new Human();
        human.age = 42;
        human.name = "Billy Jean";

        // Classes an also have functions and do stuff
        Person person = new Person(10, "Jack");
        person.getOlder();
        person.sayName();
        //since person has private fields we can't access the name/age field
        // This code won't even compile, because this class doesn't have access to that field
        //person.age = 100;
    }
}
