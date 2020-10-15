import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("detik =");
        int detik = userInput.nextInt();

        int jam = detik/3600;
        int sisa = detik%3600;
        int menit = sisa/60;
        int sisa1 = sisa%60;
        
         System.out.printf("%02d:%02d:%02d", jam,menit,sisa1);
    }
    
}
