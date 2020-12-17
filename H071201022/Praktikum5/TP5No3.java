import java.util.Scanner;

class TP5No3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int dd = obj.nextInt();
        System.out.println();
		myDay(dd);
	}

	static void myDay(int x) {
		int yy = x / 360;
		int mm = (x % 360) / 30;
		int dd = (x % 360) % 30;
		System.out.printf("%d tahun\n%d bulan\n%d hari", yy, mm, dd);
	}
}