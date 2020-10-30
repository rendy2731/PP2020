import java.util.Scanner;
class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("x = nilai awal");
            System.out.println("y = nilai akhir");
            System.out.println("Masukkan nilai x [enter] nilai y");
            int x = input.nextInt();
            int y = input.nextInt();
            
            System.out.println("\nRentang nilai : ");
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