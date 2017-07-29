package tutorial.basics.e_classes;

// Classes can hold onto state
public class Person {
    // private means other classes can't touch these vars, only this class. This helps separate concerns.
    //
    private int age;
    private String name;

    public Person(int age, String name) {
        // this.age is the var named age on the class, without the 'this.' it is referring to the age passed as a parameter
        this.age = age;
        this.name = name;
    }

    public void getOlder() {
        age++;
        System.out.println("I used to be a young guy like you, now I'm " + age);
    }

    public void sayName() {
        System.out.println("Hello world, my name is "+name+" the "+age+" year old");
    }
}
