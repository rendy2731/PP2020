import java.util.Scanner;

public class Soalpraktikum62 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("MASUKKAN KLIMAT DENGAN MINIMAL 16 KATA:");
        String kalimat = A.nextLine();
        String[][] array = new String[4][4];

        if (kalimat.length() >= 16) {
            kalimat= charCodePointAt(kalimat);
            int count = 0;
            int karakter = charArray(kalimat);

            for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                 array[i][j] = "";
            for (int k = 0; k < karakter; k++) {
            if (count < kalimat.length()) {
                            array[i][j] += kalimat.charAt(count);
        } else {
                array[i][j] += '?';
        }
        count++;
        }
        }
            }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + " ");
        }
            System.out.println();
        }
        }else {
            System.out.println("JUMLAH KARAKTER TIDAK SESUAI ATAU TIDAK CUKUP");
        }
    }

    static String charCodePointAt(String a) {
    int KarakterGanjil;
    char KarakterGenap;
    String KarakterBaru = "";
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 != 0) {
                KarakterGanjil = Character.codePointAt(a, i);
                KarakterBaru += KarakterGanjil;
    }     
            else {
                KarakterGenap = a.charAt(i);
                KarakterBaru += KarakterGenap;
    }
    }
        return KarakterBaru;
    }

    static int charArray(String a) {
        int karakter = 0;
            while ((16 * karakter) < a.length()) {
                karakter++;
        }
            return karakter;
    }

}
