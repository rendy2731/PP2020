import java.util.Scanner;

public class TUGASPRAKTIKUM02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sec, jam, menit, detik;

        System.out.println("================================");
        System.out.println("Masukkan detik yang akan dikonversi :");
        sec = input.nextInt();

        jam = sec/3600;
        menit = (sec%3600)/60;
        detik = (sec%3600)%60;

        System.out.println("Hasil konversi :");
        System.out.printf("%02d:%02d:%02d \n" , jam, menit, detik);
        System.out.println("================================");
    }
}