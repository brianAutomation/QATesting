package examples.example;

//overloading
// the instance "converter" is being shared across the various method names

public class MethodOverloading {
    public static void main(String[] args) {

        Converter converter = new Converter();
        double meters = 5;
        double feet = 10;
        double celsius = 25;
        double fahrenheit = 70;

        double centimeters = converter.convertToCentimeters(meters);
        System.out.println(meters+" Meters is: "+ centimeters + " Centimeters");

        double metersFromFeet = converter.convertToMeters(feet);
        System.out.println(feet + " feet is: " + metersFromFeet + " meters");

        double fahrenheitConverted = converter.convertToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is: " + fahrenheitConverted + "fahrenheit");

        double celsiusConverted = converter.convertToCelscius(fahrenheit);
        System.out.println(fahrenheit + " fahrenheit is: " + celsiusConverted + " celsius");
    }
}

class Converter{
    double convertToCentimeters(double meters){
        return meters * 100;
    }

    double convertToMeters(double feet){
        return feet * 0.3048;
    }

    double convertToFahrenheit(double celsius){
        return(celsius * 9/5) + 32;
    }

    double convertToCelscius(double fahrenheit){
        return(fahrenheit -32)* 5/9;
    }
}
