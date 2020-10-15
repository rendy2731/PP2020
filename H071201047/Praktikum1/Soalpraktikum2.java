import java.util.Scanner;
public class Soalpraktikum2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan detiknya :");
        int Detik;
        Detik = a.nextInt();
        int Menit;
        int Jam;
        Jam = Detik/(60 * 60);
        Detik = Detik - ((60 * 60) * Jam);
        Menit = Detik / 60;
        Detik = Detik - (60 * Menit);
        System.out.printf("%02d:%02d:%02d", Jam, Menit, Detik);
    }
    
}
