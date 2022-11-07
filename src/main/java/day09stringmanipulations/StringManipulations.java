package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        String str="java is easy";

        //IndexOf() methodu verilen character ve ya characterkerin ilk gorunumun indexini verir.
        int idxA=str.indexOf("a");
        System.out.println(idxA);


        //lasIndexof() methodu: verilen character ve ya characterkerin son gorunumun indexini verir
        int idxA2=str.lastIndexOf("a");
        System.out.println(idxA2);

        String s = "Missisissippi";

        int idxI= s.indexOf('i');//indexOf() hem String hem de char ile kullanilabilir.

        System.out.println(idxI);

        //Example 1: Bir String'deki bir characterin tekrarli ve ya tekrarsiz olup olmadigini gosteren bir kodu yazinir
        //"Helloooo" ==> H --> tekrarsiz  e --> tekrarsiz l--> tekrarli  o--> tekrarli

        String mrb="Helloooo";
        char c= 'o';
        if(mrb.indexOf(c)==mrb.lastIndexOf(c)){
            System.out.println("tekrarsiz");
        }else {
            System.out.println("tekrarli");
        }


        String u = "Learn Java earn money";
        int sonuc = u.indexOf("n",5);
        System.out.println(sonuc);


        //isEmpty medhodu bir Stringin bos olup olmadigini kontrol eder .Eger stringde hic karakter yoksa true verir varsa false return eder

        String v = "Java is java";

        boolean bosMu= v.isEmpty();
        System.out.println(bosMu);

        String x = " ";
        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);//true

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else{
            System.out.println(ilk);
        }







    }
}
