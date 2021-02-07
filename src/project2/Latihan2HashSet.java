package project2;

import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Latihan2HashSet {
    public static void main(String[] args) {
        System.out.println("Nama - Nama Bulan");
        HashSet<String> namaBulan = new HashSet<>();
        namaBulan.add("Februari");
        namaBulan.add("Juni");
        namaBulan.add("Januari");
        //namaBulan.add("1. Januari");

        for (String namaNamaBulan : namaBulan){
            System.out.println(namaNamaBulan);
        }

    }
}
