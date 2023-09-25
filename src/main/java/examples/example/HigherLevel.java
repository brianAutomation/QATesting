package examples.example;

public class HigherLevel {
    String entity1;
    String entity2;
    String entity3;

    LowerLevel lowerLevel;

    public HigherLevel(String entity1, String entity2, String entity3, LowerLevel lowerLevel){
        this.entity1 = entity1;
        this.entity2 = entity2;
        this.entity3 = entity3;
        this.lowerLevel = lowerLevel;
    }

    public void print(){
        System.out.println(entity1 + ", "+ entity2 +" & " + entity3 );
        System.out.println("Possess: " + lowerLevel.subatomic1 + ", " +lowerLevel.subatomic2 + " & "+ lowerLevel.subatomic3);
    }

    public static void main(String[] args) {
        LowerLevel lowerLevel1 = new LowerLevel("Electrons","Neutrons","Quarks");
        HigherLevel hi = new HigherLevel("Humans","Dogs","Cats",lowerLevel1);

        hi.print();

    }
}
