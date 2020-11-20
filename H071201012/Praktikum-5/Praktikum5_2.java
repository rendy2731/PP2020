import java.util.Scanner;
import java.util.Random;

public class Praktikum5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n,m);

        System.out.println(serialNumber);
    }
    public static String generateSerial (int n, int m) {
        String str = "";
        Random angka = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                str += angka.nextInt(10);
            }
            str += (i < n-1) ? "-" : "\n";
        }
        return str;
    }
}
    

