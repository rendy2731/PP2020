import java.util.Scanner;
class Tugas1{
    public static void main(String[] args) {
        Scanner ang = new Scanner(System.in);
        int x = ang.nextInt();
        int y = ang.nextInt();

        if (x < y) {
            for (int i = x; i <= y; i++){
                if (i % 2 == 0 && i < 0){
                    System.out.println(i + " genap negatif");       
                } else if (i % 2 == 0 && i > 0){
                    System.out.println(i + " genap positif");         
                } else if (i % 2 == 1 && i > 0){
                    System.out.println(i + " ganjil positif");
                } else if (i == 0){
                    System.out.println(i + " nol");
                } else {
                    System.out.println(i + " ganjil negatif");
                }
                
            }

        } else if (x > y){
            for (int j = y; j <= x; j++){
                if (j % 2 == 0 && j < 0){
                    System.out.println(j + " genap negatif");       
                } else if (j % 2 == 0 && j > 0){
                    System.out.println(j + " genap positif");         
                } else if (j % 2 == 1 && j > 0){
                    System.out.println(j + " ganjil positif");
                } else if (j == 0){
                    System.out.println(j + " nol");
                } else {
                    System.out.println(j + " ganjil negatif");
                }
                
            }

        }
        
    }
}
