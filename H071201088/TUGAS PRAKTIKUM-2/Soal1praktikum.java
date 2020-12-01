import java.util.InputMismatchException;
import java.util.Scanner;
public class Soal1praktikum {
    public static void main(String[] args) {
        Scanner aqila = new Scanner (System.in);
        try
         {
            int a = aqila.nextInt();
            int b = aqila.nextInt();
            int c = aqila.nextInt();
            int d = aqila.nextInt();
            int e = aqila.nextInt();
            int genap=0;
            int ganjil= 0;
            int positif=0;
            int negatif=0;
    
            // variable a
            if (a % 2 == 0) {
                genap+=1;
                if (a >= 0 && a != 0) {
                    positif += 1;
                } else if (a < 0 && a != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (a >= 0 && a != 0) {
                    positif += 1;
                } else if (a < 0 && a != 0) {
                    negatif += 1;
                }
            }
        
    
            // variable b
            if (b % 2 == 0) {
                genap += 1;
                if (b >= 0 && b != 0) {
                    positif += 1;
                } else if (b < 0 && b != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (b >= 0 && b != 0) {
                    positif += 1;
                } else if (b < 0 && b != 0) {
                    negatif += 1;
                }
            }
             // variable c
            if (c % 2 == 0) {
                genap += 1;
                if (c >= 0 && c != 0) {
                    positif += 1;
                } else if (c < 0 && c != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (c >= 0 && c != 0) {
                    positif += 1;
                } else if (c < 0 && c != 0) {
                    negatif += 1;
                }
            }
    
             // variable d
            if (d % 2 == 0) {
                genap += 1;
                if (d >= 0 && d != 0) {
                    positif += 1;
                } else if (d < 0 && d != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (d >= 0 && d != 0) {
                    positif += 1;
                } else if (d < 0 && d != 0) {
                    negatif += 1;
                }
            }
             // variable e
            if (e % 2 == 0) {
                genap += 1;
                if (e >= 0 && e != 0) {
                    positif += 1;
                } else if (e < 0 && e != 0) {
                    negatif += 1;
                }
            } else {
                ganjil += 1;
                if (e >= 0 && e != 0) {
                    positif += 1;
                } else if (e < 0 && e != 0) {
                    negatif += 1;
                }
        
            }
            System.out.println("terdapat " +genap+ "  bilangan genap");
            System.out.println("terdapat " +ganjil+ "  bilangan ganjil");
            System.out.println("terdapat " +positif+ "  bilangan positif");
            System.out.println("terdapat " +negatif+  "  bilangan negatif");
       

    
        } catch(InputMismatchException aprillia){
            System.out.print("---INPUTAN ANDA TIDAK VALID MOHON COBA LAGI--- ");
            }
    }            

}
            

                    
                
            
        
    

