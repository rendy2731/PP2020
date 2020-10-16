import java.util.Scanner;

class PanjangKapal {
    public static void main(String[] args) {
        Scanner panjang = new Scanner(System.in);
        System.out.print("Masukkan Panjang Kapal : ");
        double h;
        h = panjang.nextDouble();
        double a;
        a = panjang.nextDouble();
        double b;
        b = panjang.nextDouble();

        if(90 > a){
            double Tana;
            Tana = (double) Math.tan(Math.toRadians(a));
            double Tanb;
            Tanb = (double) Math.tan(Math.toRadians(b));
            double x;
            double y;
            y = h * Tana;
            x = y -(h * Tanb);
            System.out.printf("%.1f m", x);
        }
    }
}
