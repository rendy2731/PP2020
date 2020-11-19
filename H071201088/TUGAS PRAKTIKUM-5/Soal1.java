import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner aqila = new Scanner(System.in);
        int angka1 = aqila.nextInt();
        int angka2 = aqila.nextInt();
        System.out.println("FPB DARI " + angka1 + " DAN " + angka2 + " = " + fpb(angka1, angka2));

    }

    // method fpb
    static int fpb(int angka1, int angka2) {
        int r, d, b;
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
        if (b != 0) {
        }
        return b;
    }
}
