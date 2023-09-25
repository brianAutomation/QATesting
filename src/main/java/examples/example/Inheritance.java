package examples.example;

//OOP Concept of Inheritance
//What is inheritance??
//inheritance in java is a system in which one object gets all the properties and
//behaviours of the parent
//You can create multiple classes upon existing classes.
//hierarchical vs multi level inheritance

//IS-A relation - the example in this file is an IS-A inheritance - this IS a child of A parent
//HAS-A relation - AGGREGATION -  HAS a relation

import jdk.nio.mapmode.ExtendedMapMode;

public class Inheritance {
    public static void main(String[] args) {



        Plane plane = new Plane();
        plane.start();

        Boat boat = new Boat();
        boat.start();

        Developer hr = new Developer();
        int totalsalary = hr.Basesalary + hr.bonus + hr.salary *2;
        System.out.println(totalsalary);

    }
}

class Vehicle{

    public void start(){
        System.out.println("Engine is started");
    }
}
class Plane extends Vehicle{ // this is a child of the parent class Vehicle and it inherits all of it's properties
    public void start(){
        System.out.println("Plane engine is starting");
    }
}
class Boat extends Vehicle{
    public void start(){
        System.out.println("Boat engine is starting");
    }
}

class Employee{
  int Basesalary = 10000;

}
class HR extends Employee{
  int bonus = 5000;

}

class Developer extends HR{
    int salary = 100000;
}

class QA extends HR{
    int salary = 90000;
}
class ManualQA extends QA{
    int salary = 50000;
}



