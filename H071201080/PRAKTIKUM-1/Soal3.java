import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Masukkan Tinggi Menara");
        int h = read.nextInt();
        System.out.println("Masukkan Sudut Elevasi Pengamat Terhadap Ujung Depan Kapal");
        int a = read.nextInt();
        System.out.println("Masukkan Sudut Elevasi Pengamat Terhadap Ujung Belakang Kapal");
        int b = read.nextInt();
        // x = jarak antara belakang kapal dengan menara
        double x = h*(Math.tan(Math.toRadians(a)));
        // y = jarak antara depan kapal dengan menara
        double y = h*(Math.tan(Math.toRadians(b)));
        double z = x-y;

        System.out.printf("Panjang Kapal = %.1f", z); System.out.print(" m");
        
    }
}
