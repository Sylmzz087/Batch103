package day19datetime;

import day06nestedifswitch.Switch01;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        // Example1: "Anlik tarihi "(Current date) ekrana yazdiran kodu yazdiriniz
        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);

        //Example 2 : "Anlik Zaman " (Current time)

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //Example 3 :  "Anlik tarihi "(Current date) ve  "Anlik Zaman " (Current time) ekrana yazdiran kodu yazdiriniz

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Example 4 : japonya da li anlik tarihi ve zamani ekrana yazdiriniz .

        LocalDateTime currentDateTimeINJapam = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeINJapam);

        //Example 5: ISTABNBUL

        LocalDateTime currentDateTimeINIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeINIstanbul);

        //Example 6 : Bugunden 789 gun sonra emekli olacaginiza gore ,emeklilik tarihini hesaplayan kodu yaziniz

        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        //Example 7: iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz

        LocalDate countDate1 = LocalDate.of(1994, 03, 24);
        LocalDate countDate2 = LocalDate.of(1994, 04, 25);

        Long diff = ChronoUnit.DAYS.between(countDate1, countDate2);
        System.out.println(diff);

        //Example 8: Istanbulun fethi ve cumhuriyetin kurulmasi arasinda kac ay olan kodu yaziniz

        LocalDate feth = LocalDate.of(1453, 05, 29);
        LocalDate cum = LocalDate.of(1923, 10, 29);

        Long diff1 = ChronoUnit.MONTHS.between(feth, cum);
        System.out.println(diff1);

        //Example 9: Verilen Tarihin hangi burcta oldugunu gosteren kodu yaziniz
        /*      KOÇ BURCU: 21 Mart-19 Nisan.
                BOĞA BURCU: 20 Nisan-20 Mayıs.
                İKİZLER BURCU: 21 Mayıs-20 Haziran.
                YENGEÇ BURCU: 21 Haziran-22 Temmuz.
                ASLAN BURCU: 23 Temmuz-22 Ağustos.
                BAŞAK BURCU: 23 Ağustos-22 Eylül (Eylül hangi burç)
                TERAZİ BURCU: 23 Eylül-22 Ekim (Eylül hangi burç)
                AKREP BURCU: 23 Ekim-21 Kasım.
        */
        LocalDate myDate = LocalDate.of(1989,03,20);
        int day=myDate.getDayOfMonth();
        int month=myDate.getMonthValue();

        System.out.println(day +  " - " + month);

        if(day>=21 && month == 3) {
            System.out.println("Koc");

        } else if (day<=20&&month==4) {
            System.out.println("Koc");
        } else if (day>=21&& month==4) {
            System.out.println("Boga");
        } else if (day>=21 && month==5) {
            System.out.println("Boga");
        }


    }
}
