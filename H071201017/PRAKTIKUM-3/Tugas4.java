/*
 * @author User
 * Don't Copyright
 */
import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {
        Scanner duit = new Scanner(System.in);
        
        try {
            int hundred = 0;
            int fifty = 0;
            int twenty = 0;
            int ten = 0;
            int five =0;
            int two = 0;
            int one = 0;
            System.out.println("Input Harga Barang :");
            int harga = duit.nextInt();
            System.out.println("Input Uang Anda :");
            int uang = duit.nextInt();
            
            if (harga < uang) {
                int kembalian = uang - harga;
                
                while (kembalian > 0) {
                    if (kembalian - 100000 >= 0) {
                        kembalian -= 100000;
                        hundred++;
                    }
                    else if (kembalian - 50000 >= 0) {
                        kembalian -= 50000;
                        fifty++;
                    }
                    else if (kembalian - 20000 >= 0) {
                        kembalian -= 20000;
                        twenty++;
                    }
                    else if (kembalian - 10000 >= 0) {
                        kembalian -= 10000;
                        ten++;
                    }
                    else if (kembalian - 5000 >= 0) {
                        kembalian -= 5000;
                        five++;
                    }
                    else if (kembalian - 2000 >= 0) {
                        kembalian -= 2000;
                        two++;
                    }
                    else {
                        kembalian -= 1000;
                        one++;
                    }
                }
                System.out.println(hundred + " uang Rp.100.000");
                System.out.println(fifty + " uang Rp.50.000");
                System.out.println(twenty + " uang Rp.20.000");
                System.out.println(ten + " uang Rp.10.000");
                System.out.println(five + " uang Rp.5.000");
                System.out.println(two + " uang Rp.2.000");
                System.out.println(one + " uang Rp.1.000");
            }
            else if (harga == uang) {
                System.out.println(hundred + " uang Rp.100.000");
                System.out.println(fifty + " uang Rp.50.000");
                System.out.println(twenty + " uang Rp.20.000");
                System.out.println(ten + " uang Rp.10.000");
                System.out.println(five + " uang Rp.5.000");
                System.out.println(two + " uang Rp.2.000");
                System.out.println(one + " uang Rp.1.000");
                System.out.println("Tidak Ada Kembalian, Uang Anda Pas");
            }
            else
                System.out.println("Mohon Maaf, Uang Anda Tidak Cukup");
        }
        catch(Exception e) {
            System.out.println("Mohon Maaf, Data Yang Diinput Salah");
            System.out.println("Silahkan Input Ulang Data");
        }
    }
}
