package project3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingTry4 {
    public static void main(String[] args) {

        BigDecimal nomor1 = new BigDecimal("12.00");
        BigDecimal nomor2 = new BigDecimal("3.00");
        BigDecimal nomor3 = new BigDecimal("4.70");
        BigDecimal nomor4 = new BigDecimal("15.00");
        BigDecimal nomor5 = new BigDecimal("9.40");

        BigDecimal result = nomor1.subtract(nomor3).divide(nomor1, RoundingMode.DOWN).multiply(nomor3);
        result = result.setScale(2, RoundingMode.FLOOR);

        BigDecimal result2 = nomor1.divide(nomor2, RoundingMode.UNNECESSARY);
        BigDecimal result3 = nomor4.divide(nomor3, RoundingMode.UP);
        BigDecimal result4 = nomor5.divide(nomor3, RoundingMode.UNNECESSARY);


        System.out.println("HASILNYA= " + result );
        System.out.println("HASIL RESULT 2 = " + result2);
        System.out.println("HASIL DARI RESULT 3 = " + result3);
        System.out.println("HASIL DARI RESULT 4 = " + result4);



    }
}
