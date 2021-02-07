package project1;

public class PanggilMethodPembagian{

    public static void main(String[] args) {
        Pembagian pm = new Pembagian();
        try {
            pm.bagi();
        } catch (DivideException e) {
            e.printStackTrace();
        }

    }

}
