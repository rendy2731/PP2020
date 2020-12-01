import java.util.Scanner;

public class TugasPP2Waktu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Masukkan Total Waktu (Detik) : ");
        int WIB = read.nextInt();
        int Sisa1 = WIB%3600;
        int Jam = WIB/3600;
        int Menit = Sisa1/60;
        int Detik = WIB-(Jam*3600)-(Menit*60);
            System.out.println("Waktu Sekarang Adalah (Jam,Menit,Detik) : ");
            System.out.println(Jam + ":" + Menit + ":" + Detik);
    }
}
