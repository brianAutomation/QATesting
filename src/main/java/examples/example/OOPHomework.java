package examples.example;

public class OOPHomework {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar("Yamaha","C40","Classical Guitar",169.99);
        Guitar guitar2 = new Guitar("Epiphone","SG","Electric Guitar",329.99);
        Guitar guitar3 = new Guitar("Rogue","RA-090","Acoustic Electric",89.99);

        guitar1.print();
        guitar2.print();
        guitar3.print();

        Strings strings1 = new Strings("Elixir","Extra Light","Bronze",29.99);
        Strings strings2 = new Strings("D'Addario","EJ16-12P","Bronze",79.99);

        strings1.printmore();
        strings2.printmore();

    }
}

 class Guitar{

    String Make;

    String Model;

    String Type;

    double Price;

    public Guitar (String Make,String Model,String Type, double Price){
        this.Make = Make;
        this.Model = Model;
        this.Type = Type;
        this.Price = Price;
     }

     public void print(){
         System.out.println("Guitar Make: " + Make);
         System.out.println("Guitar Model: " + Model);
         System.out.println("Guitar Type: " + Type);
         System.out.println("Guitar price: " + Price);
     }

}

class Strings{
    String Brand;

    String Weight;

    String Material;

    double Price;

    public Strings (String Brand,String Weight,String Material,double Price){
        this.Brand = Brand;
        this.Weight = Weight;
        this.Material = Material;
        this.Price = Price;
    }

    public void printmore(){
        System.out.println("String Brand: " + Brand);
        System.out.println("String Weight: " + Weight);
        System.out.println("String Material: " + Material);
        System.out.println("String Price: " + Price);
    }

}


