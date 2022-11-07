package day18arraylistspassbyvalue;

public class Varargs01 {


    /*
    1)Farkli sayilardaki parametrelerle calisabilen bir medhod olusturmak isterseniz "Varargs" kullanmalisiniz
    2) " Varargs " arka tarafta 'Array' kullanir bu yuzden "Varargs" kullanirken 'Array' gibi kulllanabiliriz .
    3)Varargs olusturmak icin "<data type> ...<vararhs ismi >"
    4)Bir medhodda "varargs" in yaninida baska bir parametre kullanilabilir. Ama Varargs (...) en sonda olmalidir.
    5)Bir medhodda 1 den fazla  Varrags kullanilamaz .
     */

    public static void main(String[] args) {

        int r1 =add(2,3);
        System.out.println(r1);

        int r2 =add(2,3,4);
        System.out.println(r2);

        int r3 =add(2,3,4,5);
        System.out.println(r3);
    }

//    //iki sayinin toplamini return eden bir sayi olursuturnuz
//
//
//    public static int add(int a , int b ) {
//        return a+b;
//    }
//
//    //Uc sayinin toplamini return eden bir sayi olursuturnuz
//    public static int add(int a ,int b ,int c) {
//        return  a+b +c ;
//    }
//    //Dort sayinin toplamini return eden bir sayi olursuturnuz
//
//    public static int add(int a ,int b ,int c,int d) {
//        return  a+b +c + d  ;
//    }
//    //Istedigimiz kadar sayiyi toplayabilecegimiz bir medhod olusuturalim

    public  static int add (int...a ){
        int sum=0;
        for(int w : a ){
            sum +=w;
        }
        return sum;
    }
}


