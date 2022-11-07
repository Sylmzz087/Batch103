package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        //example 1 : Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yansitiniz,
        //Ramazan ==> Rn

        Scanner input=new Scanner(System.in);

       /* System.out.println("Lutfen isminizi giriniz");
        String isim=input.next();
        //1.Yol
        char ilkHarf=isim.charAt(0);
        char sonHarf = isim.charAt(isim.length()-1);// Yazdiginiz code sadece bazi durumlar icin calirisa o code a "hard coding " denir , bu istenmeyen biseydir.
                                                    // Yazdiginiz code her durum icin calisirsa bu code "Dynamic Coding" denir.
        System.out.println(" "+ilkHarf + sonHarf);
        //2.Yol
       String ilkHarf1= isim.substring(0,1);
       String sonHarf2= isim.substring(isim.length()-1);
        System.out.println(" "+ilkHarf1 + sonHarf2); */

        //Example 2 : Asagidaki String deki tum hayvan isimlerini ekrana yazdiriniz .
        // "ben kedi esim tavuk oglum  sever inek .
        String str = "ben kedi, esim tavuk, oglum  sever inek";

        String kedi=str.substring(4,8) ;
        String tavuk=str.substring(15,20);
        String inek =str.substring(34);
        System.out.println(kedi+tavuk+inek);

        //Example 3; ilk isim ve soy isim iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiriniz .
        // Ali Can ==>AC  Tahsin Yurdakul==TY

        System.out.println("ilk ve soy isminizi giriniz ");
        String tamIsim=input.nextLine();

        String a =tamIsim.substring(0,1);
        String b =tamIsim.split(" ")[1].substring(0,1);

        System.out.println(a+b);





    }
}
