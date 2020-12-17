import java.util.Scanner;
import java.util.Random;

class TP5No2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String serialNumber = generateSerial(n,m);
		System.out.println(serialNumber);	
	}

	public static String generateSerial(int n, int m) {
		Random rnd = new Random();
		StringBuilder strBuild = new StringBuilder();
		int[][] numbers = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				numbers[i][j] = rnd.nextInt(9);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= m; j++) {
				if (j < m) {
					strBuild = strBuild.append(numbers[i][j]);
				} else if (j == m) {
					strBuild = strBuild.append(i == n - 1 ? "" : "-");
				}
			}
		}
		String str = strBuild.toString();
		return str;
	}
}