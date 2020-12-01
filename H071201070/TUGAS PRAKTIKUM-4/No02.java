import java.util.Scanner;

public class No02 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("|----------------------|");
        System.out.println("  Masukkan nilai i j k ");
        System.out.println("|----------------------|");
        int i = inputan.nextInt();
        int j = inputan.nextInt();
        int k = inputan.nextInt();

        int matriksA[][] = new int[i][j];
        int matriksB[][] = new int[j][k];

        // for (int h = 1; h <= 2; h++) {
        for (int l = 0; l < i; l++) {
            for (int m = 0; m < j; m++) {
                matriksA[l][m] = inputan.nextInt();
                // System.out.println(matriksA[l][m]);
            }
        }
        for (int l = 0; l < j; l++) {
            for (int m = 0; m < k; m++) {
                matriksB[l][m] = inputan.nextInt();
                // System.out.println(matriksB[l][m]);
            }
        }

        for (int n = 0; n < i; n++) {
            for (int p = 0; p < k; p++) {
                int count = 0;
                for (int q = 0; q < j; q++) {
                    count += matriksA[n][q] * matriksB[q][p];
                }
                System.out.print(count + " ");
            }
            System.out.println();

        }

    }
}

// A[0][0] + B[0][0] * A[0][1] + B[1][0] A[0][0] + B[1][0] * A[0][1] + B[1][1]
// A[1][0] + B[0][0] * A[1][1] + B[1][0] A[1][0] + B[1][0] * A[1][1] + B[1][1]