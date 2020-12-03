import java.util.Scanner;

public class Soalpraktikum51 {
	public static void main(String[] args) {
	Scanner A = new Scanner(System.in);
	int bilangan1 = A.nextInt();
	int bilangan2 = A.nextInt();
	System.out.printf("FPB dari %d dan %d adalah %d", bilangan1, bilangan2, cariFPB(bilangan1,bilangan2));
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