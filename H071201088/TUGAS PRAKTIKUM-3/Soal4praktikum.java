import java.util.Scanner;

public class Soal4praktikum {
    public static void main(String[] args) {
        Scanner aqila = new Scanner (System.in);
        System.out.print("masukkan harga barang =");
        int harga= aqila.nextInt();
        System.out.print("masukkan uang anda    =");
        int uang= aqila.nextInt();
        int kembalian= harga-uang;
        int u100=0;
        int u50=0;
        int u20=0;
        int u10=0;
        int u5=0;
        int u2=0;
        int u1=0;
        System.out.println("***********************************");
        System.out.println("   jadi kembalian nya itu "+kembalian);
        System.out.println("***********************************");
        while (kembalian >=1000){
            if (kembalian >= 100000){
                kembalian-=100000;
                u100++;
            }else if (kembalian >= 50000){
                kembalian-=50000;
                u50++;
            }else if (kembalian >= 20000){
                kembalian-=20000;
                u20++;
            }else if (kembalian >= 10000){
                kembalian-=10000;
                u10++;
            }else if (kembalian >= 5000){
                kembalian-=5000;
                u5++;
            }else if (kembalian >= 2000){
                kembalian-=2000;
                u2++;
            }else {
                kembalian-=1000;
                u1++;
            }
        }
        System.out.println(u100+ " uang Rp. 100.000");
        System.out.println(u50+ " uang Rp. 50.000");
        System.out.println(u20+ " uang Rp. 20.000");
        System.out.println(u10+ " uang Rp. 10.000");
        System.out.println(u5+ " uang Rp. 5.000");
        System.out.println(u2+ " uang Rp. 2.000");
        System.out.println(u1+ " uang Rp. 1.000");

        

     
    }
}
