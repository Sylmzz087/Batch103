package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example 1 : Bir Stringdeki space haric kac tane karakter kullanildigini gosteren kodu  yazduriniz
        //"Ali okula gitti." ==>14

        String str="Ali okula gitti.";

        //replace() nethod'u bir Strindeki herhangi kir karakteri ve ya karakterleri degistirmek icin kullanilir.
       int num= str.replace(" ","").length();
        System.out.println(num);

        //Example 2 : Bir Stringdeki tum 'a' harleri8ni 'A' ya ceviriniz.
        String s = "Ankarada'nin tasina gozlerimin yasina bak.";
        String yeniS= s.replace("a","A");
        System.out.println(yeniS);

        //Example 3 : Bir Stringdeki tum "kara" kelimelerinin yerine "*" yildiz koyunuz

        String t = "Kara kara dusunme Ankara";

        String yeniT= t.replace("kara","*");
        System.out.println(yeniT);

        //Example 4: Bir Stringdeki tum sayilari "*"a ceviriniz
        //AC202117004 => AC*********
        String stdId="AC202117004";
        String yeniStdId=stdId.replaceAll("[0-9]","*");
        System.out.println(yeniStdId);

        //Bir grup data'yi ifade eden kodlara " Regex" denir.
        //Regex = Regular Expressions in kisaltilmis halidir.
        //Tum rakamlar==> [0-9]
        //Tum kucuk harfler ==>[a-z]
        //Tum buyuk harflar ==>[A-Z]
        //Tum harfler ==>[a-zA-Z]
        //Sesli harfler ==>[aeiouAEIOU]
        //Space ==> [ ]
        //Tum rakamlar ve tum harfler ==>[0-9 a-z A-Z]
        //Tum noktalama isaretleri ==>\\p{Punct}

        //Rakamlar haric tum karakterler ==>[^0-9]
        //Kucuk harfler haric tum karakterler ==>[^a-z]
        //Buyuk harfler haric tum karakterler ==>[^A-Z]
        //Tum harfler haric tum karkterler ==>[^a-zA-Z]
        //Space haric==>[^ ]


        //Example 5 : Verilen bir Stringde kullanilan noktlama isareti ve takamlar ve space karakteri haric tum karakterin sayisini bulan kodu yaziniz

        String u = "Ali 13 yasinda, dersem inanma!...";
        int sonuc=u.
                replaceAll("[0-9]","").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();

        System.out.println(sonuc);

        //Example 6 :Bir passwordun gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //     i)Space haric 8 karakter olmali
        //    ii)en az 1 sembol icermeli
        //    ii)en az 1 rakam icermeli
        //    ii)en az 1 buyuk harf icermeli
        //    ii)en az 1 kucuk harf icermeli

        String pwd="B78k? K!m";
        //     i)Space haric 8 karakter olmali

        boolean first = pwd.replace(" ","").length()>7;

        //    ii)en az 1 sembol icermeli
        boolean second= pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;
        //    ii)en az 1 rakam icermeli
        boolean third= pwd.replaceAll("[^0-9]","").length()>0;
        //    ii)en az 1 buyuk harf icermeli
        boolean fourth =pwd.replaceAll("[^A-Z]","").length()>0;
        //    ii)en az 1 kucuk harf icermeli
        boolean fifth =pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli=first&&second&&third&&fourth&&fifth;
        if (pwdGecerli){
            System.out.println("Gecerli");
        }else{
            System.out.println("Gecerli bir password giriniz");
        }

        //Example 7:Bir Stringdeki noktalama isareleri haric karakter sayisini gosteren kkodu giriniz

        String cumle= "Sen yapmazsan, ben ?... ";

        int number = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

        //Example 8 :Verilen bir Stromg "Al" ile basliyor ve "x" ile bitiyorsa "Harika" yazdirin aksi halde "normal" yazdirin

        String v="Alex";
        boolean baslangic=v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result= baslangic&&bitis?"harika":"Normal";
        System.out.println(result);






    }
}
