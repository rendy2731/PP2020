import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);

        System.out.print("h =");
        int h = userInput.nextInt();
        System.out.print("a =");
        int a = userInput.nextInt();
        System.out.print("b =");
        int b = userInput.nextInt();
        
        double BD,DC,BC;
        BD = (Math.tan(Math.toRadians(a))*(double)h);
        DC = (Math.tan(Math.toRadians(b))*(double)h);
        BC = BD - DC;
            //BC = panjang kapal
            //DC = jarak kapal ke menara
            //BD = panjang kapal + jarak kapal ke menara

        if (90>a&&a>b){
            System.out.printf("Panjang kapal = %.1f m", BC);
            
        } else {
            System.out.println("Nilai tidak memenuhi");
        }
        
    
    }

}