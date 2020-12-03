import java.util.Scanner;

public class Soalpraktikum53 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int days = obj.nextInt();
		myDay(days);
	}

	static void myDay(int x) {
		int years = x / 365;
		int months = (x % 365) / 30;
		int days = (x % 365) % 30;
		System.out.printf("%d tahun\n%d bulan\n%d hari", years, months, days);
	}
}