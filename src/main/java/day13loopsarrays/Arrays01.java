package day13loopsarrays;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Arrays01 {
    /*
    1)Ayni data tipinde coklu datayi depolamak icin Javanin olusturdugu yapilar vardir
        Bu yapilardan biride "Array"lerdir.
     */

    public static void main(String[] args) {

        //Array nasil olusturulur ?
        int stdAges[] = new int[7];//[0,0,0,0,0,0,0]
        //Array nasil yazdirilir ?
        System.out.println(Arrays.toString(stdAges));
        //Arraylere elemanlar nasil eklenir ?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));//[12, 11, 13, 14, 10, 12, 12]

        //Array'deki herhangi bir  elemani nasil yazdirabiliriz?
        System.out.println(stdAges[4]);

        //Example: Arraydeki en kucuk ve en buyuk elemanin toplamini konsola  yazdiriniz .
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];
        int son = stdAges[stdAges.length - 1];

        System.out.println(ilk + son);

        //Example 2 : stdages arrayi icindeki tum elemanlarin toplamini ekrana yazdiriniz.
        int sum = 0;
        for (int i = 0; i < stdAges.length; i++) {
            sum += stdAges[i];

        }
        System.out.println(sum);

        //2. Yol : while-loop
        int i = 0;
        int toplam = 0;
        while (i < stdAges.length) {
            toplam += stdAges[i];
            i++;
        }

        System.out.println(toplam);
        //3. yol do-while-loop
        int k = 0;
        int s = 0;
        do {
            s += stdAges[k];

            k++;
        } while (k < stdAges.length);
        System.out.println(s);

        //4. yol :  for each loop Arrays ve Collections larda kullanilir.
        int t = 0;
        for (int w : stdAges) {
            t += w;

        }
        System.out.println(t);

        //Example 3 : String bir Array olusuturnuz .Bu Arraye 5 tane elements yerlestiriniz sonra bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz .
        String strName[] =new String[5] ;
        strName[0] ="Ali";
        strName[1] ="Tom";
        strName[2] ="Veli";
        strName[3] ="Kemal";
        strName[4] ="Cem";

        int karakterSayilarToplamini = 0 ;

        for(String w :  strName){

        karakterSayilarToplamini +=  w.length();
        }
        System.out.println(karakterSayilarToplamini);


        //Example 4: Char bir array olusturunuz
        //           Bu array'e 5 eleman ekleyiniz
        //           Bu array;deki sadece buyk harfleri ekrana yazdiriniz

        char ch[] = { 'A', 'c', 'D', 'k', 'M' };

        for(char w : ch) {
            if (w >= 'A' && w <= 'Z') {
                System.out.print(w);


            }
        }
    }


}
