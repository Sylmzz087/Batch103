package denemeler;

public class VarMetScan {

    public String elbise = "Zara" ;

    public static void main(String[] args) {

        char kalemUcu='s';
        float kalemTras=80000000000f;

        long kalem= 9200000000000000000l;

        int age = 24 ;

        /*Example 1: toplama cikartma carpma yapan 5 sayi yaziniz
        Example 2 : carpma yapan 2 sayiyi 4 sayi ile toplayan method yaziniz.
        */
        System.out.println(toplamaCikarmaCarpmaYapanBesSayi(4,5,6,7,8));
        double sigara= 14;

    }

    public static double toplamaCikarmaCarpmaYapanBesSayi(double a, double b, double c, double d, double e) {

        return a+b+c+(d*e);

    }
    public int fiyat = 15;


}
