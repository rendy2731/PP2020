import java.util.Scanner;
public class Nomor4 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int harga = inputan.nextInt();
        int bayar = inputan.nextInt();
        int kembalian = bayar - harga;
        int k100rp = 0;
        int k50rp = 0;
        int k20rp = 0;
        int k10rp = 0;
        int k5rp = 0;
        int k2rp = 0;
        int k1rp = 0;
        inputan.close();

        while (kembalian > 0) {
            if (kembalian >= 100000) {
                kembalian -= 100000;
                k100rp++;
            } else if (kembalian >= 50000) {
                kembalian -= 50000;
                k50rp++;
            } else if (kembalian >= 20000) {
                kembalian -= 20000;
                k20rp++;
            } else if (kembalian >= 10000) {
                kembalian -= 10000;
                k10rp++;
            } else if (kembalian >= 5000) {
                kembalian -= 5000;
                k5rp++;
            } else if (kembalian >= 2000) {
                kembalian -= 2000;
                k2rp++;
            } else {
                kembalian -= 1000;
                k1rp++;
            }
        }
    System.out.println(k100rp+ " uang Rp. 100.000");
    System.out.println(k50rp+ " uang Rp. 50.000");
    System.out.println(k20rp+ " uang Rp. 20.000");
    System.out.println(k10rp+ " uang Rp. 10.000");
    System.out.println(k5rp+ " uang Rp. 5.000");
    System.out.println(k2rp+ " uang Rp. 2.000");
    System.out.println(k1rp+ " uang Rp. 1.000");
    }
}
