import java.util.Scanner;
import java.util.Random;

public class No02 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("|  Silahkan masukkan inputan n blok & m digit angka  |");
        System.out.println("------------------------------------------------------");
        int n = inputan.nextInt();
        int m = inputan.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial(int n, int m) {
        String Str = "";
        Random r = new Random();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int angka = r.nextInt(10);
                Str += String.valueOf(angka);
            }
            if (i == n) {
                Str += "";
            } else {
                Str += "-";
            }
        }
        return Str;
    }
}
