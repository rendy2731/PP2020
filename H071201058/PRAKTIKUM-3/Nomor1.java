import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int x = inputan.nextInt();
        int y = inputan.nextInt();
        inputan.close();
        int i, j;
        if (x < y) {
            i = x;
            j = y;
        } else {
            i = y;
            j = x;
        }

        while (i <= j) {
            System.out.print(i+ " ");
            if (i%2 == 0 && i != 0) {
                System.out.printf("genap ");

            } else if (i%2 != 0) {
                System.out.print("ganjil ");

            } else System.out.print("nol\n");

            if (i > 0) {  
                System.out.print("positif\n");
            } else
            if (i < 0) {  
                System.out.print("negatif\n");
            }
            i++;

        }
    }
}
