import java.util.Scanner;

public class Tugas01 {

    //Emha "Fudhol" Ismaulidin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kata = scan.nextLine().toUpperCase();
        System.out.print("#" + hexadecimal(kata) + palindromString(kata) + octal(kata));
        // Symbol
        char hexChar = String.valueOf(hexadecimal(kata)).charAt(0);
        if (hexChar >= 'a' && hexChar <= 'z') {
            System.out.print("?");
        } else {
            System.out.print("!");
        }
    }

    // Bagi kata
    static String setengahKata(String a) {
        String kataBaru = a.replaceAll(" ", "");
        int kataLength = kataBaru.length() / 2;
        kataBaru = kataBaru.substring(0, kataLength);
        return kataBaru;
    }

    // Palindrome
    static String palindromString(String a) {
        String kata = setengahKata(a);
        String palindrom = "";
        for (int i = kata.length() - 2; i >= 0; i--) {
            palindrom += kata.charAt(i);
        }
        String kataBaru = kata.concat(palindrom);
        return kataBaru;
    }

    // Hexadecimal
    static String hexadecimal(String a) {
        int kataLength = a.length();
        int decimal = kataLength * kataLength;
        String hex = String.format("%x", decimal);
        return hex;
    }

    // Octal
    static String octal(String a) {
        int kataLength = a.length();
        String oct = String.format("%o", kataLength);
        return oct;
    }

}
