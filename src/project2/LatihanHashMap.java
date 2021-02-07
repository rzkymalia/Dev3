package project2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LatihanHashMap {
    public static void main(String[] args) {
        HashMap <Integer, String> latHashMap = new HashMap<Integer, String>();
        latHashMap.put(1 ,"Januari");
        latHashMap.put(2, "Februari");
        latHashMap.put(3, "Maret");
        latHashMap.put(3, "Maret");


        //latHashMap.remove(1);


        for (Map.Entry entry : latHashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


        //System.out.println(latHashMap());
        System.out.println(latHashMap.get(3));
    }
}
