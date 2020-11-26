import java.util.Scanner;
class No01 {
    public static void main(String[] args) {
        System.out.println("|-----------------------------|");
        System.out.println("|  Silahkan masukkan kalimat  |");
        System.out.println("|-----------------------------|");
        Scanner inputan = new Scanner(System.in);
        String word = inputan.nextLine();
        int count = word.length();

        // hexadecimal
        int totKalimat = word.length() * word.length();
        String hex = String.format("%x", totKalimat);

        // octal
        String oct = String.format("%o", count);

        // setengah kalimat
        word = word.replace(" ", "");
        int kalimat1 = word.length() / 2;
        String word1 = word.replaceAll("\\s+", "");
        String result1 = "";
        for (int i = 0; i < kalimat1 - 1; i++) {
            result1 += word1.charAt(i);
        }

        // palindrome
        int kalimat2 = word.length();
        String word2 = word.replaceAll("\\s+", "");
        int tanpaSpasi = word2.length() / 2;
        String result2 = "";
        for (int i = (tanpaSpasi - 1); i >= 0; i--) {
            result2 += word2.charAt(i);
        }

        // simbol
        char ket = ' ';
        if (Character.isDigit(hex.charAt(0))) {
            ket = '!';
        } else {
            ket = '?';
        }

        // cetak hasil
        System.out.println("\n----HASIL----");
        System.out.print("#" + hex + result1.toUpperCase() + result2.toUpperCase() + oct + ket);
    }

}