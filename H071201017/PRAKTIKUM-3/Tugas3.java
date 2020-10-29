/*
 * @author Ummmul
 * Don't Copyright
 */
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        
        try {
            System.out.println("Input Elemen ke- :");
            int n = num.nextInt();
            int x = 0;
            int y = 1;
            int next = 0;
           
            for (int i = 0; i < n; i++){
                x = y;
                y = next;
                
                System.out.print( next + " ");
                
                next = x + y;
            }
        }
        catch (Exception e){
            System.out.println("Mohon Maaf, Data Yang Diinput Harus Bilangan Bulat");
        }
    }
}
