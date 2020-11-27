import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan kalimat : ");
            String kalimat = input.nextLine();
            String kalimat2 = kalimat.toUpperCase();
            String kalimat3 = kalimat2.replace(" ", "");
            int panjang = kalimat3.length() / 2;
            String kalimat4 = kalimat3.substring(0, panjang);
            String kalimat5 = kalimat3.substring(0, panjang-1);
            StringBuffer palindrom;
            palindrom = new StringBuffer(kalimat5);
            int n = kalimat.length() * kalimat.length();
            String hex = String.format("%x", n);
            int m = kalimat.length();
            String oct = String.format("%o", m);

            if (hex.charAt(0) == 'a' || hex.charAt(0) == 'b' || hex.charAt(0) == 'c' || hex.charAt(0) == 'd' || hex.charAt(0) == 'e' || hex.charAt(0) == 'f') {
                System.out.println("#" + hex + kalimat4 + palindrom.reverse() + oct + "?");
            } else {
                System.out.println("#" + hex + kalimat4 + palindrom.reverse() + oct + "!");
            }
    }
}