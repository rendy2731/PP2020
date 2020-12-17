import java.io.*;
import java.util.*;

public class Praktikum8no2 {
   public static void main(String[] args) throws FileNotFoundException {
    Scanner user = new Scanner (System.in);
    FileWriter fileWriter = null;
    PrintWriter printWriter = null;
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    try {
        String file = user.next();                                            
        String filebaru = user.next();                                           
        user.close();
        
        fileReader = new FileReader(String.format("%s.txt",file));
        bufferedReader = new BufferedReader(fileReader);
        fileWriter = new FileWriter(String.format("%s.txt", filebaru));
        printWriter = new PrintWriter(fileWriter);

        String x;
        int y = 0;
        while ((x = bufferedReader.readLine()) != null){
            if (x.length() > y){
                y=x.length();
            }else{
                y=y;
            }
        }
        fileReader = new FileReader(String.format("%s.txt",file));
        bufferedReader = new BufferedReader(fileReader);

        String xx;
        while ((xx = bufferedReader.readLine()) != null) {
            printWriter.write(String.format("%"+ y +"s\n", xx));
        }

    }catch (IOException e){
         System.out.println("Gagal");
    } finally {
        try {
            if (fileWriter != null){
               System.out.println("Berhasil");
               fileWriter.close();
            } 
            if (fileReader != null){
               fileReader.close();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
      }
   }
} 