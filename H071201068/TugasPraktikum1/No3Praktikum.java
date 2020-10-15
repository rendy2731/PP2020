import java.util.Scanner;
public class No3Praktikum {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.println("Silahkan Masukkan Ketinggian Menara (m)");
        int h = input.nextInt();

        System.out.println("Silahkan Masukkan Sudut Elevasi Terhadap Sisi Belakang Kapal");
        int a = input.nextInt();
        
        System.out.println("Silahkan Masukkan Sudut Elevasi Terhadap Sisi Depan Kapal");
        int b = input.nextInt();
            input.close();  

            if (90<=a){
                System.out.println("TERJADI KESALAHAN. Nilai Sudut Elevasi Terhadap Sisi Belakang Kapal Salah");
                System.out.println("Silahkan Coba lagi");
            }else if (a<=b){
                System.out.println("TERJADI KESALAHAN. Nilai Sudut Elevasi Terhadap Sisi Depan Kapal Salah");
                System.out.println("Silahkan Coba lagi");
            }else{
                 //x1 = Panjang jarak dari menara ke sisi belakang kapal
                 //x2 = Panjang jarak dari menara ke sisi depan kapal
                double x1, x2;
                x1 = h*Math.tan(Math.toRadians((double)a));
                x2 = h*Math.tan(Math.toRadians((double)b));

                double pk; //panjang kapal = pk
                pk = x1 - x2;
                System.out.printf("Kapal tersebut memiliki ukuran panjang %.1f m", pk);
            }
    }
}
