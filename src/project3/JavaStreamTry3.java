package project3;

import java.util.Arrays;
import java.util.List;

public class JavaStreamTry3 {
    public static void main(String[] args) {

        //In similar examples, convert array to array list and convert collection to array,
        // this snippet will convert a stream to an array by calling Stream.toArray
        List<Integer> integerList = Arrays.asList(3, 2, 5, 7, 1);

        //Object[] result = integerList.stream().toArray();
        Object[] result = integerList.stream().toArray();


        System.out.println(result.toString());
    }
}
