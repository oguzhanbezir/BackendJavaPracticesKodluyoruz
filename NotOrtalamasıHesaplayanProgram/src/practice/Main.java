package practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mat, fiz, sos, tar, tur, ing, res, fel, kim;

        System.out.print("\nMatematik Notunuzu Giriniz : ");
        mat = inp.nextInt();
        System.out.print("\nFizik Notunuzu Giriniz : ");
        fiz = inp.nextInt();
        System.out.print("\nSosyal Notunuzu Giriniz : ");
        sos = inp.nextInt();
        System.out.print("\nTarih Notunuzu Giriniz : ");
        tar = inp.nextInt();
        System.out.print("\nTürkçe Notunuzu Giriniz : ");
        tur = inp.nextInt();
        System.out.print("\nİngilizce Notunuzu Giriniz : ");
        ing = inp.nextInt();
        System.out.print("\nResim Notunuzu Giriniz : ");
        res = inp.nextInt();
        System.out.print("\nFelsefe Notunuzu Giriniz : ");
        fel = inp.nextInt();
        System.out.print("\nKimya Notunuzu Giriniz : ");
        kim = inp.nextInt();

        double result = ((mat + fiz + sos + tar + tur + ing + res + fel + kim)/9);
        System.out.println("\nOrtalamanız : " + result);

        String str = result >= 60 ? "\nTebrikler Geçtiniz :)" : "\nÜzgünüm Kaldınız :(";
        System.out.print(str);
    }
}
