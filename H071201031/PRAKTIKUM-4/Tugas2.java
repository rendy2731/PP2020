import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan input integer i j k :");
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int jumlah = 0;

        int[][] matriksa = new int[i][j];
        int[][] matriksb = new int[j][k];
        int[][] matrikskali = new int[i][k];

        System.out.println("Input Matriks A : ");
        for (int x = 0; x < matriksa.length; x++) {
            for (int y = 0; y < matriksa[x].length; y++) {
                matriksa[x][y] = input.nextInt();
            }
        }

        System.out.println("Input Matriks B :");
        for (int x = 0; x < matriksb.length; x++) {
            for (int y = 0; y < matriksb[x].length; y++) {
                matriksb[x][y] = input.nextInt();
            }
        }
        
        System.out.println("Hasil Perkalian Matriks :");
        for(int x = 0; x < i; x++) {
            for(int y = 0; y < k; y++) {
                for(int z = 0; z < j; z++) {
                    jumlah = jumlah + matriksa[x][z] * matriksb[z][y];
                }
            matrikskali[x][y] = jumlah;
            jumlah = 0;
            System.out.print(matrikskali[x][y] + " ");
            }
        System.out.println();
        }
    }
}