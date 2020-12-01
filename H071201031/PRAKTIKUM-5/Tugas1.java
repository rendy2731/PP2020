import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan dua nilai integer yang dipisahkan oleh enter :");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("\nFPB dari " + a + " dan " + b  + " = " + cariFPB(a, b));
    }
    
    static int cariFPB (int x, int y) {
        if (y <= x && x % y == 0) {
            return y;
        } else if (x < y) {
            return cariFPB(y, x);
        } else {
            return cariFPB(y, x % y);
        }
    }
}