import java.util.Scanner;

public class No1Praktikum5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan 2 angka yang ingin di cari FPB-nya");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
            input.close();
        cariFPB(num1, num2);
    }

    private static void cariFPB(int angka1, int angka2) {
        int cek1Angka;
        int cek2Angka;
        int fpb;
        if (angka1 > angka2) {
            cek1Angka = angka1;
            cek2Angka = angka2;
            fpb = cek1Angka % cek2Angka;

            while (fpb != 0) {
                cek1Angka = cek2Angka;
                cek2Angka = fpb;
                fpb = cek1Angka % cek2Angka;
            }
            fpb = cek2Angka;
            System.out.printf("FPB dari %d dan %d = %d\n", angka1, angka2, fpb);

        } else {
            cek1Angka = angka2;
            cek2Angka = angka1;
            fpb = cek1Angka % cek2Angka;

            while (fpb != 0) {
                cek1Angka = cek2Angka;
                cek2Angka = fpb;
                fpb = cek1Angka % cek2Angka;
            }
            fpb = cek2Angka;
            System.out.printf("FPB dari %d dan %d = %d\n", angka1, angka2, fpb);
        }
    }
}