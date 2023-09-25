package examples.example;

public class Employees {

    int id;
    String name;
    Address address;
    public Employees(int id,String name,Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void print(){
        System.out.println(id+" "+ name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Manassas","VA","USA");
        Employees emp = new Employees(1,"Brian",address1);
        emp.print();
    }
}
