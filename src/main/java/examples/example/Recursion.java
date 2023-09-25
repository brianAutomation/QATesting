package examples.example;

import java.util.Scanner;

import static examples.example.HomeWork2.fibonacci;

//What is recursion - method calling itself to solve a problem
public class Recursion {

    public static int factorials(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorials(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorials(number);
        System.out.println("Factorial of: " + number + " is: " + result);

        int term = 20;
        int fibonacciResult = fibonacciS(term);
        System.out.println("Fibonacci term " + term + " is: " + fibonacciResult);

    }

    public static int fibonacciS(int n) {
            if (n <= 0) {
                return 0;
            } else if (n == 1){
                return 1;
            } else {
                return fibonacciS(n - 1) + fibonacciS(n - 2);
            }
        }

}
