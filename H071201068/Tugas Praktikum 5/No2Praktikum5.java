import java.util.Scanner;
import java.util.Random;

public class No2Praktikum5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println("\nGet Your Serial Number");
        System.out.println(serialNumber);

        scanner.close();
    }

    public static String generateSerial(int n, int m) {
        Random getSerial = new Random();
        int[] serial = new int[m];
        String str = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                serial[j] = getSerial.nextInt(10);
                str = str + serial[j];
            }
            if (i < n - 1) {
                str += "-";
            }
        }
        return str;
    }
}
