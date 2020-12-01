import java.util.Scanner;

public class Soalpraktikum35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {

            float x = scan.nextFloat();
            int jam = 0, menit = 0, detik = 0;
            int detikSementara = (int) (x * 240);

            if (x >= 0 && x < 360) {
                while (detikSementara > 0) {
                    if (detikSementara - 3600 >= 0) {
                        detikSementara -= 3600;
                        jam++;
                    } else if (detikSementara - 60 >= 0) {
                        detikSementara -= 60;
                        menit++;
                    } else {
                        detikSementara -= 1;
                        detik++;
                    }
                }
                jam += 6;

                if (jam >= 24)
                    jam -= 24;

                if (jam <= 10) {
                    System.out.println("SELAMAT PAGI");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 14) {
                    System.out.println("SELAMAT SIANG");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else if (jam <= 18) {
                    System.out.println("SELAMAT SORE ");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                } else {
                    System.out.println("SELAMAT MALAM");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                }
            } else
                System.out.println("MASUKKAN 0<=NILAI<360");
        }
    }
}
