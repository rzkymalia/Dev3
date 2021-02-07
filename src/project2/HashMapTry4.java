package project2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTry4 {
    public static void main(String[] args) {

        List<String> namaPlanet = new ArrayList<>();
        namaPlanet.add("Merkurius");
        namaPlanet.add("Venus");
        namaPlanet.add("Bumi");
        namaPlanet.add("Mars");
        namaPlanet.add("Yupiter");
        namaPlanet.add("Saturnus");
        namaPlanet.add("Uranus");

        // Membuat Objek dari hashmap

        Map<String, List<String>> mapList = new HashMap<>();
        mapList.put("Nama Planet", namaPlanet);

        //melakukan foreach

        for (Map.Entry map : mapList.entrySet()) {
            System.out.println(map.getKey() + ":" + map.getValue());
        }
    }
}
