import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Nilai X (Nilai Awal):");
            int x = input.nextInt();
            System.out.println("Masukkan Nilai Y (Nilai Akhir):");
            int y = input.nextInt();
            
            System.out.println("\nRentang Nilai : ");
            if (x < y) {
                for (int i = x; i <= y; i++) {
                    if (i%2 == 0) {
                        if (i < 0) {
                            System.out.println(i + " genap negatif");
                        } else if (i > 0) {
                            System.out.println(i + " genap positif");
                        } else {
                            System.out.println(i + " nol");
                        }
                    } else {
                        if (i < 0) {
                            System.out.println(i + " ganjil negatif");
                        } else {
                            System.out.println(i + " ganjil positif");
                        }
                    }
                }            
            } else {
                for (int i = y; i <= x; i++) {
                    if (i%2 == 0) {
                        if (i < 0) {
                            System.out.println(i + " genap negatif");
                        } else if (i > 0) {
                            System.out.println(i + " genap positif");
                        } else {
                            System.out.println(i + " nol");
                        }
                    } else {
                        if (i < 0) {
                            System.out.println(i + " ganjil negatif");
                        } else {
                            System.out.println(i + " ganjil positif");
                        }
                    }    
                }
            }
    }        
}            