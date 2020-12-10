import java.util.*;
import java.io.*;

public class Soalpraktikum82 {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner A = new Scanner (System.in);
      FileWriter fileWrite = null;
      PrintWriter printWrite = null;
      FileReader baca = null;
      BufferedReader buffRead = null;

      try {
         String firstFile = A.next();                                            
         String secondFile = A.next();                                           
         A.close();
         baca= new FileReader(String.format("%s.txt",firstFile));
         buffRead = new BufferedReader(baca);
         fileWrite = new FileWriter(String.format("%s.txt", secondFile));
         printWrite = new PrintWriter(fileWrite);

         String test;

         int max = 0;
         while ((test = buffRead.readLine()) != null){
            max = test.length() > max ? test.length() : max;
         }
         baca= new FileReader(String.format("%s.txt",firstFile));
         buffRead = new BufferedReader(baca);

         String test1;

         while ((test1 = buffRead.readLine()) != null) {
                printWrite.write(String.format("%"+max+"s\n", test1));
         }

      } catch (IOException ioe){
         System.out.println("Gagal");
      } finally {
                try {
                        if (fileWrite != null){
                            System.out.println("Berhasil");
                            fileWrite.close();
            } 
                if (baca != null){
               baca.close();
            }
         }     catch (IOException ioe){
                    System.out.println(ioe.getMessage());
         }
      }
   }
}  