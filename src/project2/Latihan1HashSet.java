package project2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Latihan1HashSet {

    public static void main(String[] args) {

        Set <String> nameList = new LinkedHashSet<>();
        nameList.add("Rizky Amalia");
        nameList.add("Reza Alwan");
        nameList.add("Yulinar");
        nameList.add("Slamet");
        nameList.add("RizkY Amalia");

        System.out.println(nameList.size());
        System.out.println(nameList.contains("Rizky Amalia"));

        for (String name : nameList){
            System.out.println(name);
        }



    }

}
