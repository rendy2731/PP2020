import java.util.Scanner;

class Soal1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        
        int efisiensi = 14;
        System.out.print("waktu =");
        int waktu = userInput.nextInt();
        System.out.print("kecepatan =");
        int kecepatan = userInput.nextInt();

        float bensinyangdigunakan = ((float)waktu * (float)kecepatan) / efisiensi;
        
        System.out.printf("Bensin yang digunakan = %.3f L", bensinyangdigunakan);
      
    }
}
    
