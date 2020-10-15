import java.util.Scanner;

public class Soal3Praktikum {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("masukkaan nilai h  (ketinggian) :");
         int h = input.nextInt();
         System.out.print("masukkaan nilai a (sudut elevasi) :");
         int a = input.nextInt();
         System.out.print("masukkaan nilai b (sudut elevasi) :");
         int b  = input.nextInt();
         double BD,CD,BC;
    //untuk mencari nilai tan 
         double tan= Math.tan(Math.toRadians(a));
         double tan1= Math.tan(Math.toRadians(b));
    // rumus phitagoras tan = de(BD)/sa(h)
         BD= tan*(double)h;
    //  rumus phitagoras tan = de(CD)/sa(h)
         CD= tan1*(double)h;
         BC= BD-CD;

         if (90 > a && a > b ){
              System.out.printf("panjang kapal = %.1f m",BC);
         }else {
              System.out.println("Maaf Nilai yang anda masukkan tidak sesuai.Perhatikan ketentuan untuk nilai a dan b \nHarap coba kembali yah..");
         }


    }
}

