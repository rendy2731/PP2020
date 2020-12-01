import java.util.Scanner;
public class Nomor3 {

    public static void main(String[] args) {
         /* Konversi detik ==> jam : menit : detik
          * Nama : Ichsan Takwa
          * NIM  : H071201058  */
        Scanner data = new Scanner(System.in);
        System.out.print("Ketinggian menara (h) : ");
        int h = data.nextInt();
        System.out.print("Sudut elevansi belakang kapal (a) : ");
        int a = data.nextInt();
        System.out.print("Sudut elevansi depan kapal (b) : ");
        int b = data.nextInt();
        
        data.close();

    if ((90>a)&(a>b)) {
        double Pkapal = (Math.tan(Math.toRadians(a))*h)-((Math.tan(Math.toRadians(b))*h));
        System.out.printf("%.1f m",Pkapal);
       } else System.out.println("Tidak memenuhi");
    }
}