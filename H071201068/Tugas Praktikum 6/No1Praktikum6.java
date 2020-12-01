import java.util.Scanner;

public class No1Praktikum6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Input Kalimat====");
        String kalimatAwal = input.nextLine();
        kalimatAwal = kalimatAwal.toUpperCase();

        char[] stringToChar = tanpaSpasi(kalimatAwal).toCharArray();
        String stringFromChar = "";

        for (int i = 0; i < stringToChar.length / 2; i++) { // ini untuk membuat kata baru yang diambil
            stringFromChar += stringToChar[i];              // setengah dari kata awal tanpa spasi
        }

        System.out.println("\n====Kode yang dihasilkan====");
        String kataPalindrom = buatPalindrom(stringFromChar);
        printFormat(kalimatAwal.length(), kataPalindrom);

        input.close();
    }

    private static String tanpaSpasi(String data) {
        String[] kalimat = data.split(" ");
        String kalimatTanpaSpasi = "";
        for (int i = 0; i < kalimat.length; i++) {
            kalimatTanpaSpasi = kalimatTanpaSpasi.concat(kalimat[i]);
        }
        return kalimatTanpaSpasi;
    }

    private static String buatPalindrom(String data) {
        char[] forPalindrom = data.toCharArray();
        String palindrom = data;
        for (int i = forPalindrom.length - 2; i >= 0; i--) {
            palindrom = palindrom + forPalindrom[i];
        }
        return palindrom;
    }

    private static void printFormat(int jumlahKarakter, String kataPalindrom) {
        int hexaDecimal = jumlahKarakter * jumlahKarakter;
        String cetak = String.format("#%x%s%o", hexaDecimal, kataPalindrom, jumlahKarakter);

        if (cetak.charAt(1) >= '0' && cetak.charAt(1) <= '9') {
            System.out.println(cetak + "!");
        } else {
            System.out.println(cetak + "?");
        }
    }
}