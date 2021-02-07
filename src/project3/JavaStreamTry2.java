package project3;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamTry2 {

    public static void main(String[] args) {
            List <String> arrayTry = new ArrayList<>();
            arrayTry.add("Ann");
            arrayTry.add("App");
            arrayTry.add("Bee");
            arrayTry.add("Cia");
            arrayTry.add("Don");

            Long x=arrayTry.stream()
                    .filter(s->s.startsWith("A"))
                    .count();
            System.out.println(x);
        }

    }

