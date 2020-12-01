/*
 * @author Ummul
 * Don't copyright
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Tugas1 {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);        
               
        try {
            int x, positif=0, negatif=0, genap=0, ganjil=0;
            int angka [] = new int [5];
            System.out.println("Masukkan Angka :");
                       
        for (int i = 0; i<5; i++){
            angka [i] = input.nextInt();
        }
        for (int i = 0; i<5; i++){
            x = angka[i] %2;
            
            if (x==0 || angka[i]==0)
                genap++;
            else
                ganjil++;
            
            if (angka[i] < 0)
                negatif++;
            if (angka[i] > 0) 
                positif++;
            
        }
        System.out.println(genap + " Angka Genap");
        System.out.println(ganjil + " Angka Ganjil");
        System.out.println(positif + " Angka Positif");
        System.out.println(negatif + " Angka Negatif");
        }
        catch (InputMismatchException ime){
            System.out.println("Inputan Tidak Valid");
        }
        
    }
}
