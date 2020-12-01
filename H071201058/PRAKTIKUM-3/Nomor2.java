import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int x = inputan.nextInt();
        int y = inputan.nextInt();
        inputan.close();
        int angka = 1;
        if (x <= y) {
            while (angka <= y) {
                for (int i = 0; i < x; i++) {
                    System.out.print(angka+ " "); 
                    angka++;
                    if (angka > y) {
                        break;
                    }  
                }
                System.out.println();
            }
        } else System.out.println("Data yang di masukkan tidak sesuai");

    }
}
