import java.util.Scanner;

class JumlahBensin {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Nilai Waktu (Jam) : ");
        float W = input.nextFloat();
        System.out.println("Masukkan Nilai Kecepatan Rata-Rata (Km/Jam) :");
        float K = input.nextFloat();

        float E = 14;
        float J = W * K;
        double B = J/E;

        System.out.printf("Bensin Yang Digunakan : %.3f L", + B,+ J);
    }
}