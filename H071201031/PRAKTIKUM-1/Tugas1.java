import java.util.Scanner;
import java.text.DecimalFormat;
class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Masukkan waktu yang ditempuh (jam) [enter] kecepatan rata-rata (km/jam)");
            int v = input.nextInt();
            int t = input.nextInt();

            double bensin = (v * t) / 14.0;

            DecimalFormat df = new DecimalFormat("#.###");

            System.out.println("Bensin Yang Digunakan = " + df.format(bensin) + " L");
    }
}    