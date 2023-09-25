package examples.example;

import java.util.Scanner;
import java.util.Arrays;

import static examples.example.HomeWork2.*;


public class HomeWork {
    public static void main(String[] args) {
    //reverse();
    //philosophy();
    // evenorodd();
    // First50Primes();
    //factorial();
        // Fibonacciseries(20);
   // mycircumference();
   // square();
   //   withinRange();
    // minmaxArray();
   // sortIntArray();
    //  primeNumbers();
        //factorialsagain();
        fibseriesOnceMore();

    }


    public static void reverse (){
        int[] a = {1,2,3,4};
        int i = 3;
        while(i > -1){
            System.out.println(a[i]);
            i--;
        }
    }


    public static void philosophy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int position = scanner.nextInt();

        switch (position){
            case 1:
                System.out.println("theism");
                break;
            case 2:
                System.out.println("atheism");
                break;
            case 3:
                System.out.println("agnosticism");
            default:
                System.out.println("enter a valid number");
        }
    }

    // question 1 - even or odd
    public static void evenorodd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = scanner.nextInt();

        if(n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }


    }

    // #quest 2 - first 50 prime numbers

    public static void First50Primes() {
        int count = 0;

        for (int number = 2; count < 50; number++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= number; i++) { //this is to see if there are any integers other than 1 and number that number is divisible by
                if (number % i == 0) { // if number modulus i (the current iterated value) is zero then it's not prime
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
        }
    }

    // harsh's way
    public static void primeNumbers (){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter first number: ");
       int start = scanner.nextInt();
       System.out.println("Enter end number");
       int end = scanner.nextInt();

       System.out.println("List the prime numbers between" + start + "&" + end + "is: ");

       for(int i = start; i <= end; i++){
           if(isPrime(i)){
               System.out.println(i);
           }
       }


    }

    // count how many numbers between a range of prime numbers


    // question 3 - find the factorial of a given number using a loop

    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is " + factorial);
    }

    // # question 4 - print fibonacci series up to 20 - n = the sum of the previous 2 numbers
    static void Fibonacciseries(int n) {
        int prev = 0;
        int curr = 1;
        System.out.print(prev + " " + curr);

        for (int i =2; i < n; i++) {
            int next = prev + curr;
            System.out.print(" " + next);

            prev = curr;
            curr = next;
        }
    }

    //Harsh's way

    public static void FibSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }


    //#question 5 - Calculate the Area and circumference of a Circle

    public static void mycircumference(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double r = radius * radius;

        double area = Math.PI * r;
        double circumference = 2 * Math.PI * r;

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
    } // int r = radius * radius

// Harsh's way

public static void circumference(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            double circumference = HomeWork2.calculateCircumference(radius);
            System.out.println("the circumference of the circle is: " + circumference);

            scanner.close();
}

    //#question 6 - square root of number

    public static void square(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double squareRoot = Math.sqrt(number);

        System.out.println("Square root of " + number + " is " + squareRoot);
    }

    // #question 7 - Generate and print a random number within a range

    public static void withinRange(){
        int min = 32;
        int max = 80065;

        int randomNumber = min + (int) (Math.random() * (max - min + 1)); //This is necessary because when you multiply by Math.random(), you want the range to be inclusive of both the minimum and maximum values.

        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }

    //#question 8 - ???

    //#question 14 - min max array

    public static void minmaxArray(){
        int[] arr = { 732, 9, -3, 12, 1 };
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { // if arr[i] (current iterated element) is greater than the current max, then max is updated to arr[i]
                max = arr[i];
            }
            if (arr[i] < min) { // if arr[i] (current iterated element) is less than the current min, then min is updated to arr[i]
                min = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    //#question 15 -

    public static void sortIntArray() {
        int[] arr = { 76, 21, -9, -200, 1 };
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        // if control statements would be used here
        }
    }

    // Create a program that capitalizes the first letter of each word in a sentence
// Harsh's way
    public static void capatilize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        String CapitalSentence = HomeWork2.CapitalFirstLetter(sentence);
        System.out.println("Capital first letter: "+ CapitalSentence);
    }

    public static void factorialsagain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = scanner.nextInt();

        int factorial = 1;
        for(int i = 1; i <= num1; i++){
            factorial *= i;
        }
        System.out.println("The factorials of " + num1 + "is" + factorial);
    }

    public static void fibseriesOnceMore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int terms = scanner.nextInt();

        int prev = 0;
        int current = 1;
        int fibCount = 2; // Starting with 2 terms (0 and 1).
        int next;

        if (terms == 0) {
            System.out.println("The Fibonacci series up to 0 terms is: "); // Special case for 0 terms.
        } else {
            System.out.print("The Fibonacci series up to the " + terms + " term is: " + prev + ", " + current);

            while (fibCount < terms) {
                next = prev + current;
                System.out.print(", " + next);
                prev = current;
                current = next;
                fibCount++;
            }
            System.out.println(); // Add a newline after printing the series.
        }
    }

}
