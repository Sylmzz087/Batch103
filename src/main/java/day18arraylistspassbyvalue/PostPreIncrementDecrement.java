package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {


    public static void main(String[] args) {

        int a=5;

        //Post Increment
        int b = a++;
        System.out.println(b);

        //Pre Increment
        int c = 10 ;

        int d = ++c;
        System.out.println(d);


        //Post Decrement

        int e =20;
        int f = e -- ;

        System.out.println(f);

        //Pre Decrement

        int  x= 20;
        int  z=--x;
        System.out.println(z);


    }
}
