package project1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CobaThrows {


    public void processFile() {

        Integer.parseInt("a");


        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handle It!");
        }
    }

    //gue kasih eror dibawah ini gapake tutup kurung
    private void readFile()throws IOException {
        Reader reader = null;
        try {
            reader = new FileReader("Users/Rizky Amalia/test.txt");
        } finally {
            if (reader != null) {
                reader.close();
            }

        }

    }

}


