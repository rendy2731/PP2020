import java.util.Scanner;

public class No03 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("|  Silahkan masukkan inputan hari  |");
        System.out.println("------------------------------------");
        int num = inputan.nextInt();
        myDay(num);

    }

    static void myDay(int num) {
        int year = num / 365;
        int month = (num - 365 * year) / 30;
        int day = num - (365 * year) - (30 * month);
        System.out.println(year + " tahun");
        System.out.println(month + " bulan");
        System.out.println(day + " hari");
    }
}
