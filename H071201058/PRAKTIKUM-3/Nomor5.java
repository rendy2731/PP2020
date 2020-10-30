import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        float DerajatMatahari = inputan.nextFloat();
        
        if ((DerajatMatahari >= 360) | (DerajatMatahari <= 0)) {
         System.out.println("Data yang anda masukkan tidak sesuai");   
        } else {

        int InputDetik = (int) (DerajatMatahari/360*86400);
        InputDetik = InputDetik + 21600;
        inputan.close();

        if (InputDetik >= 86400) {
            InputDetik -= 86400;
        }

        int jam = InputDetik/3600;
        int menit = (InputDetik%3600)/60;
        int detik = InputDetik%60;
        

        System.out.print("Selamat ");
        if (10 > jam && jam >= 4) {
            System.out.println("pagi");
        } else if (14 > jam && jam >= 10) {
            System.out.println("siang");
        } else if (18 > jam && jam >= 14) {
            System.out.println("siang");
        } else System.out.println("malam");
        System.out.printf("%02d : %02d : %02d",jam,menit,detik);

        }
    }
}
