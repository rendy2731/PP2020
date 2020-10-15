import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
        /* Menghitung penggunaan bensin dalam perjaanan
         * Nama : Ichsan Takwa
         * NIM  : H071201058                        */
        Scanner inputan = new Scanner(System.in);
        System.out.print("Waktu di tempuh (jam) : ");
        int jam = inputan.nextInt();
        System.out.print("\nKecepatan rata-rata (km/jam) : ");
        int kecepatan = inputan.nextInt();
        int bb = jam*kecepatan;
        inputan.close();
        double penggunaan = (double) bb/14;
    
        System.out.printf("\nBensin yang digunakan : %.3f L",penggunaan);



    }
}
