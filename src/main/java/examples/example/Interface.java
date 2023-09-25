package examples.example;

public class Interface {
    public static void main(String[] args) {
        Printable document = new Document("this is my Resume");
        Printable image = new Image("/Path/to/image/image.jpeg");

        document.print();
        image.print();
    }

}

//Interface representing a printable object
interface Printable{
    void print();
}

//Concrete class representing a document
class Document implements Printable{
    private String content;
    public Document(String content){
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Print a document: \n" + content);
    }
}

class Image implements Printable{
    private String ImagePath;
    public Image(String ImagePath){
        this.ImagePath = ImagePath;
    }

    @Override
    public void print() {
        System.out.println("Printing image: " + ImagePath);
        //logic to send the for printer via wifi
    }
}