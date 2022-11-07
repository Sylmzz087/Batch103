package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example 1: Kullanici gun numarasini girsin , code o gunun ismini yazsin
        // ilk gun pazardir .
       Scanner input=new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        byte gun=input.nextByte();
        if(gun==1){
            System.out.println("Pazar");
        } else if (gun==2) {
            System.out.println("Pazartesi");
        }else if (gun==3) {
            System.out.println("Sali");
        }else if (gun==4) {
            System.out.println("Carsamba");
        }else if (gun==5) {
            System.out.println("Persembe");
        }else if (gun==6) {
            System.out.println("Cuma");
        }else if (gun==7) {
            System.out.println("Cumartesi");
        }else{
            System.out.println("1-7 arasi bir numara giriniz . 1.numara pazar gunudur" );


        //2.Yol
      /*  if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
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
        //3.Yol
       boolean haftasonu= gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");
        boolean haftaIci=gun.equalsIgnoreCase("Pazartesi") ||
                        gun.equalsIgnoreCase("Sali") ||
                        gun.equalsIgnoreCase("Carsamba") ||
                        gun.equalsIgnoreCase("Persembe") ||
                        gun.equalsIgnoreCase("Cuma");
            System.out.println("Hafta ici...");

        if (haftasonu) {
            System.out.println("haftasonu");
        } else if (haftaIci) {
            System.out.println("Haftaici");
            
        }else {
            System.out.println("gercerli bir gun ismi giriniz");*/
        }}
    }

