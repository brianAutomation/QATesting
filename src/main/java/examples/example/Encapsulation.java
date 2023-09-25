package examples.example;
//OOP Concept
//Encapsulation

//What is Encapsulation?
//Encapsulation in java is a process of wrapping java code or data into another bigger unit or a single unit.
//As the name suggests it is like a capsule. One capsule could have many different
//medicines in it

//getter and setter methods are used in Encapsulation
//by these getter and setter methods we can make a class read-only or write only class
//we can have control over the data flow by this. By skipping either getter or setter method
//this is a way to hide data as another class will no longer have access to the data and private numbers

//Encapsulated class is the easiest to test in unit testing

import java.security.PublicKey;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("Brian",30);
        person.DisplayInfo();

        person.setName("Patrick");
        person.setAge(32);
        person.DisplayInfo();

        person.getName();
        person.getAge();

    }
}
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void DisplayInfo(){
        System.out.println("name: "+ name + ", Age: "+ age);
    }

}