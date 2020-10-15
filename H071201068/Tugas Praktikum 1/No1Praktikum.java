import java.util.Scanner;
public class No1Praktikum{

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

            //Waktu = W
            //Kecepatan = K
            //Efisiensi = E
        System.out.println("Silahkan Masukkan Lama Waktu yang Ditempuh (Jam)" );
        int W = input.nextInt();
        System.out.println("Silahkan Masukkan Kecepatan Rata-rata dalam Perjalanan (KM/Jam)");
        int K = input.nextInt();
        System.out.println("Silahkan Masukkan Nilai Efisiensi Bahan Bakar Kendaraan Anda (KM/L)");
        int E = input.nextInt();
        
            input.close();
            
            //Jarak = J
            //Jumlah bensin yang digunakan = Bensin
        int J;
        float Bensin;
          J = W*K;
          Bensin = (float)J/E;

        System.out.printf("Bensin yang digunakan dengan efisiensi %d KM/L = %.3f L", E, Bensin);

    }
}
