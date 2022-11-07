package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

       //  kullanic gun ismini ekrana yazdiriniidan gun sayisiniz aliniz ve
        Scanner input=new Scanner(System.in);
    //1. yol if ile cozumu
        System.out.println("Gun numarasini giriniz");
        byte gunNo=input.nextByte();
        if(gunNo==1){
            System.out.println("Pazar gunu");
        } else if (gunNo==2) {
            System.out.println("pazartesi");
        }  else if (gunNo==3) {
            System.out.println("sali");
        }  else if (gunNo==4) {
            System.out.println("carsamba");
        }  else if (gunNo==5) {
            System.out.println("persembe");
        }  else if (gunNo==6) {
            System.out.println("cuma");
        }  else if (gunNo==7) {
            System.out.println("cumartesi");
        }  else{
            System.out.println("Gecerli bir numara giriniz");
        }
        //2.yol switch ile cozumu

        switch (gunNo){
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("sali");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("persembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("Gecerli bir numara giriniz");
        }



    }   //main
}    // class

