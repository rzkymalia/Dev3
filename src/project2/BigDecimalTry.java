package project2;
import java.math.BigDecimal;
public class BigDecimalTry {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.001");
        BigDecimal b = new BigDecimal("0.002");
        BigDecimal result = b.subtract(a);
        System.out.println("Hasil dari = " + b + "-" + a + "=" + result);

    }
}
