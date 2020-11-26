// Ichsan Takwa
// H071201058
import java.util.Scanner;
public class Nomor2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String kalimat_awal = input.nextLine();
		input.close();
		String kalimat = new String();
		for (int i=0; i<kalimat_awal.length(); i++) {
		
			if (i%2 == 0) {
		  	kalimat += kalimat_awal.charAt(i);
			} else {
			  kalimat += kalimat_awal.codePointAt(i);
			}
		}
		
		int banyak = (int) Math.ceil((double)kalimat.length()/16);
	   
	   	int index = 0;
		for (int i=0; i<16; i++) {
			for (int j=0; j<banyak; j++) {
				if (index < kalimat.length()) {
					System.out.print(kalimat.charAt(index));
				
				} else {
				  System.out.print("?");
				}
				index++;

			}
			if ((i+1)%4 == 0) {
			    System.out.print("\n");
			} else {
			    System.out.print(" ");
			}
		}
	}
}
