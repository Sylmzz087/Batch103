package day23inheritancepolymorphism;

public class Math extends Courses {
    public void practice() {
        System.out.println(" doing practice");

    }
    public Math(){
        super("Second");
        System.out.println("Constructor 1 ");
    }
    public Math (int a){
        this();//Ayni Clasin icinde diger Constructor'i kullan.
        System.out.println("Constructor 2");
    }

}
