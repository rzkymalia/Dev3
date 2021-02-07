package project2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTry3 {
    public static void main(String[] args) {

        Map<Integer, String> hashMapTry3 = new HashMap<>();
        hashMapTry3.put(1, "a");
        hashMapTry3.put(2, "b");
        hashMapTry3.put(3, "c");
        hashMapTry3.put(4, "d");
        hashMapTry3.put(5,"e");

        Iterator<Map.Entry<Integer,String>> iteratorMap = hashMapTry3.entrySet().iterator();

        while (iteratorMap.hasNext()){
            Map.Entry<Integer, String> entry = iteratorMap.next();
            System.out.println("Key nya adalah " + entry.getKey());
            System.out.println("Valuenya adalah " + entry.getValue());
        }


    }
}
