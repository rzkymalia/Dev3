package project3;

import java.math.BigDecimal;

public class RoundingTry3 {
    public static void main(String[] args) {

        BigDecimal x = new BigDecimal("345.888");
        BigDecimal y = new BigDecimal("123.222");
        BigDecimal result = x.add(y);

        System.out.println("Hasil dari " + x + " + " + y+ "= " + result);
        System.out.println("Hasil dari "+ result.setScale(2));
        System.out.println("Hasil");
    }
}
