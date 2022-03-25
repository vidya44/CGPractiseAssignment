package com.capgemini.CapgeminiAssignment;
import java.util.*;
public class sortMapKeyExample {
    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();
    public static void sortbykey()
    {
    // Function to sort map by Key

        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }

    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        map.put("Vidya", 40);
        map.put("Anushka", 90);
        map.put("Anupma", 80);
        map.put("Ayush", 65);
        map.put("Dev", 70);

        // Calling the function to sortbyKey
        sortbykey();
    }
}

