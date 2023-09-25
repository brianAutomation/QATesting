package examples.example;

//in Java Wrapper classes are used to convert primitive data types into objects and vice a versa
//so that it could be used in java OOP

// in this example class Integer is used to wrap a primitive int and then
//unwrapped back into primitive.

public class WrapperInJava {
    public static void main(String[] args) {
        int premitiveInt = 42;
        Integer wrappedInt = Integer.valueOf((premitiveInt));


        int unwrappedInt = wrappedInt.intValue();

        System.out.println("Premitive int: " + premitiveInt);
        System.out.println("Wrapped Int: " + wrappedInt);
        System.out.println("unWrappaed Int: " + unwrappedInt);
        System.out.println("this is a string of int: " + wrappedInt.toString());
        System.out.println(wrappedInt.getClass().getName());
    }
}
