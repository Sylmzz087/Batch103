package day18arraylistspassbyvalue;

public class PasByValue01 {



    /*
    1)Java, variable'ların orijinal değerlerini korumak ister.
    2)Variable metotlar içinde kullanıldığında, Java metodun içine
    orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
    Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
    orijinal değer korunmuş olur. Bu sisteme PassByValoue denir.

    note: Java "Pass By Value " Kullanir . Bazi programlama dilleri orjinal degeri koruma altina
    almamistir bu isi developerlara birakmistir.bu tarz diller "Pass by Reference " Kullanir.

 */
    public static void main(String[] args) {

        int x = 5;

        System.out.println(x);

        //Static method olan "main medhod"un icindeki hersey static olmalidir
        change(x);


        System.out.println(x);


        int ucret=100;

        int kopya =indirim(ucret);
        System.out.println(kopya);
        System.out.println(ucret);
    }

    public static void change(int a) {
         System.out.println(a * 3);
    }

    public static int indirim(int gomlekUcreti) {
        return gomlekUcreti - 10 ;
    }
}
