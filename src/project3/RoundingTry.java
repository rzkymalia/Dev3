package project3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingTry {
    public static void main(String[] args) {

                double d = 100.675;
                double e = 100.500;
                float f = 100;
                float g = 90f;

        BigDecimal tax = new BigDecimal("1.002");
        tax = tax.setScale(2, RoundingMode.UP);


                System.out.println(Math.round(d));
                System.out.println(Math.round(e));
                System.out.println(Math.round(f));
                System.out.println(Math.round(g));
                System.out.println(tax);
            }
        }


