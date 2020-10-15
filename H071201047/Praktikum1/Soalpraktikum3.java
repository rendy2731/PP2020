import java.util.Scanner;
public class Soalpraktikum3 {

    public static void main(String[] args) {
        Scanner K = new Scanner(System.in);
        System.out.println("Tinggi menara");
        double h;
        h = K.nextDouble();
        System.out.println("Sudut elevasi dari ujung depan kapal");
        double a;
        a = K.nextDouble();
        System.out.println("Sudut elevasi dari ujung belakang kapal");
        double b;
        b = K.nextDouble();

        if(90 > a){
            double Tana;
            Tana = (double) Math.tan(Math.toRadians(a));
            double Tanb;
            Tanb = (double) Math.tan(Math.toRadians(b));
            double x;
            double y;
            y = h * Tana;
            x = y -(h * Tanb);
            System.out.println("Panjang kapal ");
            System.out.printf("%.1f m", x);


        }
    }
    
}
