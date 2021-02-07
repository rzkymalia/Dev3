package project3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingTry2 {
    public static void main(String[] args) {

        BigDecimal tax = new BigDecimal ("10.545678");
        tax = tax.setScale(4, RoundingMode.HALF_UP);
        BigDecimal tax1 = new BigDecimal ("10.545678");
        tax1 = tax1.setScale(4, RoundingMode.HALF_DOWN);


        int ln = 789654;
        BigDecimal b = BigDecimal.valueOf(ln, 3);
        System.out.println("The BigDecimal value is " + b);








        // Assigning the bigdecimal value of ln to BigDecimal b
        // with scale 3

        // Displaying the BigDecimal value
        System.out.println("The BigDecimal value is " + b);


        System.out.println(tax);
        System.out.println("==============================================");

        BigDecimal number1 = new BigDecimal("12345.3645");
        BigDecimal number2 = new BigDecimal("344.23");

        BigDecimal result = number1.divide(number2, RoundingMode.UP);
        BigDecimal result2 = number1.divide(number2, RoundingMode.HALF_DOWN);
        BigDecimal result3 = number1.divide(number2, RoundingMode.HALF_EVEN);
        BigDecimal result4 = number1.divide(number2, RoundingMode.UP);
        BigDecimal result5 = number1.divide(number2, RoundingMode.DOWN);

        System.out.println("Hasil dari Rounding Mode HALF UP adalah = " + result);
        BigDecimal resulttRoundingHalfDown = result.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("HASIL RESULT 9 =" + resulttRoundingHalfDown);
        System.out.println("Hasil dari Rounding Mode HALF DOWN adalah = " + result2);
        System.out.println("Hasil dari Rounding Mode HALF EVEN adalah = " + result3);
        System.out.println("Hasil dari Rounding Mode UP adalah = " + result4);
        System.out.println("Hasil dari Rounding Mode DOWN adalah = " + result5);

        System.out.println("====================================");

        BigDecimal num1 = new BigDecimal("3.5");
        BigDecimal num2 = new BigDecimal("2");
        BigDecimal result6  = num1.multiply(num2);
        BigDecimal result7 = num1.multiply(num1);
        //result7 = result7.round();

        System.out.println("Hasilnya " + result6);
        System.out.println("HASILNYA " + result7);
    }
}
