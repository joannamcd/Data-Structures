package Maps;
import java.io.*;
import java.util.*;
/* MAPS IN JAVA
 * HASHMAP
 * Map<String, Integer> map = new HashMap<>();
 * LINKED HASH MAP
 * TREE MAP
 * 
 * 
 */
public class Maps {
    //HASHMAP
    Map<String, Integer> map = new HashMap<>();

    //LINKED HASH MAP
    Map<String, Integer> map2 = new LinkedHashMap<>();

    //TREE MAP
    Map<String, Integer> map3 = new TreeMap<>();



    static void countFreq(int[] arr, int l){
        Map<Integer, Integer> map = new HashMap<>();

        //for loop through array elements and count frequencies
        //add to map with map.put()
        for(int i=0; i<l; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        //for loop through map and print frequencies
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args){
        //countFreq exercise code
        int[] arr = {1,2,3,3,4,5,5,5,};
        int l = arr.length;
        countFreq(arr, l);
        //countFreq exercise code ends

        //creating a map
         Map<String, Integer> m = new HashMap<>();
         //inserting new key-value pairs
        m.put("apple", 100);
        m.put("banana", 200);
        m.put("cherry", 300);

        //get value associated with a key
        int value = m.get("banana");
        System.out.println("Value for key 'banana': " + value);

        //updating value associated with a key
        m.put("banana", 250);
        value = m.get("banana");
        System.out.println("Updated value for key 'banana': " + value); 

        //removing a key value pair
        m.remove("cherry");

        //Iterating over the key-value pairs in the map
        System.out.println("Key-value pairs in the map: ");
        for(Map.Entry<String, Integer> pair : m.entrySet()){
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }

   


}
