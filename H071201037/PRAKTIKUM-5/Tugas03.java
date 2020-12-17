import java.util.Scanner;

public class Tugas03 {

	//Emha "Fudhol" Ismaulidin
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int hari = obj.nextInt();
		myDay(hari);
	}

	static void myDay(int x) {
		int tahun = x / 360;
		int bulan = (x % 360) / 30;
		int hari = (x % 360) % 30;
		System.out.printf("%d tahun\n%d bulan\n%d hari", tahun, bulan, hari);
	}
}