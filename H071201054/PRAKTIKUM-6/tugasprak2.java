import java.util.Scanner;
public class tugasprak2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String kalimat = user.nextLine();
        String kalimat_baru = "";

        for (int i = 0; i < kalimat.length(); i++) { 
            int index = 0;
            if (i % 2 != 0) {
                index = Character.codePointAt(kalimat, i);
                kalimat_baru += index;
            } else {
                kalimat_baru += kalimat.charAt(i);
            }  
        }
        while (kalimat_baru.length() % 16 != 0) {
            kalimat_baru += "?";
        }
        int bagi_karakter = kalimat_baru.length() / 16;
            
        String[] karakter = new String[16];
        int x;
        x = 0;
        char[] kode = kalimat_baru.toCharArray();
        for (int i = 0; i < karakter.length; i++) {
            karakter[i] = "";
        }
        for (int i = 0; i < karakter.length; i++) {
            while (x < bagi_karakter) {
                karakter[i] += kode[x];
                x++;
            } bagi_karakter += kalimat_baru.length() / 16;
        }
        String[][] matriks = new String[4][4];
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = "";
            }
        }
        x = 0;
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] += karakter[x];
                x++;
            }
        }
        for (String[] a : matriks) {
            for (String b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
