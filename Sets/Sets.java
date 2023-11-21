package Sets;
import java.util.*;
   /* JAVA
    * internally implemented as Hash-Table
    We always need a class that extends this list in order to create an object
    
    Types:
    HashSet
    TreeSet
    LinkedHashSet

    SYNTAX:
    Set<Obj> set = new HashSet<Obj>();

    Implementation of Set using Hash Table:

    To add an element to the set:
    - generate a hash value (say entry) for the key to be inserted
    - go to the entry in the hash table and check if there are already other entries
    - if slot is empty add the new element there
    - else, traverse to the end of that entry list and add the new element there

    To remove an element from the set:
    - generate the hash value for the element
    - if hash value is invalid or there are no entries, return an error message
    - otherwise, go to that slot and find the element from the list present in that slot
    - remove that element from the hash table
    */

public class Sets {
    
    public static void main(String[] args){
        
        //declare integer set
        Set<Integer> hash = new HashSet<Integer>();
        
        //add values to set hash
        hash.add(10);
        hash.add(5);
        hash.add(12);
        hash.add(4);

        //Print set elements
        System.out.println("Set is " + hash);

        int check = 10;
        System.out.println("Contains " + check + " " + hash.contains(check));

        //removing from set
        hash.remove(5);
        System.out.println("After removing element " + hash);

        //finding max element in set
        Object obj = Collections.max(hash);
        System.out.println("Maximum element = " + obj);

        //finding min element in set
        Object obj2 = Collections.min(hash);
        System.out.println("Minimum element = " + obj2);

        //Displaying the size of the set
        System.out.println("The size of the set is: " + hash.size());

    }
}
