package examples.example;

public class InheritanceHomeWork {
    public static void main(String[] args) {
        Necessities necs = new Necessities();
        int totalexpenses = necs.rent + necs.utili + necs.park + necs.nec;
        System.out.println(totalexpenses);
    }

}

class Rent{

    int rent = 1500;

}

class Utilities extends Rent{
    int utili = 150;
}

class ParkingPass extends Utilities{
    int park = 10;
}

class Necessities extends ParkingPass{
    int nec = 1000;
}

// Hierarchical


