package PracticeJAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        //charAtIndex();
        //numberOfChar();
        //numberOfNumbers();
        //numberOfEvenNumbersBetween();
        numberOfOddNumbersBetween();
    }

    public static void charAtIndex(){
        String str = "I wonder if UFOS exist";
        char chartAtindex = str.charAt(0);
        System.out.println(chartAtindex + " is the character at index 1");
    }

    public static void numberOfChar(){
        String str = "Hopefully we can overcome this";
        System.out.println(str.length());
    }

    public static void numberOfNumbers(){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr.length);
    }

    public static void numberOfEvenNumbersBetween(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int start = scanner.nextInt();
        System.out.println("Enter ending number: ");
        int end = scanner.nextInt();

        List<Integer> evenNumbers = new ArrayList<>();

        int evenCount = 0;
        int currentNumber = start;

        while (currentNumber <= end){
            if (currentNumber % 2 == 0){
                evenCount++;
                evenNumbers.add(currentNumber);
            }
            currentNumber++;
        }
        System.out.println("There are " + evenCount + " even numbers between" + start + " and " + end);
        System.out.println("These are the even numbers between the two ranges: "+ evenNumbers);
    }

    public static void numberOfOddNumbersBetween(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int start = scanner.nextInt();
        System.out.println("Enter second number: ");
        int end = scanner.nextInt();

        List<Integer> oddNumbers = new ArrayList<>();

        int count = 0;
        int currentNumber = start;

        while (currentNumber <= end){
            if(currentNumber % 2 == 1){
                count++;
                oddNumbers.add(currentNumber);
            }
            currentNumber++;
        }
        System.out.println("There are " + count + " odd numbers between " + start + "and " + end);
        System.out.println("These are the odd numbers between these ranges: " + oddNumbers);
    }

}
