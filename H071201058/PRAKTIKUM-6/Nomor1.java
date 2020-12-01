// Ichsan Takwa
// H071201058
import java.util.Scanner;
public class Nomor1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String kalimat_awal = input.nextLine();
		int jumlah_char = kalimat_awal.length();
		kalimat_awal = kalimat_awal.toUpperCase();
		input.close();
		String kalimat = new String();
		for (int i=0; i < kalimat_awal.length(); i++) {
		  if (kalimat_awal.charAt(i) != ' ') {
		    kalimat += kalimat_awal.charAt(i);
			}
		}
		String palindrome = kalimat.substring(0,(kalimat.length()/2));
	
		for (int i=palindrome.length()-2; i >= 0; i--) {
		 palindrome = palindrome + palindrome.charAt(i);
		}

		String heksadesimal = String.format("%x",jumlah_char*jumlah_char);
		
		char simbol = '!';
		
		if (heksadesimal.codePointAt(0) > 57) {
		  simbol = '?';
		} 
		
		System.out.printf("#%x%s%o%c",jumlah_char*jumlah_char,palindrome,jumlah_char,simbol);
		
	}
}