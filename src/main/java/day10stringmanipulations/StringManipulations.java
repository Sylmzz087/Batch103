package day10stringmanipulations;

public class StringManipulations {
    public static void main(String[] args) {

        String a = "Java kolaydir.";

        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        //"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
        boolean b = a.startsWith("kola", 5);
        System.out.println(b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" yapar
        //replace ("a", "*"); kod String deki tum "a" lari "*" yapar
        String c = a.replaceFirst("a", "*");
        System.out.println(c);

        //Concat() method'u 2 tane Stringi biribirine yapisitirmaya yarar.
        String d = a.concat("Anladin mi");    // == a + "Anladim mi". concat varken elle yazilmaz.
        System.out.println(d);

        //trim() methodu bir String'in bas ve sonundaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz
        String e = "    Tom Hanks    ";
        System.out.println(e);
        String f = e.trim(); //
        System.out.println(f);


        //h.compareTo(i); kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        //Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        //h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.
        String h = "Java";
        String i = "Java";

        int k = h.compareTo(i);

        System.out.println(k);


    }
}
