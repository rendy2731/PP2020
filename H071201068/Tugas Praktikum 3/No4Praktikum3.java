import java.util.Scanner;
public class No4Praktikum3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Total Harga Barang");
        int harga = input.nextInt();
        System.out.println("Masukkan Total Pembayaran");
        int bayar = input.nextInt();
            input.close();
        int kembalian = bayar-harga;

        int pecahan100, pecahan50, pecahan20, pecahan10, pecahan5, pecahan2, pecahan1;
        pecahan100 = 0; pecahan50 = 0; pecahan20 = 0; pecahan10 = 0;
        pecahan5 = 0; pecahan2 = 0; pecahan1 = 0;

        while (kembalian>0){
            for (; kembalian>=100000; kembalian-=100000){
                pecahan100++;
            }
            for (; kembalian>=50000; kembalian-=50000){
                pecahan50++;
            }
            for (; kembalian>=20000; kembalian-=20000){
                pecahan20++;
            }
            for (; kembalian>=10000; kembalian-=10000){
                pecahan10++;
            }
            for (; kembalian>=5000; kembalian-=5000){
                pecahan5++;
            }
            for (; kembalian>=2000; kembalian-=2000){
                pecahan2++;
            }
            for (; kembalian>=1000; kembalian-=1000){
                pecahan1++;
            }
        }
        System.out.printf("%d Uang Rp. 100.000\n", pecahan100);
        System.out.printf("%d Uang Rp. 50.000\n", pecahan50);
        System.out.printf("%d Uang Rp. 20.000\n", pecahan20);
        System.out.printf("%d Uang Rp. 10.000\n", pecahan10);
        System.out.printf("%d Uang Rp. 5.000\n", pecahan5);
        System.out.printf("%d Uang Rp. 2.000\n", pecahan2);
        System.out.printf("%d Uang Rp. 1.000\n", pecahan1);
    }
}
