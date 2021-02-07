package project2;

import java.util.*;

public class ListIteratorTry1 {
    public static void main(String[] args) {

        List<Integer> listTry = new LinkedList<>();
        listTry.add(1);
        listTry.add(4);
        listTry.add(3);
        listTry.add(6);
        listTry.add(5);

        for (Integer ab : listTry){
            System.out.println(ab);
        }

        //Menginisialisasi ListIterator pada objek angka
        ListIterator<Integer> listIterator = listTry.listIterator();

        while (listIterator.hasNext()) {

            int element = listIterator.next();

            listIterator.set(element + 1000);
        }
        System.out.println("====== NILAI YANG SUDAH DIMODIFIKASI ======");

        //Menginisialisasi Iterator pada objek angka
        Iterator iterator = listTry.iterator();


        while (iterator.hasNext()) {
            //Melakukan Iterasi atau Perulangan
            Object element = iterator.next();
            System.out.println("Nilai: " + element);
            //Mencetak Nilai Yang Sudah Dimodifikasi
        }

        System.out.println("==== MENGURUTKAN NILAI SECARA TERBALIK ====");

        //Mengurutkan Nilai Cecara Terbalik
        while (listIterator.hasPrevious()) {
            Object element = listIterator.previous();
            System.out.println("Nilai: " + element);


        }
    }
}
