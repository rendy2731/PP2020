import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan kalimat dengan karakter minimal 16 : ");
            String kalimat = input.nextLine();
            String[][] matriks = new String[4][4];

            if (kalimat.length() >= 16) {
                kalimat = charCodePointAt(kalimat);
                int count = 0;
                int character = charArray(kalimat);
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        matriks[i][j] = "";
                        for (int k = 0; k < character; k++) {
                            if (count < kalimat.length()) {
                                matriks[i][j] += kalimat.charAt(count);
                            } else {
                                matriks[i][j] += '?';
                            }
                            count++;
                        }
                    }
                }
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(matriks[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Jumlah karakter tidak cukup.");
            }
    }

    static String charCodePointAt(String a) {
        int hurufGanjil;
        char hurufGenap;
        String kataBaru = "";
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 != 0) {
                hurufGanjil = Character.codePointAt(a, i);
                kataBaru += hurufGanjil;
            } else {
                hurufGenap = a.charAt(i);
                kataBaru += hurufGenap;
            }
        }
        return kataBaru;
    }

    static int charArray(String a) {
        int character = 0;
        while ((16 * character) < a.length()) {
            character++;
        }
        return character;
    }
}