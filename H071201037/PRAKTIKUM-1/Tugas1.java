import java.util.Scanner;

public class Praktikum1 {
    
    public static void main(String[] args) {
        
        //Efisiensi bensin = 14Km/Liter
        Scanner kmh = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Masukkan Waktu Perjalanan (dalam Jam): ");
        int waktu = kmh.nextInt();
        System.out.println("Masukkan Kecepatan Perjalanan : ");
        int kecepatan = kmh.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        double bensin = (double)(kecepatan * waktu)/14;    //Rumus efisiensi : efisiensi = jarak/bensin, bensin = jarak/efisiensi.
                                                   //Jarak = kecepatan * waktu, maka bensin = (kecepatan * waktu)/efisiensi.

        System.out.printf("Total Bensin yang Digunakan : %.3f liter", bensin);

    }

}
