import java.util.Scanner;
import java.text.DecimalFormat;
class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("h = tinggi menara");
            System.out.println("a = sudut elevasi pengamat terhadap ujung belakang kapal");
            System.out.println("b = sudut elevasi pengamat terhadap ujung depan kapal");
            System.out.println("Masukkan nilai h [enter] nilai a [enter] nilai b");
            double h = input.nextDouble();
            double a = input.nextDouble();
            double b = input.nextDouble();

            double x = h * Math.tan(Math.toRadians(a));
            double y = h * Math.tan(Math.toRadians(b));
            double m = (x - y);

            DecimalFormat df = new DecimalFormat("#.#");

            if (90 > a && a > b) {
                System.out.println("Panjang kapal = " + df.format(m) + " m");
            }else{
                System.out.println("Nilai yang dimasukkan tidak sesuai. Mohon periksa kembali.");
            }
    }
}         