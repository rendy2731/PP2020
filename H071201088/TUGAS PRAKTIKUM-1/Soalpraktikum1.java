import java.util.Scanner;
class Soalpraktikum1{


    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        
        System.out.print(" Waktu yang ditempuh= ");
        int t  = A.nextInt();
        System.out.print(" Kecepatan rata-rata= ");
        int v = A.nextInt();
        int l =14;
        float JB= ((float)v*(float)t)/l;

        
        System.out.printf(" jumlah bensin yang digunakan dalam perjalanan= %.3f L",JB);
        
    }
}