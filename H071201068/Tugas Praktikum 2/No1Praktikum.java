import java.util.Scanner;
import java.util.InputMismatchException;

public class No1Praktikum {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a, b;
        int totalA, ganjil, positif, genap, negatif;
        totalA=0; 
        ganjil=0; genap=0;
        positif=0; negatif=0;

        System.out.println("====Selamat Datang===");
        System.out.println("Silahkan Masukkan 5 Angka yang Akan dicek");
        while (totalA<5){
            try{
            a = input.nextInt();
            b = Math.abs(a%2);
            
                if (b==1){
                    ganjil++;
                }
                if(a>0){
                    positif++;
                }
                if (a%2==0){
                    genap++;
                }
                if(a<0){
                    negatif++;
                }
                totalA++;
            }
            catch (InputMismatchException salah){
                System.out.println("Inputan Tidak Valid. Inputan Tidak Terdeteksi Sebagai Angka");
                System.out.println("Masukkan Ulang Mulai dari Inputan yang Tidak Terdeteksi !!");
                System.out.println("~~~Silahkan Coba Lagi~~~");
                input.nextLine();
            }
            
        }
                input.close();

        System.out.println();
        System.out.println("Anda memiliki " + genap + " angka genap");
        System.out.println("Anda memiliki " + ganjil + " angka ganjil");
        System.out.println("Anda memiliki " + positif + " angka positif");
        System.out.println("Anda memiliki " + negatif + " angka negatif");
        System.out.println();
        System.out.println("====Silahkan Datang Kembali====");
    }
}