import java.util.Scanner;

class TP5No1 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();
        int gcd = cariFPB(x, y);
        System.out.println();
		System.out.printf("FPB dari %d dan %d adalah %d", x, y, gcd);
	}

	static int cariFPB(int x, int y) {
		int fpb = 0;
		for (int i = 1; i <= x && i <= x; i++) {
			if (x % i == 0 && y % i == 0) 
				fpb = i;
		}
		return fpb;
	}
}