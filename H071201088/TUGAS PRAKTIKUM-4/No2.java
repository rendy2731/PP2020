import java.util.Scanner;

class No2 {
    public static void main(String[] args) {
        Scanner aqila = new Scanner(System.in);
        int i = aqila.nextInt();
        int j = aqila.nextInt();
        int k = aqila.nextInt();

        System.out.println("\n MATRIKS 1 =");
        int[][] matriks1 = new int[i][j];
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                matriks1[a][b] = aqila.nextInt();

            }
        }

        System.out.println("\n MATRIKS 2 =");
        int[][] matriks2 = new int[j][k];
        for (int a = 0; a < j; a++) {
            for (int b = 0; b < k; b++) {
                matriks2[a][b] = aqila.nextInt();

            }

        }
        System.out.println("\n HASIL PERKALIAN");
        for (int a = 0; a < i; a++) {
            for (int b = 0; b < k; b++) {
                int hasil = 0;
                for (int c = 0; c < j; c++) {
                    hasil += matriks1[a][c] * matriks2[c][b];
                }
                System.out.print(hasil + " ");
            }
            System.out.println();
        }
    }
}