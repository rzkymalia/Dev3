package project1;

public class Calculator {
    public int sum(int number1, int number2) throws NumberTooLargeException {

        int c = number1 + number2;
        if (c > 10) {
            throw new NumberTooLargeException();
        }
        return c;
}

}