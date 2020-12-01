import java.util.Scanner;

class Soal3 {
    public static void main(String[] args) {
        Scanner aqila = new Scanner(System.in);
        int nilai = aqila.nextInt();
        System.out.println(myDay(nilai));

    }

    static String myDay(int nilai) {
        int tahun, bulan, hari;
        tahun = nilai / 365;
        int tahun1 = nilai % 365;
        bulan = tahun1 / 30;
        int bulan1 = tahun1 % 30;
        hari = bulan1;
        String hasil = "tahun = " + tahun + "\nbulan = " + bulan + "\nhari = " + hari;
        return hasil;

    }

}