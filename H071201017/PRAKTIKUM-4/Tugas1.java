/*
 * @author Ummul
 */
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args){
	Scanner aot = new Scanner(System.in);

	System.out.println("Input Panjang Elemen (n) : ");
	int n = aot.nextInt();
        System.out.println("Input Elemen : ");
	int [] elemen = new int [n];
	
	for (int i = 0; i < n; i++) 
            elemen [i] = aot.nextInt();
        
        for (int i = 0; i < n - 1; i++) {
	    for (int j = i + 1; j < n; j++) {
                int angka1 = elemen[i]; 
                int angka2 = elemen[j];
                
                while (angka1 != angka2) {
                    if (angka1 > angka2) 
                        angka1 -= angka2;
                    
                    else 
                        angka2 -= angka1;
                }
                if (angka1 == 1) 
                    System.out.println(elemen[i] + " " + elemen[j]);
            }
        }
    }
}
