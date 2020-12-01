import java.util.Scanner;
public class No5Praktikum3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan letak sudut posisi matahari atau bulan");
        while(input.hasNextFloat()){
            float m = input.nextFloat();

            if (m >= 0 && m < 360){
                float banyakDetik = Math.round( m/(float)(0.25/60.0));
                int x = (int)banyakDetik;

                int km, d1; //KonverMenit = km, jumlah detik yang digunakan oleh menit = d1
                km = x/60;
                d1 = km*60;
                
                int hj, m1; //hasil akhir jam = hj, jumlah menit yang digunakan = m1
                hj = km/60;
                m1 = hj*60;
                
                int hm, hd; //hasil akhir menit = hm, hasil akhir detik = hd
                hm = km-m1;
                hd = x-d1;
                
                if (m >= 0 && m < 90){
                    System.out.println("Selamat Pagi");
                    System.out.printf("%02d:%02d:%02d\n", hj+6, hm, hd);
                }else if (m >= 90 && m < 135){
                    System.out.println("Selamat Siang");
                    System.out.printf("%02d:%02d:%02d\n", hj+6, hm, hd);
                }else if (m >= 135 && m < 180){
                    System.out.println("Selamat Sore");
                    System.out.printf("%02d:%02d:%02d\n", hj+6, hm, hd);
                }else if (m >= 180 && m < 270){
                    System.out.println("Selamat Malam");
                    System.out.printf("%02d:%02d:%02d\n", hj+6, hm, hd);
                }else if (m >= 270 && m < 360){
                    System.out.println("Dini Hari");
                    System.out.printf("%02d:%02d:%02d\n", hj-18, hm, hd);
                }
            }
        }
        input.close();
    }
}
