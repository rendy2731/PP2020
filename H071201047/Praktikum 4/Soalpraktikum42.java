import java.util.Scanner;

public class Soalpraktikum42 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int N = A.nextInt();
        int M = A.nextInt();
        int F = A.nextInt();
        int sum = 0;
        int[][] matriksa = new int[N][M];
        int[][] matriksb = new int[M][F];
        int[][] matriksc = new int[N][F];

        for (int i = 0; i < matriksa.length; i++) {
        for (int j = 0; j < matriksa[i].length; j++) {
            matriksa[i][j] = A.nextInt();
        }
        }
        for (int i = 0; i < matriksb.length; i++) {
        for (int j = 0; j < matriksb[i].length; j++) {
            matriksb[i][j] = A.nextInt();
        }
        }
        for (int i = 0; i < N; i++) {
        for (int j = 0; j < F; j++) {
        for (int k = 0; k < M; k++) {
            sum = sum + matriksa[i][k] * matriksb[k][j];
        }
            matriksc[i][j] = sum;
            sum = 0;
        System.out.print(matriksc[i][j] + " ");
        }
        System.out.println("//HASIL PERKALIAN\n");
        System.out.println();
    }
    }
}
