// Ichsan Takwa
// H071201058
import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int n = inputan.nextInt();
        int[] angka = new int[n];
        int fpb = 0;
        float hasil_a = 0;
        float hasil_b = 0;

        // input data array angka
        for (int i = 0; i < angka.length; i++) {
            angka[i]=inputan.nextInt();
        }
        inputan.close();

        // pengecekan fpb untuk mencari pasangan yang relatif prima
        for (int i = 0; i <= n-1; i++) {
            for (int j = i+1; j <= n-1; j++) {
                for (int k = angka[i]; k > 0; k--) {

                    // hasil bagi dalam bentuk desimal
                    hasil_a = (float) angka[i] / k;
                    hasil_b = (float) angka[j] / k;
    
                    // pengecekan nilai k terbesar yang dapat membagi kedua bilangan dalam array
                    if (angka[i]/k == hasil_a && angka[j]/k == hasil_b) {
                        fpb = k;
                        break;
                    }
                }
                // mencetak setiap dua angka dalam array yang memiliki fpb 1
                if (fpb == 1) {
                    System.out.println(angka[i]+ " "+ angka[j]);
                }
            }
        }
        
    }
    
}
