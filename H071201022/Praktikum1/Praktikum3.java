import java.util.Scanner;
import java.lang.Math;


class Praktikum3 {
    public static void main(String[] args) {
        Praktikum3 pK = new Praktikum3();
        Scanner scanner = new Scanner(System.in);
        int b,a;
        float h;

        System.out.println("Masukkan Tinggi Menara(m) :");
        h = scanner.nextFloat();
        System.out.println("Masukkan Sudut elevasi pengamat terhadap ujung belakang kapal :");
        a = scanner.nextInt();
        System.out.println("Masukkan Sudut elevasi pengamat terhadap ujung depan kapal :");
        b = scanner.nextInt();

        if (a<90 && a>b)
        {
            System.out.printf("Panjang Kapal tersebut adalah = %.1f m\n", pK.PanjangKapal(h,a,b));
        } else {
            System.out.println("Data yang anda input salah");
        }
    }
    private float PanjangKapal(float x, float y, float z)
    {
        y = x*(float)Math.tan(Math.toRadians(y));
        z = x*(float)Math.tan(Math.toRadians(z));
        return y-z;
    }
}

