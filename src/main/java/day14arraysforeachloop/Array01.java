package day14arraysforeachloop;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array01 {

    //Arrayslerin icine primitive data typelar ve referenceler konulabilir.


    public static void main(String[] args) {

        /* String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "suprise you";

        System.out.println(Arrays.toString(str));

        //String bir Array olusturunuz, "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark ", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {
            System.out.print(w + " ");

            if (w.equals("Tom")) {
                break;

            }
        } */

        //String bir Array olusturunuz, "Tom" ve "Jane" haric tum elemanlari yazdiriniz

        String brr[] = {"Jane", "Mark ", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : brr) {


            if (w.equals("Jane") || w.equals("Tom")) {
                continue;
            }
            System.out.print(w + " ");
        }

        //Example 3 ;
        //Kullanici ile beraber bir Array olusuturunuz ve icine data ekleyiniz
        //Bir ogretmenin sinifindaki ogrencilerin isimlerini applicationa yuklemesini saglayan codu yaziniz .
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi giriceksiniz");
        int numOfStudent=input.nextInt();


        String names[] = new String[numOfStudent];
        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");

        for (int i=1; i<=numOfStudent;i++ ){

            System.out.println("Lutfen " + i  + ". ilk ogrenci ismini giriniz");


            String stdName = input.next();

            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1]  = stdName;


        }

        System.out.println(Arrays.toString(names));




    }
}
