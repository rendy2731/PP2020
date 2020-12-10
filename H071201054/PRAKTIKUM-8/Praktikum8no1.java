import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
class Praktikum8no1 {
   public static void main( String[] args ){ 
        Scanner user = new Scanner (System.in);
        try{
            File myFile =new File(user.next());
            if(!myFile.exists()){
            myFile.createNewFile();
            } 
            File filebaru = new File (user.next());
            if(!filebaru.exists()){
            filebaru.createNewFile();
            }    
        PrintWriter printWriter = new PrintWriter(myFile);
        PrintWriter print = new PrintWriter(filebaru);
        String a = "Baris Pertama";
        String b = "Baris kedua";
        printWriter.println(a);
        printWriter.println(b);
        print.println(a);
        print.println(b);
       
        printWriter.close();
        print.close();
        System.out.println("Berhasil");
 
        }catch(IOException e){
            System.out.println("Gagal");
            e.printStackTrace();
        }
    }
}
