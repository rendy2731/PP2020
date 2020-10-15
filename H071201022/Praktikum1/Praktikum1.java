import java.util.Scanner;
import java.text.DecimalFormat;

class Praktikum1 {
    public static void main(String[] args){
         Scanner input = new Scanner (System.in) ;
         System.out.println("Masukkan waktu :");
         int t = input.nextInt();
         System.out.println("Masukkan kecepatan :");
         int v = input.nextInt();
         double bensin = (v * t) / 14.0;
         
         DecimalFormat df = new DecimalFormat("#.###");

         System.out.println("Bensin yang digunakan : " + df.format(bensin) + " liter");

    }
}