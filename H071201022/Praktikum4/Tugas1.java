import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] e = new int[n];

        for (int i = 0; i < n; i++) {
			e[i] = input.nextInt();
		}

        System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
                int p=0;
				for (int k=2; k<=(e[j]>e[i] ? e[i]:e[j]); k++) {
                    if (e[j]%k==0 && e[i]%k==0)
                    p=k;
                }
                if (p==0)
                System.out.printf("%d %d \n", e[i],e[j]);
            }
        }    
    }
}