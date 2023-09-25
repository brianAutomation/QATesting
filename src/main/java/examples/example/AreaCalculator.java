package examples.example;

//Overloading = method names are the same, but parameters are different

//Class's ability to have multiple methods with the same name but different parameters

public class AreaCalculator {

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        double rectangleArea = calculator.calculateArea(5.0,10.0);
        System.out.println("Area of rectangle is: "+ rectangleArea);

        double circleArea = calculator.calculateArea(3);
        System.out.println("area of circle is: " + circleArea);

        double triangleArea = calculator.calculateArea(6,10,true);
        System.out.println("Area of a triangle is: " + triangleArea);

        double invalid = calculator.calculateArea(0,0,false);
        if(invalid == 0){
            System.out.println("can not calculate area");
        }
    }



    double calculateArea(double length,double width){
        if (length != width) {
            return length * width;
        }else {
            return 0;
        }
    }

    double calculateArea(double radius){
        double radiusSquare = radius * radius;
        return Math.PI * radiusSquare;
    }

    double calculateArea(double base,double height,boolean isTriangle){
        if(isTriangle){
            return 0.5 * base * height ;
        }else {
            return 0; // invalid choice
        }
    }

}
