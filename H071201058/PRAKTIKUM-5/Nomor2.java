// Ichsan takwa
// H071201058
import java.util.Scanner;
import java.util.Random;
class Nomor2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
        }
    public static String generateSerial (int n, int m) {
        Random sembarang = new Random();
        String str = " ";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                str += sembarang.nextInt(10) ;
            }
            if ( i < n-1)
            str+= '-';
        }
        return str;
        }
}