package project1;

public class Runner {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = -1;
        try {
            result = calculator.sum(10,1 );
        }
        catch (Exception e) {
            e.printStackTrace();
            result = 0;
        }
        finally {
            System.out.println("result = " + result);
        }
    }
}
