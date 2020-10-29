/*
 * @author Ummul
 * Don't Copyright
 */
import java.util.Scanner;
public class Tugas1 {
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        
        try {
            System.out.println("Input Nilai X :");
            int x = num.nextInt();
            System.out.println("Input Nilai Y :");
            int y = num.nextInt();
               
            for (int i = x; i <= y; i++) {
            
                if (i % 2 == 0) 
                    if (i > 0) 
                        System.out.println(i + "  Genap Positif ");
                    else if (i < 0) 
                        System.out.println(i + " Genap Negatif ");
                    else 
                        System.out.println(i + "  Nol ");
                
                else
                    if (i > 0) 
                        System.out.println(i + "  Ganjil Positif ");
                    else if (i < 0) 
                        System.out.println(i + " Ganjil Negatif ");
                    else 
                        System.out.println(i + "  Nol ");
            }
            for (int i = x; i >= y; i--) {
            
                if (i % 2 == 0) 
                    if (i > 0) 
                        System.out.println(i + "  Genap Positif ");
                    else if (i < 0) 
                        System.out.println(i + " Genap Negatif ");
                    else 
                        System.out.println(i + "  Nol ");
                 
                else
                    if (i > 0) 
                        System.out.println(i + "  Ganjil Positif ");
                    else if (i < 0) 
                        System.out.println(i + " Ganjil Negatif ");
                
                    else 
                        System.out.println(i + "  Nol ");
            } 
        }
        catch (Exception e){
            System.out.println("Mohon Maaf, Data Yang Diinput Harus Bilangan Bulat");
        }
    }
}
