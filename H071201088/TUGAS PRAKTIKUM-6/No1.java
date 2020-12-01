import java.util.Scanner;

class No1 {
    public static void main(String[] args) {
        Scanner aqila = new Scanner(System.in);
        String kata = aqila.nextLine();
        String noSpasi = kata.replaceAll("\\s+", "");
        int jumlah = kata.length();
        int jumlah2 = noSpasi.length();

        int hexa1 = kata.length() * kata.length();
        String hexa = String.format("%x", hexa1);
        String octal = String.format("%o", jumlah);

        System.out.print("#" + hexa);

        for (int j = 0; j < jumlah2 / 2; j++) {
            kata = noSpasi.toUpperCase();
            System.out.print(kata.charAt(j));
        }

        for (int k = (jumlah2 / 2) - 2; k >= 0; k--) {
            kata = noSpasi.toUpperCase();
            System.out.print(kata.charAt(k));
        }
        System.out.print(octal);
        if (Character.isDigit(hexa.charAt(0))) {
            System.out.println("!");

        } else {
            System.out.println("?");
        }

    }
}