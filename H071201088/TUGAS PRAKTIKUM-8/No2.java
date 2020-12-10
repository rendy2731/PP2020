import java.util.Scanner;
import java.io.*;

public class No2{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner (System.in);
      FileWriter fileWrite = null;
      PrintWriter printWrite = null;
      FileReader fileRead = null;
      BufferedReader buffRead = null;

      try {
         String fileSatu = scan.next();                                            
         String fileDua = scan.next();                                           
         scan.close();
         fileRead = new FileReader(String.format("%s.txt",fileSatu));
         buffRead = new BufferedReader(fileRead);
         fileWrite = new FileWriter(String.format("%s.txt", fileDua));
         printWrite = new PrintWriter(fileWrite);

         String test;

         int a = 0;
         while ((test = buffRead.readLine()) != null){
             if (test.length() > a){
                a=test.length();
             }else{
                a=a;
             }
          
         }
         fileRead = new FileReader(String.format("%s.txt",fileSatu));
         buffRead = new BufferedReader(fileRead);


         String test1;

         while ((test1 = buffRead.readLine()) != null) {
            printWrite.write(String.format("%"+ a +"s\n", test1));
         }

      } catch (IOException ioe){
         System.out.println("Gagal");
      } finally {
         try {
            if (fileWrite != null){
               System.out.println("Berhasil");
               fileWrite.close();
            } 
            if (fileRead != null){
               fileRead.close();
            }
         } catch (IOException ioe){
            System.out.println(ioe.getMessage());
         }
      }
   }
} 