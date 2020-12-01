import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
         /* Konversi detik ==> jam : menit : detik
          * Nama : Ichsan Takwa
          * NIM  : H071201058                        */
        Scanner inputan = new Scanner(System.in); 
        System.out.print("detik : ");
        int InputDetik = inputan.nextInt(); inputan.close();
        int jam = InputDetik/3600;
        int menit = (InputDetik%3600)/60;
        int detik = InputDetik%60;
        System.out.printf("%02d : %02d : %02d",jam,menit,detik);
    }
}
