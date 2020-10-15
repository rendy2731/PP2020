import java.util.Scanner;

    class Soal1PP{
        public static void main(String[] args) {
            Scanner inputan = new Scanner (System.in);
            System.out.println("Masukkan Jumlah waktu :");
            int T = inputan.nextInt();
            System.out.println("Masukkan Nilai Kecepatan :");
            int K = inputan.nextInt();
            int J = K*T;
            float X = ((float)(K*T))/(float)14.0;
            System.out.printf("Bensin yang digunakan: %.3f " , X); System.out.print("L");
             

        }
    }