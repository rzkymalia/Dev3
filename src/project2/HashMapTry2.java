package project2;

import java.util.HashMap;
import java.util.Map;

public class HashMapTry2 {
    public static void main(String[] args) {

        Map<Integer, String> hashmap2= new HashMap <>();
        hashmap2.put(1 ,"rizky");
        hashmap2.put(8, "kiki");
        hashmap2.put(9,"Reza");

        for (Integer noMasuk : hashmap2.keySet()){
            System.out.println("Key nya adalah " + noMasuk) ;
        }
        //hashmap
        System.out.println(hashmap2.keySet());

    }
}
