/*
 * @author User
 */
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner levi = new Scanner(System.in);
        
        System.out.println("Input Ukuran Matriks : ");
        int i = levi.nextInt();
        int j = levi.nextInt();
        int k = levi.nextInt();
        int [][] matriksA = new int [i][j];
        int [][] matriksB = new int [j][k];
        
        System.out.println("Input Matriks A : ");
        for (int a = 0; a < i ; a++) {
            for (int b = 0; b < j; b++) 
                matriksA [a][b] = levi.nextInt();
        }
        System.out.println("Input Matriks B : ");
        for (int b = 0; b < j; b++) {
            for (int c = 0; c < k; c++) 
                matriksB [b][c] = levi.nextInt();
        }
        System.out.println("Hasil : ");
        for (int a = 0; a < i; a++) {
            for (int c = 0; c < k; c++) {
                int hasil = 0;
                for (int b = 0; b < j; b++) {
                    hasil += matriksA[a][b]*matriksB[b][c];
                }
                System.out.print(hasil + " ");
            }
            System.out.println();
        }
    }
}
