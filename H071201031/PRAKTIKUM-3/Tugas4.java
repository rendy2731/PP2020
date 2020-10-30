import java.util.Scanner;
class Tugas4 {      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seratus = 0;
        int limpul = 0;
        int duapul = 0;
        int sepuluh = 0;
        int lima = 0;
        int dua = 0;
        int seribu = 0;
        System.out.println("Masukkan harga barang : ");
        int harga = input.nextInt();
        System.out.println("Masukkan jumlah uang :");
        int uang = input.nextInt();
        
        int kembalian = uang-harga;

        if (uang > harga) {
            while (kembalian > 0) {
                if (kembalian-100000 >= 0) {
                    kembalian -= 100000;
                    seratus++;
                } else if (kembalian-50000 >= 0) {
                    kembalian -= 50000;
                    limpul++;
                } else if (kembalian-20000 >= 0) {
                    kembalian -= 20000;
                    duapul++;
                } else if (kembalian-10000 >= 0) {
                    kembalian -= 10000;
                    sepuluh++;
                } else if (kembalian-5000 >= 0) {
                    kembalian -= 5000;
                    lima++;
                } else if (kembalian-2000 >= 0) {
                    kembalian -= 2000;
                    dua++;
                } else {
                    kembalian -= 1000;
                    if (kembalian == 0)
                        seribu++;
                }
            }
            System.out.println("\nDetail Kembalian : ");
            System.out.println(seratus + " lembar uang Rp 100.000");
            System.out.println(limpul + " lembar uang Rp 50.000");
            System.out.println(duapul + " lembar uang Rp 20.000");
            System.out.println(sepuluh + " lembar uang Rp 10.000");
            System.out.println(lima + " lembar uang Rp 5.000");
            System.out.println(dua + " lembar uang Rp 2.000");
            System.out.println(seribu + " lembar uang Rp 1.000");
        } else {
            System.out.println("Uang anda tidak cukup.");
        }
    }
}