package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BelajarException {

    public static void main(String[] args) {
        System.out.println("Silahkan Masukkan Angka Kalian");

        try {
            Scanner input = new Scanner (System.in);
            int a , b ;
            double c;

            System.out.print("Masukkan Nilai A = ");
            a = input.nextInt();
            System.out.print("Masukkan Nilai B= ");
            b = input.nextInt();
            c = a/b;
            System.out.println("Nilai C adalah " + c);

        //}catch (ArithmeticException e){
            //System.out.println("Eror! Tidak bisa dibagi Nol");
        }catch (InputMismatchException e){
            System.out.println("Maaf, anda harus menginputkan Angka");
        }catch (Throwable e){
            System.out.println("Eror ");
        }

        System.out.println("Sudah Selesai Yah");



    }
}
