import java.util.Scanner;

public class No01 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("|  Silahkan masukkan dua angka  |");
        System.out.println("---------------------------------");
        int n1 = inputan.nextInt();
        int n2 = inputan.nextInt();

        System.out.println("FPB dari " + n1 + " dan " + n2 + " = " + rumus(n1, n2));

    }

    static int rumus(int n1, int n2) {
        int r;
        r = n1 % n2;

        while (r != 0) {
            n2 = n1;
            n1 = r;
            r = n2 % n1;
        }
        return n1;

    }
}