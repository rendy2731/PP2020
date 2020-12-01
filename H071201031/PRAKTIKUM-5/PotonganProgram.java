import java.util.Scanner;
import java.util.Random;
class PotonganProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateSerial (int n, int m) {
        String str = "";
        Random rand = new Random();
        int[][] number = new int[n][m];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = rand.nextInt(10);
                System.out.print(number[i][j]);
            }
        if (i == (number.length - 1)) {
            System.out.print("");
        } else {
            System.out.print("-");
        }
        }
        return str;
    }
}