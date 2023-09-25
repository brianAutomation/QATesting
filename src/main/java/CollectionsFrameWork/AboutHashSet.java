package CollectionsFrameWork;
// java hashset class is used to create a collection that uses hash table for storage
//it inherits the abstractset class and implements set interface
//it stores elements by hashing
//it allows null value
//contains only unique elements - will not take duplicates
//non synchronized
//best for search
//capacity is 16 initially
//does not maintain insertion order .. it uses hashcode

//list vs Set??
//a list can contain duplicate elements where as set can only have unique values
// data structures and algoriths

import java.util.HashSet;

public class AboutHashSet {
    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();

        nameSet.add("A");
        nameSet.add("Brian");
        nameSet.add("Patrick");
        nameSet.add("Kim");
        nameSet.add("B");

       // nameSet.add("B");// will not take duplicates
       // nameSet.add("A");//

        System.out.println("has set has: " + nameSet);

        boolean containsKim = nameSet.contains("Kim");
        System.out.println(containsKim);

        boolean removeB = nameSet.remove("B");
        System.out.println("removed: " + removeB);
        System.out.println(nameSet);

        System.out.println(nameSet.size());

        nameSet.clear();
        System.out.println(nameSet);

    }



}
