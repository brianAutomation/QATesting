package PracticeJAVA;

import org.apache.commons.math3.stat.descriptive.summary.Sum;
import org.apache.poi.ddf.EscherChildAnchorRecord;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.devtools.v85.systeminfo.SystemInfo;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionalStatementExercises {
    public static void main(String[] args) {
        //oddOrEven();
        //greatestNumber();
        //sameORDiff();
        //IncreDecreNeither();
        //upToTwoDecimals();
        //NegZeroPos();
        //MultiTable();
        //divisionTable();
        //SumOfOddNumbers();
        //SumOdd();
        //evenSUM();
        //AverageOfThree();
        //mulitTableAgain();
        //SumOddForLoop();
        //evenSumBetween();
        oddSumBetween();
    }


    public static boolean oddOrEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
            return true;
        } else {
            System.out.println(num + " is an odd number");
            return false;
        }

    }


    public static int greatestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Value 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Value 3: ");
        int num3 = scanner.nextInt();

        int max = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        }
        if (num2 > num1 && num2 > num3) {
            max = num2;
        }
        if (num3 > num1 && num3 > num2) {
            max = num3;
        }
        System.out.println(max + " is the greatest number");
        return max;
    }

    public static void sameORDiff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double x = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double y = scanner.nextDouble();

        x = Math.round(x * 10000);
        x = x / 10000;

        y = Math.round(y * 10000);
        y = y / 10000;

        if (x == y) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }

    }

    public static void IncreDecreNeither() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter third number: ");
        double num3 = scanner.nextDouble();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        }
        if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing");
        }
    }

    public static void upToTwoDecimals() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's see if these two numbers are identical ...");
        System.out.println("Enter first floating point number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second floating point number: ");
        double num2 = scanner.nextDouble();

        num1 = Math.round(num1 * 100);
        num1 = num1 / 100;

        num2 = Math.round(num2 * 100);
        num2 = num2 / 100;

        if (num1 == num2) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different you ungrateful bitch!");
        }
    }

    public static void NegZeroPos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        }
        if (num < 0) {
            System.out.println("Negative");
        }
        if (num == 0) {
            System.out.println("Zero");
        }
    }

    public static void MultiTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number of terms: ");
        int num2 = scanner.nextInt();

        System.out.println("Multiplication Table for: " + num1 + "up to " + num2);

        for (int i = 1; i <= num2; i++) {
            int result = num1 * i;
            System.out.println(num1 + " x " + i + " = " + result);
        }


    }

    public static void divisionTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Number of terms: ");
        int num2 = scanner.nextInt();

        for (int i = 1; i <= num2; i++) {
            double result = num1 * i;
            System.out.println(num1 + " / " + i + " = " + result);

        }
    }

    public static void mulitTableAgain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter number of terms: ");
        int num2 = scanner.nextInt();

        System.out.println("Multiplication Table for: " + num1 + "up to: " + num2);

        for(int i = 1; i <= num2; i++){
            double result = num1 * i;
            System.out.println(num1 + " x " + i + " = " + result);
        }
    }


    public static void SumOddWhileLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int terms = scanner.nextInt();

        int odd = 1;
        int oddSum = 0;
        int count = 0;
        while (count < terms){
            oddSum = oddSum + odd;
            odd = odd + 2;
            count++;
        }
        System.out.println("The sum of the first " + terms + " odd natural numbers is: " + oddSum);
    }

    public static void SumOddForLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int terms = scanner.nextInt();

        int odd = 1;
        int count = 0;
        int oddSum = 0;
        for(int i = count; i < terms; i++){
            oddSum = oddSum + odd;
            odd = odd + 2;
            count++;
        }
        System.out.println("The sum of the first " + terms + " odd natural numbers is: " + oddSum);
    }

    public static void evenSUM (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int terms = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int even = 2;

        System.out.println("These are the first " + terms + " even numbers: ");
        while (count < terms){
            System.out.println(even + " ");
            sum = sum + even;
            even = even + 2;
            count++;
        }
        System.out.println("The sum of the first " + terms + " natural numbers is: " + sum);
    }

        public static void AverageOfThree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        int average = (num1 + num2 + num3)/3;
        System.out.println("The average value is: " + average);
    }

    public static int evenSumBetween() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first even number: ");
        int start = scanner.nextInt();
        System.out.println("Enter second even number: ");
        int end = scanner.nextInt();

        if (start % 2 != 0) {
            System.out.println("enter an even number");
            return 0;
        } if (end % 2 != 0) {
            return 0;
        }

        int evenSum = 0;
        for (int i = start; i < end; i+= 2) {
            evenSum = evenSum += i;
        }
        System.out.println("The sum of even numbers between " + start + " and " + end + " is: " + evenSum);
        return evenSum;
    }



    public static int oddSumBetween(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first odd number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second odd number: ");
        int num2 = scanner.nextInt();

        if(num1 % 2 == 0 || num2 % 2 == 0){
            System.out.println("Please enter odd numbers");
            return 0;
        }

//        int oddSum = 0;
//        for (int i = num1; i < num2; i+= 2){
//            oddSum = oddSum += i;
//        }

        int oddSum = 0;
        int current = num1;
        while(current < num2){
            oddSum += current;
            current+= 2;
        }

        System.out.println("The sum of even numbers between " + num1 + " and " + num2 + " is: " + oddSum);
        return oddSum;
    }


}



