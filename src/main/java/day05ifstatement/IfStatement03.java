package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    /*iki tane String'in esit olup olmadigini anlamak icin "==" degil , "equals" kullanilir
      iki tane String'in birbirine esit ollup olmadigini kontrol etmek icin iki tane method kullanilabilir
      i)equals()==> Buyuk harf ve kucuk harfi onemser ."A" ile "a " farklidir.
      ii)equalsIgnoreCase()==> Buyuk harf ve kucuk harfi onemsemez ."A" ile "a " aynidir.
    */
    public static void main(String[] args) {
        //Example: kullanicidan gun isimlerini aliniz, o gunun hafta ici mi yoksa sonu oldugunu soyleyiniz.
        Scanner input=new Scanner(System.in);

        System.out.println("Bir gun ismi giriniz");
        String gun=input.next();

        if(gun.equalsIgnoreCase("Pazar")){
            System.out.println("Haftasounu");

        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Haftasonu");
        }else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Haftaici");
        }else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("Haftaici");
        }else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("Haftaici");
        }else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Haftaici");
        }else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Haftaici");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz");
        }
        //2.Yol:
        if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }


    }
}
