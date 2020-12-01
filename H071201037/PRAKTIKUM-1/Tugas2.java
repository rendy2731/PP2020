import java.util.Scanner;

public class Praktikum2 {
    
    public static void main(String[] args) {
        
        Scanner time = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Masukkan detik yang ingin dikonversi :");
        int detik = time.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int menit = (detik/60) % 60;
        int jam = (detik/3600);
        detik = detik % 60;

        System.out.printf("Waktu : %02d:%02d:%02d",jam , menit, detik);
    }

}
