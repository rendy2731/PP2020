// Ichsan Takwa
// H071201058
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur = input.nextInt();
        input.close();
        
        System.out.printf(myDay(umur));
    }

    public static String myDay(int umur) {
        int tahun = umur/365;
        int bulan = (umur%365) / 30;
        int hari = (umur%365)%30;

        if (bulan == 12) {
        tahun += 1;
        bulan = 0;
        hari = 0;
        }

        String usia = tahun + " Tahun\n" + bulan + " Bulan\n" + hari + " Hari";
        return usia;
    }
}