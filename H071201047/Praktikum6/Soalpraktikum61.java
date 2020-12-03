import java.util.Scanner;

public class Soalpraktikum61 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);

        String kata = A.nextLine().toUpperCase();
        System.out.print("#" + hexadecimal(kata) + palindromString(kata) + octal(kata));
        
        char hexChar = String.valueOf(hexadecimal(kata)).charAt(0);
            if (hexChar >= 'a' && hexChar <= 'z') {
                System.out.print("?");
        } 
            else {
                System.out.print("!");
        }
    }

    static String setengahKata(String a) {
        String kataBaru = a.replaceAll(" ", "");
        int kataLength = kataBaru.length() / 2;
        kataBaru = kataBaru.substring(0, kataLength);
        
        return kataBaru;
    }

    static String palindromString(String a) {
        String kata = setengahKata(a);
        String palindrome = "";
            for (int i = kata.length() - 2; i >= 0; i--) {
                palindrome += kata.charAt(i);
        }
            String kataBaru = kata.concat(palindrome);
            return kataBaru;
        }

    static String hexadecimal(String a) {
        int kataLength = a.length();
        int desimal = kataLength * kataLength;
        String x = String.format("%x", desimal);
        
        return x;
    }

    static String octal(String a) {
        int kataLength = a.length();
        String oct = String.format("%o", kataLength);
        
        return oct;
    }

}
