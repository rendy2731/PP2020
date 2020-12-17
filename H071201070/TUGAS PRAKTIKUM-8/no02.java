import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class no02 {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner inputan = new Scanner (System.in);
      FileReader fr = null;  BufferedReader br = null;
      FileWriter fw = null;  PrintWriter pw = null;

      try {
        String input1 = inputan.next();
        String input2 = inputan.next();
         fr = new FileReader(input1 + ".txt");
         fw = new FileWriter(input2 + ".txt");
         br = new BufferedReader(fr);
         pw = new PrintWriter(fw);

        String var1;
        int count = 0;
        while ((var1 = br.readLine()) != null){
            if(var1.length() < count){
                count = 0;
            }else{
                count = var1.length();
            }                      
        }
        
        fr = new FileReader(input1 + ".txt");
        br = new BufferedReader(fr);
        String var2;
        while ((var2 = br.readLine()) != null) {
           pw.write(String.format("%"+ count +"s\n", var2));
        }
     } catch (IOException ioe){
        System.out.println("Gagal");
     } finally {
        try {
           if (fw != null){
              System.out.println("Berhasil");
              fw.close();
           } 
           if (fr != null){
              fr.close();
           }
        } catch (IOException ioe){
           System.out.println(ioe.getMessage());
        }
     }
  }
} 