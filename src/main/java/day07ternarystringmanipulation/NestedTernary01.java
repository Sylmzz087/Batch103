package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
            Verilen yilin "Leap Year(Artik yil)" olup olmadigini kontrol eden kodu yaziniz.
            i)Yil 100 e bolunurse 400 e de bolunmelidir.==> 1600 + artik yil 1800- artik degil
            ii)Yil 1000 e bolunmezse 4 e bolunmelidir. ==> 1996+ artik yil  2001- artik degil
         */
        int year =1996;

        String leap = year%100==0 ? (year%400==100 ? "Leap year": "Leap year degildir") : (year%4==0 ? "Leap year":"Leap year degildir");

        System.out.println(leap);
        /*
        Asagidaki kurallara gore password un gecerli olup olmadigini kontrol eden kodu yaziniz
        i)sekiz karakterden fazla karakter varsa ilk harfi "i" olmalidir.
        ii)sekiz karakterden az karakter varsa ilk harfi 'K' olamalidir
         */
        String pwd= "K2a3";
        String gecerli = pwd.length()<8 ? (pwd.charAt(0)=='K' ? "Gecerli" : "gecersiz") : (pwd.charAt(0)=='i' ? "Gecerli" : "Gecersiz");
        System.out.println(gecerli);

    }
}
