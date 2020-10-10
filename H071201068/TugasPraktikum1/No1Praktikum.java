import java.util.Scanner;
public class No1Praktikum{

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

            //Waktu = W
            //Kecepatan = K
        System.out.println("Masukkan Lama Waktu yang ditempuh" );
        int W = input.nextInt();
        System.out.println("Masukkan Kecepatan rata-rata dalam perjalanan");
        int K = input.nextInt();
        
            input.close();
            
            //Jarak = J
            //Jumlah bensin yang digunakan = Bensin
        int J;
        float Bensin;
          J = W*K;
          Bensin = (float)J/14;

        System.out.printf("Bensin yang digunakan dengan efisiensi 14 KM/L = %.3fL", Bensin);

    }
}