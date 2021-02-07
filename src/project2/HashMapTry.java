package project2;

import java.util.HashMap;
import java.util.Map;

public class HashMapTry {
    public static void main(String[] args) {

    Map <String,Integer> namaHashMap = new HashMap<>();
    namaHashMap.put("Nama", 1);
    namaHashMap.put("Nama2", 2);
    namaHashMap.put("Nama3", 3);

    //cara merubah nilai hashmap
        namaHashMap.replace("Nama", 1, 5);

    System.out.println(namaHashMap.get("Nama"));
    System.out.println(namaHashMap);
    System.out.println(namaHashMap.values());
    System.out.println(namaHashMap.get("Nama"));




    }
}
