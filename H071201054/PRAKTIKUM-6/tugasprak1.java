import java.util.Scanner;
public class tugasprak1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String kalimat = user.nextLine().toUpperCase();
        
        int hexa = kalimat.length() * kalimat.length();
        String hexadecimal = String.format("%x", hexa); 

        int octal = kalimat.length();
        String konversi_octal = String.format("%o", octal); 
        System.out.print("#" + hexadecimal);
    
        String tanpa_spasi = kalimat.replaceAll("\\s+", "");
        int poli = tanpa_spasi.length()/2;
        kalimat = tanpa_spasi;
        for (int i = 0; i < poli; i++) { 
            System.out.print(kalimat.charAt(i));
        } for (int j = poli - 2; j >= 0; j--) { 
            System.out.print(kalimat.charAt(j));
        }
        System.out.print(konversi_octal); 
        
        if (Character.isDigit(hexadecimal.charAt(0))) { 
            System.out.println("!");
    
        } else {
            System.out.println("?");
        }
    }
}
