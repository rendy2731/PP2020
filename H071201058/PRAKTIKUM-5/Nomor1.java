// Ichsan takwa
// H071201058
import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        // Meil scanner dan menginput dua angka
        Scanner input = new Scanner(System.in);
        int angka_1 = input.nextInt();
        int angka_2 = input.nextInt();
        input.close();

        // Mencetak hasil operasi dari method cartiFPB 
        System.out.printf("FPB dari %d dan %d = %d",angka_1,angka_2,cariFPB(angka_1, angka_2));
    }

    public static int cariFPB(int bil_a, int bil_b) {
        int  fpb = 0;

        // Perulangan untuk menguji hasil bagi bilangan terhadap 'i'
        for (int i = bil_a; i > 0; i--) {
            float bagi_a = (float) bil_a/i;
            float bagi_b = (float) bil_b/i;

            // Mengecek apakah hasil kedua bilangan bagi adalah bilangn bulat
            if (bagi_a == ((int) bagi_a) && bagi_b == ((int) bagi_b)) {
                fpb = i;
                break;
            }  
        }
        return fpb;
    }

}