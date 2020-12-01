import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
       Scanner ang = new Scanner(System.in);
       int x = ang.nextInt();
       int y = ang.nextInt();
       int d =1;
       
       for (int i = 1; i <= y; i++){
           for (int j = 1; j <= x; j++){ 
                if (d <= y){
                    System.out.print(d + " ");
                    d++;
                 }       
           } System.out.println();
               
       }    
    }
}
