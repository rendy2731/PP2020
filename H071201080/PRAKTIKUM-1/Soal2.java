import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Detik = ");
        int d = read.nextInt();
        // j = jam
        int j = d/3600;
        // sd = sisa detik
        int sd = d-(j*3600);
        // m = menit
        int m = sd/60;
        // dt = detik
        int dt = sd-(m*60);

        System.out.printf("%02d : %02d : %02d",j,m,dt);
    }
}
