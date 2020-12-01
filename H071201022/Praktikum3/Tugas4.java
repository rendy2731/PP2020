import java.util.Scanner;

class Tugas4 {      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cepek = 0;
        int goban = 0;
        int noban = 0;
        int ceban = 0;
        int goceng = 0;
        int noceng = 0;
        int seceng = 0;
        System.out.println("Masukkan harga barang : ");
        int harga = input.nextInt();
        System.out.println("Masukkan jumlah uang : ");
        int uang = input.nextInt();
        
        int kembalian = uang - harga;

        if (uang > harga) {
            while (kembalian > 0) {
                if (kembalian-100000 >= 0) {
                    kembalian -= 100000;
                    cepek++;
                } else if (kembalian-50000 >= 0) {
                    kembalian -= 50000;
                    goban++;
                } else if (kembalian-20000 >= 0) {
                    kembalian -= 20000;
                    noban++;
                } else if (kembalian-10000 >= 0) {
                    kembalian -= 10000;
                    ceban++;
                } else if (kembalian-5000 >= 0) {
                    kembalian -= 5000;
                    goceng++;
                } else if (kembalian-2000 >= 0) {
                    kembalian -= 2000;
                    noceng++;
                } else {
                    kembalian -= 1000;
                    if (kembalian == 0)
                    seceng++;
                }
            }

            System.out.println("\n----------------------------------------------");
            System.out.println(cepek + " uang Rp 100.000");
            System.out.println(goban + " uang Rp 50.000");
            System.out.println(noban + " uang Rp 20.000");
            System.out.println(ceban + " uang Rp 10.000");
            System.out.println(goceng + " uang Rp 5.000");
            System.out.println(noceng + " uang Rp 2.000");
            System.out.println(seceng + " uang Rp 1.000");

        } else {
            System.out.println("Uang anda tidak cukup");
        }
    }
}