package examples.example;

// circle class is aggregating from Operation class - this is a HAS-A relation - it HAS A
// relation with Operation class

public class Aggregation {
    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);

    }
}

class Operation{
    int square(int a){
        return a*a;
    }
}
class Circle{
    Operation o;
    double pi = 3.14;

    double area(int radius){
        o = new Operation();
        int rsquare = o.square(radius); //classname.methodname
        return pi*rsquare;
    }
}

//Create a class called Address with city, state, and country -- just create class and constructor
//Create method as employee which will have id name adress - which will come from address class
//pass Address addresss as a property to Employee class as argument
//public Employee(int id, String name, Address address){}
//print at least 1 employee with all the details