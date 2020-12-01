import java.util.Scanner;

public class No3Praktikum5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Total Harinya = ");
        int totalHari = input.nextInt();
        myDay(totalHari);
        input.close();
    }

    private static void myDay(int totalHari) {
        float tahun = totalHari / 365;
        float bulan = (totalHari - ((int) tahun * 365)) / 30;
        float hari = (totalHari - ((int) tahun * 365 + bulan * 30));

        System.out.printf("%.0f Tahun\n", tahun);
        System.out.printf("%.0f Bulan\n", bulan);
        System.out.printf("%.0f Hari\n", hari);
    }
}
