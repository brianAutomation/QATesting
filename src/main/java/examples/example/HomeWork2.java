package examples.example;


public class HomeWork2 {
    protected static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    protected static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    protected static String CapitalFirstLetter(String sentence) {
        String[] words = sentence.split("");
        StringBuilder result = new StringBuilder(); // stores all splits in an array

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                String restSentence = word.substring(1).toLowerCase();
                result.append(firstLetter).append(restSentence).append("");
            }
        }
        return result.toString().trim();
    }

    protected static boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println(false);
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
            return true;
            }
        }
        return true;
    }
}


