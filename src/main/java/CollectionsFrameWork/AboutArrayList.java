package CollectionsFrameWork;
//What is collections framework?
//The collections framework in java is an architecture to store and manipulate
//the group of objects.

//Java collections can achieve all operations on data that we are limited in java arrays
//Java collection means a single unit of objects.
//It has interfaces like SET LIST QUE DEQUE ..
//It has classes like ARRAYLIST, LINKEDLIST, HASHSET, LINKEDHASHSET, TREESET

//Hierarchy of collections framework

//Iterable
//Collection
// List     //QUEUE     //SET
//LIST --> ARRAYLIST, LINKEDLIST, VECTOR, STACK
//QUEUE --> PRIORITYQUEUE, DEQUEUE, ARRAYDEQUE
//SET --> HASHSET, LINKEDHASHSET, SORTEDSET, TREESET

//Interfaces Like -->Iterable , Iterator

import java.util.*;

public class AboutArrayList {

    public static void main(String[] args) {
       //Arraylist();
      // ExtractInt();
       //addInt();
       //stringarr();
    }

    public static void Arraylist() {

        int[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : arr) {
            arrayList.add(num);
        }

        arrayList.add(30);

        // Collections.sort(arrayList,Comparator.reverseOrder());

        System.out.println("This Array has: ");
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }

    }


        //add 5, 3, 7, 9
        //two, four, six, eight, ten - to another array
      //  public static void ExtractInt(){
           // String[] str = {"1","two","3","four"};
            //print all in to an array
            //ArrayList
            //Integer.parseInt <-- use this!


    public static void Extract(){
        String[] str = {"1","two","3","four","six","eight","ten"};
        //print all int in to an array.
        //ArrayList
        //Integer.parseInt()

        ArrayList<Integer> integers = new ArrayList<>();

        for (String s : str){
            try {
                int num = Integer.parseInt(s);
                integers.add(num);
            }catch (NumberFormatException e){
                e.getMessage();
            }
        }

        int[] intArray = new int[integers.size()];
        for (int i = 0;i < integers.size();i++){
            intArray[i] = integers.get(i);
        }

        for (int num : intArray){
            System.out.print(num+ " ");
        }
    }

    public static void addInt() {
        String[] str = {"1", "two", "3", "four", "six", "eight", "ten"};

        ArrayList<Integer> addedintegers = new ArrayList<>();

        addedintegers.add(1);
        addedintegers.add(3);
        addedintegers.add(5);
        addedintegers.add(7);
        addedintegers.add(9);


        int[] intArray = new int[addedintegers.size()];
        for(int i = 0; i < addedintegers.size(); i++){
            intArray[i] = addedintegers.get(i);
        }

        for(int num : intArray){
            System.out.print(num + " ");
        }

    }

    public static void stringarr() {
        String[] str = {"1", "two", "3", "four", "six", "eight", "ten"};
        ArrayList<String> StringArray = new ArrayList<>();

        StringArray.add("two");
        StringArray.add("four");
        StringArray.add("six");
        StringArray.add("eight");
        StringArray.add("Ten");

        for (String s : StringArray) {
            System.out.print(s + " ");

        }
    }

    public static void ExtractString(){
    String[] str = {"1", "two", "3", "four", "six", "eight", "ten"};
    ArrayList<String> extractedStrings = new ArrayList<>();

        for (String s : str) {
        if ((s == "two") || (s == "four") || (s == "six") || (s == "eight")) {
            extractedStrings.add(s);
        }
    }

   String [] stringextract = new String[extractedStrings.size()];
        int index = 0;
        for (String s : extractedStrings) {
            stringextract[index++] = s;
        };

        for(String s : stringextract){
            System.out.print(s + " ");
        }
}
        //Convert ArrayLists to arrays




        public static void ExtractInt(){
            String[] str = {"1","two","3","four","5","six","7","eight","9","ten"};
            //print all int in to an array.
            //print all strings into a string array.
            //ArrayList
            //Integer.parseInt()

            ArrayList<Integer> intList = new ArrayList<>();
            ArrayList<String> stringList = new ArrayList<>();

            for (String s : str) {
                try {
                    int num = Integer.parseInt(s);
                    intList.add(num);
                } catch (NumberFormatException ignored) {
                    stringList.add(s);
                }
            }

            // Convert ArrayLists to arrays
            int[] intArray = intList.stream().mapToInt(Integer::intValue).toArray();
            String[] stringArray = stringList.toArray(new String[0]);

            // Print the extracted integers
            System.out.println("Integers:");
            for (int num : intArray) {
                System.out.print(num + " | ");
            }

            // Print the extracted strings
            System.out.println("Strings:");
            for (String s : stringArray) {
                System.out.print(s + " | ");
            }
        }


}






















//        ArrayList<Integer> numbers = new ArrayList<>();
//
 //       numbers.add(1);
  //      numbers.add(2);
  //      numbers.add(3);
  //      numbers.add(4);
  //      numbers.add(5);

   //     System.out.println("Element at index 0: " + numbers.get(0));
   //     System.out.println("Element at index 1: " + numbers.get(1));

   //     numbers.set(1,20);
   //     numbers.remove(3);

    //    System.out.println(numbers.size());

    //    for (Integer number: numbers){
    //        System.out.print(number + " ");
    //    }







