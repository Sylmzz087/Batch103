package day22inheritancepolymorphism;

public class Honda extends Car{

    public String color;
    public Honda(){
        super("White",540000);
        System.out.println("Honda Connstructor");

    }
    public Honda(String color){
     this.color=color;
    }

}
