import java.util.Scanner;
// Emha "Fudhol" Ismaulidin
public class Tugas02 {
	public static void main(String[] args) {
		Scanner mtrx = new Scanner(System.in);

		int i = mtrx.nextInt();
		int j = mtrx.nextInt();
		int k = mtrx.nextInt();

		int[][] matrixA = new int[i][j];
		int[][] matrixB = new int[j][k];
		int[][] matrixC = new int[i][k];

        for(int entry = 1; entry <= 2; entry++){	//variabel entry untuk inputan matriks keberapa
		    for(int x = 0; x < (entry == 1 ? i : j); x++){
		        for(int y = 0; y < (entry == 1 ? j : k); y++){
					if(entry == 1)
			        	matrixA[x][y] = mtrx.nextInt();
					else
						matrixB[x][y] = mtrx.nextInt();
		        }
		    }
        }

		for (int m = 0; m < i; m++){
			for (int n = 0; n < k; n++){
				for (int o = 0; o < j; o++){
					matrixC[m][n] += matrixA[m][o] * matrixB[o][n];
				}
				System.out.print(matrixC[m][n] + " ");
			}
			System.out.println();
		}
	}
}