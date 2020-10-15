import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Waktu Yang Ditempuh :");
        int W = read.nextInt();
        System.out.println("Kecepatan Rata-Rata :");
        int K = read.nextInt();
        // j = jarak
        // l = bensin yang digunakan
        double j = W*K;
        double l = (j/14);

        System.out.printf("Bensin Yang Digunakan Dengan Efisiensi 14 KM/L = %.3f L ", l); 
        
    }
}