package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoops01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan bir sayi aliniz , 100 den kucuk ise ekrana "kazandiniz" yazdiriniz
        // aksi halde ekrana "kaybettiniz" yazdiariniz
        // Kullanici kazandikca oyun devam etmelidir


        Scanner input = new Scanner(System.in);
        /*    int sayi=0;
        do {

            System.out.println("Bir sayi giriniz");
            sayi = input.nextInt();

            if (sayi < 100) {
                System.out.println("Kazandiniz");
            }

        }while (sayi < 100);
            System.out.println("kaybettiniz"); */

        //Example 2 :Kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol eden kodu yaziniz

       /* char name = ' ';

        do {
            System.out.println("Lutfen isminizi giriniz");
            name = input.next().charAt(0);
            if (name >= 'A' && name <= 'Z') {
                System.out.println("Ismi basariyla girdiniz");
            } else {
                System.out.println("ismi yanlis girdiginiz icin islem iptal edilmisitir");
                break;

            }
        } while (true); */


        //Infinite loop : Sonsuz dongu
        /* for (int i = 0; i < 10; i++) { //Arttirma azaltma kisminda hata yaparsaniz Infinite loop sorunu olusur .
            System.out.println("hi!");
        } */

        /*for (int i = 0; i < 10; ) { //Arttirma   azaltma kismini yazmasaniz Infinite loop sorunu olusur .
           System.out.println("hi!");
       }*/

        int i = 12;
        while (i < 15) {        //Arttirma azaltma kismini yazmasaniz Infinite loop sorunu olusur .

            System.out.println("hi!");
        }

    }
}

