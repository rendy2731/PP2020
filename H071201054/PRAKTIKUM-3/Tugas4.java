import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner ang = new Scanner(System.in);
        int harga = ang.nextInt();
        int uang = ang.nextInt();
        int uang1 = 0;
        int uang2 = 0;
        int uang5 = 0;
        int uang10 = 0;
        int uang20 = 0;
        int uang50 = 0;
        int uang100 = 0; 
         int kembalian = uang - harga;

        while (kembalian >= 10000){
              
            if (kembalian >= 100000){
                kembalian -= 100000;
                uang100++;
            } 
            else if (kembalian >= 50000){
                kembalian -= 50000;
                uang50++;
            } 
            else if (kembalian >= 20000){
                kembalian -= 20000;
                uang20++;
            } 
            else if (kembalian >= 10000){
                kembalian -= 10000;
                uang10++;
            } 
            else if (kembalian >= 5000){
                kembalian -= 5000;
                uang5++;
            } 
            else if (kembalian >= 2000){
                kembalian -= 2000;
                uang2++;
            } 
            else if (kembalian >= 1000){
                kembalian -= 1000;
                uang1++;
            }
        }
        System.out.println(uang100 + " uang Rp. 100.000");
        System.out.println(uang50 + " uang Rp. 50.000");
        System.out.println(uang20 + " uang Rp. 20.000");
        System.out.println(uang10 + " uang Rp. 10.000");
        System.out.println(uang5 + " uang Rp. 5.000");
        System.out.println(uang2 + " uang Rp. 2.000");
        System.out.println(uang1 + " uang Rp. 1.000");

    }

    
}
