import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang n input integer :");
        int n = input.nextInt();
        System.out.println("Masukkan elemen input integer :");
        int[] e = new int[n];

        for (int i = 0; i < n; i++) {
			e[i] = input.nextInt();
		}

        System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (e[i] % e[j] != 0 && e[j] % e[i] != 0) {
                    System.out.println(e[i] + " " + e[j]);
                }
            }
        }    
    } 
}