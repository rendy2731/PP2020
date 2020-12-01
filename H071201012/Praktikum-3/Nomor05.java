import java.util.Scanner;

class Nomor05 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        while (input.hasNextFloat()) {
            float m = input.nextFloat();
            System.out.println(" ");
            int sec = (int) (m * 86400 / 360);
            int jam = (sec / 3600) + 6;
            int sisa = sec % 3600;
            int menit = sisa / 60;
            int detik = sisa % 60;

            if (0 <= m && m < 360) {
                if (m >= 0 && m < 90){
                    System.out.println("Selamat Pagi");
                    System.out.printf("%02d:%02d:%02d\n" , jam, menit, detik);   
                    }
                else if (m >= 90 && m < 135){
                    System.out.println("Selamat Siang");
                    System.out.printf("%02d:%02d:%02d\n" , jam, menit, detik);   
                    }
                else if (m >= 135 && m < 180){
                    System.out.println("Selamat Sore");
                    System.out.printf("%02d:%02d:%02d\n" , jam, menit, detik);   
                    }
                else if (m >= 180 && m < 270){
                    System.out.println("Selamat Malam");
                    System.out.printf("%02d:%02d:%02d\n" , jam, menit, detik); 
                }
                else if (m >= 270 && m < 360) {
                    jam -= 24;
                    System.out.println("Dini Hari");
                    System.out.printf("%02d:%02d:%02d\n" , jam, menit, detik); 
                }
            }
            else {
                System.out.println("data tidak valid. input ulang");
                }
            
        }input.close();
    }
}