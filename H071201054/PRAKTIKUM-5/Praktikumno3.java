import java.util.Scanner;
public class Praktikumno3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int day = user.nextInt();
        myDay(day);

    }
    static void myDay(int hari){
        int hari1, bulan, tahun;
        tahun = (hari / 365);
        bulan = (hari - (tahun * 365))/30;
        hari1 = (hari - ((tahun * 365) + (bulan * 30)));
        System.out.println(tahun + " tahun");
        System.out.println(bulan + " bulan");
        System.out.println(hari1 + " hari");

    }
}
