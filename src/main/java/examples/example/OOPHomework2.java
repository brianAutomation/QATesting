package examples.example;

public class OOPHomework2 {
    public static void main(String[] args) {
    Laptops laptops1 = new Laptops("Macbook","Pro 13",2023,1299.99);
    Laptops laptops2 = new Laptops("Dell","XPS 13",2023,1099.99);

    laptops1.printthis();
    laptops2.printthis();


    }
}

class Laptops{
    String Make;
    String Model;
    int Year;
    double Price;

        public Laptops(String Make, String Model, int Year, double Price) {
            this.Make = Make;
            this.Model = Model;
            this.Year = Year;
            this.Price = Price;
        }

        public void printthis(){
                System.out.println("Laptop Make: " + Make);
                System.out.println("Laptop Model: " + Model);
                System.out.println("Laptop Year: " + Year);
                System.out.println("Laptop Price: " + Price);
        }
}




