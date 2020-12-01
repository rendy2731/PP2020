import java.util.Scanner;
public class Tugaspraktikum2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int m = user.nextInt();
        int n = user.nextInt();
        int o = user.nextInt();
        int hasil;
        
        System.out.println("matriks A ");
        int[][] matriks_a = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matriks_a[i][j] = user.nextInt();
            }
        } 
        System.out.println("matriks B ");
        int[][] matriks_b = new int[n][o];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < o; j++){
                matriks_b[i][j] = user.nextInt();
            }
        }
        System.out.println("matriks C (hasil perkalian)");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < o; j++){
                hasil = 0;
                for (int k = 0; k < n; k++){
                    hasil += matriks_a[i][k] * matriks_b[k][j];
                }
                System.out.print(hasil + " ");
            }
            System.out.println();
        }


        
        



    }
    
}
