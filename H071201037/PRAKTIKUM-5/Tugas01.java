import java.util.Scanner;

public class Tugas01 {

	//Emha "Fudhol" Ismaulidin
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int gcd = cariFPB(a, b);
		System.out.printf("FPB dari %d dan %d adalah %d", a, b, gcd);
	}

	static int cariFPB(int a, int b) {
		int fpb = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) 
				fpb = i;
		}
		return fpb;
	}
}