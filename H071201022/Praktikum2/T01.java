import java.util.Scanner;
class T01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Masukkan lima bilangan bulat yang dipisah oleh spasi");
            
            int genap = 0;
            int ganjil = 0;
            int positif = 0;
            int negatif = 0;

        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int e = input.nextInt();
            
            if (a % 2 == 0) {
                genap++;
                if (a > 0) {
                    positif++;
                }else if (a < 0) {
                    negatif++;
                }
            }else{
                ganjil++;
                if (a > 0) {
                    positif++;
                }else if (a < 0) {
                    negatif++;
                }
            }

            if (b % 2 == 0) {
                genap++;
                if (b > 0) {
                    positif++;
                }else if (b < 0) {
                    negatif++;
                }
            }else{
                ganjil++;
                if (b > 0) {
                    positif++;
                }else if (b < 0) {
                    negatif++;
                }
            }

            if (c % 2 == 0) {
                genap++;
                if (c > 0) {
                    positif++;
                }else if (c < 0) {
                    negatif++;
                }
            }else{
                ganjil++;
                if (c > 0) {
                    positif++;
                }else if (c < 0) {
                    negatif++;
                }
            }

            if (d % 2 == 0) {
                genap++;
                if (d > 0) {
                    positif++;
                }else if (d < 0) {
                    negatif++;
                }
            }else{
                ganjil++;
                if (d > 0) {
                    positif++;
                }else if (d < 0) {
                    negatif++;
                }
            }

            if (e % 2 == 0) {
                genap++;
                if (e > 0) {
                    positif++;
                }else if (e < 0) {
                    negatif++;
                }
            }else{
                ganjil++;
                if (e > 0) {
                    positif++;
                }else if (e < 0) {
                    negatif++;
                }
            }
            
            System.out.println(genap + " Angka Genap");
            System.out.println(ganjil + " Angka Ganjil");
            System.out.println(positif + " Angka Positif");
            System.out.println(negatif + " Angka Negatif");

        }catch (Exception error) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}