package sy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class UniqueKeysAndValuesExample {
    public static void main(String[] args) {
        // Create a HashSet to store unique keys
        Set<String> uniqueKeys = new HashSet<>();

        // Create a HashMap to store key-value pairs
        Map<String, String> uniqueMap = new ConcurrentHashMap<String, String>();
        
        uniqueMap.put(null, null);
        uniqueMap.put("20", "vikas");
        uniqueMap.put("", null);
        System.out.println(uniqueMap);
        CopyOnWriteArrayList<Integer> cpl = new CopyOnWriteArrayList<Integer>();
        cpl.add(1);
        cpl.addIfAbsent(1);
        System.out.println(cpl);

//        // Add key-value pairs while enforcing uniqueness in both keys and values
//        addUniquePair(uniqueKeys, uniqueMap, "1", "John");
//        addUniquePair(uniqueKeys, uniqueMap, "2", "Alice");
//        addUniquePair(uniqueKeys, uniqueMap, "3", "Bob");
//        addUniquePair(uniqueKeys, uniqueMap, "2", "Eve"); // Duplicate key, not allowed
//        addUniquePair(uniqueKeys, uniqueMap, "4", "Alice"); // Duplicate value, not allowed

        // Print the unique key-value pairs
//        for (Map.Entry<String, String> entry : uniqueMap.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }
    }

    private static void addUniquePair(Set<String> uniqueKeys, Map<String, String> uniqueMap, String key, String value) {
        if (!uniqueKeys.contains(key)) {
            uniqueKeys.add(key);
            uniqueMap.put(key, value);
        }
    }
}
