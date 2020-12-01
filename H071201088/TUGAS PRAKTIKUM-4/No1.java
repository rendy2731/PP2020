import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner aqila = new Scanner(System.in);
        int n = aqila.nextInt();
        int r, d, b;

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = aqila.nextInt();

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                int angka1 = array[i];
                int angka2 = array[j];
                if (angka1 > angka2) {
                    d = angka1;
                    b = angka2;
                    r = d % b;

                } else {
                    d = angka2;
                    b = angka1;
                    r = d % b;

                }
                while (r != 0) {
                    d = b;
                    b = r;
                    r = d % b;
                }
                if (b == 1) {
                    System.out.println(array[i] + " " + array[j]);
                }

            }
        }
    }
}
