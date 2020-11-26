import java.util.Scanner;

public class No2Praktikum6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Input Kalimat====");
        String kalimat = input.nextLine();
        String kalimatModifikasi = modifikasiKalimat(kalimat);
        char[] charKalimat = kalimatModifikasi.toCharArray();
        String[][] matriks = new String[4][4];
        input.close();

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = "";
            }
        }

        int k = 0;                              //variabel k untuk index awal karakter kata
        int l = (charKalimat.length / 16) - 1;  //variabel l untuk index akhir karakter kata 
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                while (k <= l) {
                    matriks[i][j] += charKalimat[k];
                    k++;
                }
                l += charKalimat.length / 16;   //untuk l pertama kali di kurang 1 karena index dimulai dari 0, bukan 1
            }                                   //fungsi charKalimat.length / 16 untuk mengetahui jumlah karakter disetiap kata
        }

        System.out.println("\n====Hasil Matriks====");
        for (String[] a : matriks) {
            for (String b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

    private static String modifikasiKalimat(String kalimat) {
        int code;
        String hasil = "";
        for (int i = 0; i < kalimat.length(); i++) {
            if (i % 2 != 0) {
                code = Character.codePointAt(kalimat, i);
                hasil += code;
            } else {
                hasil += kalimat.charAt(i);
            }
        }

        while (hasil.length() % 16 != 0) {  //perulangan untuk membuat jumlah karakter di kalimatnya dapat dibagi
            hasil += "?";                   //rata kedalam matriks 4x4
        }
        return hasil;
    }
}