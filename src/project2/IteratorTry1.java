package project2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTry1 {
    public static void main(String[] args) {

        List<Integer> tryArrayList = new ArrayList<>();
        tryArrayList.add(24);
        tryArrayList.add(25);
        tryArrayList.add(89);
        tryArrayList.add(1);
        tryArrayList.add(24);
        tryArrayList.add(25);
        tryArrayList.add(12);


        //Menginisialisasi Method Iterator yang Terdapat Pada Objek hewan dari Collection ArrayList

        //Iterator iterator = tryArrayList.iterator();
//        Iterator <Integer> i = tryArrayList.iterator();
//        Integer nama = i.next();
//        System.out.println(nama);

          Iterator iterator = tryArrayList.iterator();

          while (iterator.hasNext()){
              System.out.println(iterator.next());
          }


    }
}
