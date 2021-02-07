package project1;

public class BelajarException3 {

    public static void main(String[] args) {

            int a,b,c;
            try {
                a = 10;
                b = 0;
                c = a / b;
                throw new DivideException();

            }catch (DivideException e){
                System.out.println("Ada yg eror nih");
            }
        }
    }


