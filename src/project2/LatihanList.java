package project2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LatihanList {
    public static void main(String[] args) {
        System.out.println("Nama Nama Bulan");
        ArrayList<String> namaBulan = new ArrayList<>();
        namaBulan.add("1.Januari");
        namaBulan.add("3.Februari");
        namaBulan.add("2.Maret");

        //memasukkan data duplicate
         namaBulan.add("2. Maret");

        //menghapus elemen array
        namaBulan.remove(0);

        namaBulan.set(2, "5. Yang terbaru");

        for (String month : namaBulan){
            System.out.println(month);
        }
    }
}
