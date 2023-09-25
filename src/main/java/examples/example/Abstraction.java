package examples.example;

//OOP in Java
//abstraction
//A class which is declared with the abstract keyword is known as abstract class in java
//Abstract class can have abstract and non-abstract methods

public class Abstraction {
    public static void main(String[] args) {
        Shapes sphere = new sphere();
        Shapes rectangle = new Rectangle();

        sphere.draw();
        rectangle.draw();
    }
}

abstract class Shapes{
    abstract void draw();
}

class sphere extends Shapes{
    @Override
    void draw() {
        System.out.println("drawing a sphere");
    }
}
class Rectangle extends Shapes{
    @Override
    void draw() {
        System.out.println("drawing a rectangle");
    }
}