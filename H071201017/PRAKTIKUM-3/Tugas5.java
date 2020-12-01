/*
 * @author Ummul
 * Don't Copyright
 */
import java.util.Scanner;
public class Tugas5 {
    public static void main (String[] args) {
        Scanner ummul = new Scanner (System.in);
        System.out.println("Input Derajat");
        
        while (ummul.hasNext()) {
            float M = ummul.nextFloat();
            System.out.println(" ");
            
            if (0 <= M && M < 360) {
                int detik = (int) (M * 86400 / 360);
                int jam = (detik / 3600) + 6;
                int sisa = detik % 3600;
                int menit = sisa / 60;
                int detik1 = sisa % 60;
                
                if (M < 270) {
                    if (jam >= 6 && jam < 10) {
                        System.out.println("Selamat Pagi");
                        System.out.println(String.format("%02d",jam) + ":" + String.format("%02d", menit) + ":" + String.format("%02d",detik1));
                    }
                    else if (jam >= 10 && jam <14) {
                        System.out.println("Selamat Siang");
                        System.out.println(String.format("%02d",jam) + ":" + String.format("%02d", menit) + ":" + String.format("%02d",detik1));
                    } 
                    else if (jam >= 14 && jam < 18) {
                        System.out.println("Selamat Sore");
                        System.out.println(String.format("%02d",jam) + ":" + String.format("%02d", menit) + ":" + String.format("%02d",detik1));
                    }
                    else {
                        System.out.println("Selamat Malam");
                        System.out.println(String.format("%02d",jam) + ":" + String.format("%02d", menit) + ":" + String.format("%02d",detik1));
                    }
                }
                else {
                    jam -= 24;
                    
                    if (jam == 5) {
                        System.out.println("Pagi");
                        System.out.println(String.format("%02d",jam) + ":" + String.format("%02d", menit) + ":" + String.format("%02d",detik1));
                    }
                    else {
                        System.out.println("Selamat Malam");
                        System.out.println(String.format("%02d",jam) + ":" + String.format("%02d", menit) + ":" + String.format("%02d",detik1));
                    }
                }
                
            }
            else {
                System.out.println("Mohon Maaf, Data Tidak Valid");
                System.out.println("Silahkan Input Ulang Data");
            }
        } ummul.close();
    }
}