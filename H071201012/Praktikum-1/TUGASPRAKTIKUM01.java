import java.util.Scanner;

class TUGASPRAKTIKUM01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int W, K, J;                    //W=waktu, K=kecepatan, J=jarak.
        double E, B;                    //E=efisiensi,  B=bensin
        
        System.out.println("================================");
        System.out.println("masukkan nilai waktu (jam) :");
        W = input.nextInt();
        System.out.println("masukkan nilai kecepatan rata-rata (km/jam) :");
        K = input.nextInt();

        E = 14;
        J = W * K;
        B = J/E;

        System.out.println("Bensin yang di gunakan:" + String.format("%.3f", B) +" liter" );
        System.out.println("================================");
    }
}
