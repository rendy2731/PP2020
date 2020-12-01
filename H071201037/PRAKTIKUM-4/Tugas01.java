import java.util.Scanner;
// Emha "Fudhol" Ismaulidin
public class Tugas01 {
	public static void main(String[] args) {
		Scanner deret = new Scanner(System.in);

		int n = deret.nextInt();
		int[] yey = new int[n];

		for (int i = 0; i < n; i++){
			yey[i] = deret.nextInt();
		}
		for (int i = 0; i < n; i++){
			for (int j = i + 1; j < n; j++){
				int min, max;
        		min = yey[i];		//mencari FPB
        		if (min > yey[j]){
        		    min = yey[j];
        		    max = yey[i];
        		}else {
        			min = yey[i];
        			max = yey[j];
        		}
        		int r = max % min;
        		while (r != 0) {
				min = max;
				max = r;
				r = min % max;
				}
        		if (max == 1){
        			if(yey[i] != yey[j]){
						System.out.println(yey[i] + " " + yey[j]);
        			}
        		}
			}
		}
	}
}

