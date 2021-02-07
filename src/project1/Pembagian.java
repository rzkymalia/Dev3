package project1;

public class Pembagian {
    public void bagi() throws DivideException {
        try {
            int a,b,c;
            a = 10;
            b = 0;
            c = a/b;
            System.out.println(c);

        }catch(ArithmeticException e){
            throw new DivideException();

        }


    }
}
