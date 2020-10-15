import java.util.Scanner;
public class No2Praktikum {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        System.out.println("Input Detik yang ingin diubah");
        int detik = input.nextInt(); //jumlah detik yang ada = detik
            input.close();

        int km, d1; //KonverMenit = km, jumlah detik yang digunakan oleh menit = d1
          km = detik/60;
          d1 = km*60;
        
        int hj, m1; //hasil akhir jam = hj, jumlah menit yang digunakan = m1
          hj = km/60;
          m1 = hj*60;

        int hm, hd; //hasil akhir menit = hm, hasil akhir detik = hd
          hm = km-m1;
          hd = detik-d1;

            System.out.printf("%d Detik = %02d:%02d:%02d", detik, hj, hm, hd);
    }
}
