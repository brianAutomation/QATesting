package examples.example;

//1. Inheritance
//2. Polymorphism
//3. Abstraction
//4. Encapsulation

// ->> Terms used in OOP
// - Coupling
//Cohesion
//Association
//Aggregation
//Composition

// Levels of OOP
//Object
//Class
//Inheritance
//Polymorphism
//Abstraction
//Encapsulation

// What is an Object?
//Any entity that has a STATE (properties) and behavior is known as object
// Table, chair, pen, keyboard, mice, etc.
// it can be physical or logical
// An object can be defined as an instance of a class - shareable copy of a class
// An object takes an address and space on memory -- even when empty

//Class?
// collection of objects is called a class
// objects take arguments
//A class can also be defined as a map/blueprint from which we can create
// individual objects. NEW is a keyword
// Class does not have an address or take memory
// A class can contain:
// field
// methods - can change the state or behavior of an object
// Constructors
// Blocks of code
// Nested class and interfaces

// Constructor
//in java a constructor is a special kind of method. It is used to initialize objects of a class
// Constructors are called automatic when an object is created and is also
// responsible for setting initial values of the object's attributes or performing necessary
// setup. Constructors have same name as the class they belong to and do not have a return value
// and are not void either.





class OOPConcepts {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2023);
        Car car2 = new Car("Honda","CRV",2023);

        car1.print();
        car2.print();
    }
}

class Car{ // global variables
    // instance of variables
    String Make;
    String Model;
    int Year;

    //Constructor
    public Car(String make,String Model,int Year){
        this.Make = make;
        this.Model = Model;
        this.Year = Year;
    }
//methods
    public void print(){
        System.out.println("car make: " + Make);
        System.out.println("car model: " + Model);
        System.out.println("car year: " + Year);
    }
}

// book, name of author, year it was released
