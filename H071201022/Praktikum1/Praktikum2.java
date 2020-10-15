import java.util.Scanner;

class Praktikum2 {
    public static void main(String[] args){
         Scanner input = new Scanner (System.in) ;
         System.out.println("Masukkan Detik :");
         int bsec = input.nextInt();
         int sec = bsec%60;

         int bmin = bsec/60;
         int min = bmin%60;

         int hour = bmin/60;
         
         System.out.print(String.format("%02d",hour) + ":");
         System.out.print(String.format("%02d",min) + ":");
         System.out.print(String.format("%02d",sec));

    }
}
