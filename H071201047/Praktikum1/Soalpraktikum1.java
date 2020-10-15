import java.util.Scanner;
public class Soalpraktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Jumlah waktu perjalanan :");
        int Waktu;
        Waktu = input.nextInt();
        System.out.println("Jumlah kecepatan rata-rata :");
        int Kecepatan;
        Kecepatan = input.nextInt();
        Float Bensin = (Waktu * Kecepatan) / 14.0f;
        System.out.printf("Bemsin yang di gunakan:" +" %.3f L", Bensin);
        
    }
    
}
