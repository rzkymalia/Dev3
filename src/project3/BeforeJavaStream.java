package project3;

import java.util.ArrayList;
import java.util.List;

public class BeforeJavaStream {

    public  void regular(){
        List <String> arr1 = new ArrayList<>();
        arr1.add("Adinda");
        arr1.add("Alfa");
        arr1.add("Dina");
        arr1.add("Angel");
        arr1.add("Rafi");

        int count = 0;
        for (int i = 0; i<arr1.size(); i++){
            String actual = arr1.get(i);
            if (actual.startsWith("A"))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
