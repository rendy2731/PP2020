import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner aqila = new Scanner(System.in);
        String kalimat = aqila.nextLine();
        int code = 0;
        String gabungan = "";

        for (int i = 0; i < kalimat.length(); i++) {
            if (i % 2 == 0) {
                gabungan += kalimat.charAt(i);
            } else {
                code = Character.codePointAt(kalimat, i);
                gabungan += code;
            }

        }
        while (gabungan.length() % 16 != 0) {
            gabungan += "?";
        }
        int pembagian = gabungan.length() / 16;

        String[] inimi = new String[16];

        System.out.println(gabungan);
        int k = 0;
        char[] charKu = gabungan.toCharArray();
        for (int i = 0; i < inimi.length; i++) {
            inimi[i] = "";
        }

        for (int i = 0; i < inimi.length; i++) {
            while (k < pembagian) {
                inimi[i] += charKu[k];
                k++;
            }
            pembagian += gabungan.length() / 16;

        }
        String[][] matriks = new String[4][4];

        for (int i = 0; i < matriks.length; i++) {

            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = "";
            }
        }

        k = 0;
        for (int i = 0; i < matriks.length; i++) {

            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] += inimi[k];
                k++;
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
