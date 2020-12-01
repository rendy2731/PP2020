import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Masukkan Nilai:");
        int n = obj.nextInt();
        int y = 1;
        int x = 0;
        int count = 2;
        int next;
        System.out.print(x + " " + y + " ");

        for (int i = count; count < n; i++) {
            next = x + y;
            System.out.print(next + " ");
            x = y;
            y = next;
            count = count + 1;
        }
    }
}