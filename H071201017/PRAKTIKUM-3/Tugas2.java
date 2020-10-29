/*
 * @author Ummul
 * Don't Copyright
 */
import java.util.Scanner;
public class Tugas2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Input Nilai X :");
            int x = input.nextInt();
            System.out.println("Input Nilai Y :");
            int y = input.nextInt();
            int i = 1;
        
            if (x < y) {
                while (i <= y){
            
                    if(i % x == 0)
                        System.out.println(i+" ");
                    else
                        System.out.print(i+" ");
            
                i++;
                }
            } 
            else {
                System.out.println("Mohon Maaf, Input Nilai X Harus Lebih Kecil Dari Y");
                System.out.println("Silahkan Input Ulang Data");
            }
        } 
        catch(Exception e) {
            System.out.println("Mohon Maaf, Data Yang Diinput Harus Bilangan Bulat");
        }
    }
}
