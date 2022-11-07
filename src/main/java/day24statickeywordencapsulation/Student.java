package day24statickeywordencapsulation;

//Encapsulation ; "Data Hiding " demektir.
//Datayi dis etkenlerden korumak icin bu yontemi kullaniriz
//Datayi Access Modifier' inin "private" yaparak gizleyebiliriz
//Datayi gizledikten sonra baska Classlardan okumak istersen , "get medhodlar" (getter) olusturarak gizledigimiz datalari okunur hale getirebiliriz
//"Set medhodlar"|(Setter) olusturarak gizledigimiz datalari degistirebiliriz
//Variable in "Data type" i ile get methodunun "Return type " i ayni olmalidir.
//get methodlari isimlendirirken "get + <variable name >" ancak  variable in data type boolean ise o zamn "is +<variable name> ypaiyoruz
public class Student {
    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
