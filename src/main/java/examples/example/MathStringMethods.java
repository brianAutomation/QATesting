package examples.example;

public class MathStringMethods {

    //Math methods
    public static void main(String[] args) {
        int a = 10;
        double b = 10.02;
        float c = -20.95f;

        System.out.println(Math.abs(c)); // turns to positive
        System.out.println(Math.floor(b)); //will give a whole number
        System.out.println(Math.max(10,30)); //30
        System.out.println(Math.min(-1,40));// -1
        System.out.println(Math.sqrt(25)); //5
        System.out.println(Math.PI); //3.14
        System.out.println(Math.pow(10,2)); // 10 * 10
        System.out.println(Math.nextUp(20)); // next floating
        System.out.println(Math.nextDown(20)); // floating before
        System.out.println(Math.absExact(a));
        System.out.println(Math.addExact(10,2));

//        Random random = new Random();
//        int randomNumber = random.nextInt(10);
        int randomNumber = (int) (Math.random() * 21);
        System.out.println(randomNumber);

        String str = "hello";

        char charAtIndex = str.charAt(1);
        System.out.println(charAtIndex + " is the character at index 1");
        System.out.println(str.length());
        String format = String.format("value: %d",42);
        System.out.println(format);
        String sub = str.substring(2);
        System.out.println(sub);
        String range = str.substring(2,4);
        System.out.println(range);
        boolean contains = str.contains("world");
        System.out.println(contains);
        String join = String.join("|","a","b","c");
        System.out.println(join);
        boolean isEqual = str.equals("Hello");
        System.out.println(isEqual);
        boolean isEmpty = str.isEmpty();
        System.out.println(isEmpty);
        String concat = str.concat(" world");
        System.out.println(concat);
        System.out.println("hello " + "world");
        String replace = str.replace("hello","Hello");
        System.out.println(replace);
        String[] split = str.split("e");
        for (int i = 0;i < split.length;i++){
            System.out.print(split[i] + " ");
        }
        int indexOfChar = str.indexOf("l");
        System.out.println(indexOfChar);
        String upper = str.toUpperCase();
        System.out.println(upper);
        String lower = str.toLowerCase();
        System.out.println(lower);

        String trimm = "this      space     ".trim();
        System.out.println(trimm);
        String value = String.valueOf(1999);//given int but return string
        System.out.println(value);

        boolean ignore = str.equalsIgnoreCase("HELLO");
        System.out.println(ignore);


    }

    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public static void greeting(String name){
        System.out.println("Hello ".concat(name).concat("!"));
    }


    // Given a string, return a "rotated left 2" version where the first 2 chars are moved to
// the end.The string length will be at least 2. use substring anc concat
    public static void manu(String str){
        if (str.length() < 3){
            System.out.println(str);
        }
        String firstTwo = str.substring(0,2);
        String remaining = str.substring(2);

        System.out.println(remaining+firstTwo);
    }



// Given two strings, append them together (known as "concatenation") and return the result.
// However, if the concatenation creates a double-char,
// then omit one of the chars, so "abc" and "cat" yields "abcat".

    public static void append(String str1, String str2){
        if (str1.length() ==0 || str2.length() ==0){
            System.out.println(str1+str2);
        }
        if ((str1.charAt(str1.length()-1) == str2.charAt(0))){
            System.out.println(str1+ str2.substring(1));
        }
        System.out.println(str1+str2);
    }

}
