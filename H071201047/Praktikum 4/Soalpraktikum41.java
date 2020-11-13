import java.util.Scanner;
public class Soalpraktikum41 {
    public static void main(String[] args) {
       Scanner A = new Scanner(System.in);
       int array = A.nextInt();
       int[] nomor = new int[array];

       for (int i = 0; i < array; i++) {
        nomor[i] = A.nextInt();
       }
        for (int i = 0; i < nomor.length; i++) {
        for (int j = i+1; j < nomor.length; j++) {
            int x = 1;
        for ( int n = 2; n <= (nomor[j] >nomor[i] ? nomor[i] : nomor[j]); n++) {
            if (nomor[j] % n == 0 && nomor[i] % n == 0)
                 x = n;
         }
        if ( x == 1)
         System.out.printf(" %d %d \n", nomor[i], nomor[j]);
     }
    }
    }
}