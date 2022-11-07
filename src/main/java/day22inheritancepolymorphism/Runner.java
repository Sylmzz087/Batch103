package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {

        //Inheritance'da variable'lar secilirken Java object'in data type'ina bakar.
        //Oncelikle istediginiz variable'i Object'in data type'i olan Class'da arar.
        //O Class'da bulamamzsa Parent Class'lara bakar.
        //Hicbir Parent Class'da bulamazsa hata verir


        Cat cat1 = new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);



        Mammal cat2 = new Cat();
        System.out.println(cat2.a);


        Animal cat3 = new Cat();
        System.out.println(cat3.a);


        //Object olusuturuken Object 'in data type i Child Classlardan secilemez

        //Inheritance 'da variable'lar seciliurken Java Constructor'a bakar
        //Oncelikle istediginiz methodu Constructoru kullanilan Class'dan alinir
        //o class da bulamazsa parent classa bakar
        // Hicbir parents classta bulamaz ise hata verir.
        Cat cat4 = new Cat();
        cat4.eat();//Cat eat

        Mammal cat5=new Mammal();
        cat5.eat();
        cat4.drink();
        Animal cat6 = new Animal();
        cat6.eat();




    }
}
