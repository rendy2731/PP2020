import java.util.Scanner;

public class No2Matriks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, j, k;
        i = input.nextInt();
        j = input.nextInt();
        k = input.nextInt();

        int[][] matriks1 = new int[i][j];
        int[][] matriks2 = new int[j][k];
        int[][] matriks3 = new int[i][k];
        int[][] hasil = new int [i][k];

        //perulangan input matriks ordo ij
        for (int l = 0; l < i; l++) {
            for (int m = 0; m < j; m++) {
                matriks1[l][m] = input.nextInt();
            }
        }
        //perulangan input matriks ordo jk
        for (int l = 0; l < j; l++) {
            for (int m = 0; m < k; m++) {
                matriks2[l][m] = input.nextInt();
            }
        }
            input.close();

        //perulangan dimana matriks1 [0][j] akan saya kalikan semua dengan
        //matriks2 [0][0]-[0][k], baru berubah matriks1 [0][j+1] dikalikan lagi
        //dengan matriks2 [0][0]-[0][k]. fungsi hasil untuk menyimpan 1 perkalian
        //dari matriks1 yang akan di tambahkan matriks1 [0][j+1], sehingga mendapatkan
        //matriks3 [i][0]-[i][k]. jadi saya selesaikan perkalian perbaris baru lanjut ke baris selanjutnya.
        for (int a = 0; a < i; a++){
            for (int b = 0; b < j; b++){
                for (int c = 0; c < k; c ++){
                    hasil [a][c] = matriks1 [a][b]* matriks2 [b][c];
                    matriks3 [a][c] += hasil [a][c];
                }
            }
        }

        for (int[] a : matriks3){
            for (int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
