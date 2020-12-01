/*
 * @author Ummul
 */
import java.util.Scanner;
public class Tugas1 {
    public static void main (String[] args) {
        Scanner aot = new Scanner(System.in);
        String kalimat, processedWord, hexadecimal, octal, simbol;
        System.out.println("Input Kalimat :");
        kalimat = aot.nextLine();
        int wordLen = (int)Math.ceil((double)kalimat.length()/2);
        processedWord = kalimat.substring(0, wordLen).replaceAll("\\s","").toUpperCase();
        
        for (int i = processedWord.length()-2; i >= 0; i--){
            processedWord += processedWord.charAt(i);
        }
        hexadecimal = String.format("%x",kalimat.length()*kalimat.length()) ;
        octal = String.format("%o",kalimat.length()) ;
        simbol = hexadecimal.charAt(0) >= 48 && hexadecimal.charAt(0) <= 57? "!" : "?";
        
        System.out.printf("#%s%s%s%s\n", hexadecimal, processedWord, octal, simbol);
    }
}