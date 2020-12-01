import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Masukkan detik");
            int sec = input.nextInt();
            int secReal = sec%60;

            int m = sec/60;
            int mReal = m%60;

            int h = m/60;

            System.out.print(String.format("%02d",h) + ":");
            System.out.print(String.format("%02d",mReal) + ":");
            System.out.print(String.format("%02d",secReal));
    }
} 