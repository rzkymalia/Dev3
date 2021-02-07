package project2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Latihan1TreeSet {
    public static void main(String[] args) {
        System.out.println("Nama Nama Bulan");
        Set<String> ts = new HashSet<>();
        ts.add("1.January");
        ts.add("3.Maret");
        ts.add("2 Februari");

        for (String bulan : ts){
            System.out.println(bulan);
        }

    }
}
