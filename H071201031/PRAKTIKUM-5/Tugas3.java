import java.util.Scanner;
class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan usia (dalam hari) : ");
        int usia = input.nextInt();
        myDay(usia);
    }
    
    static void myDay (int hari) {
        int tahun = hari/365;
        int bulan = hari%365;
        int bulanReal = bulan/30;
        int hariReal = bulan%30;

        System.out.println(tahun + " tahun");
        System.out.println(bulanReal + " bulan");
        System.out.println(hariReal + " hari");
    }
}