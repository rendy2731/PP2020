import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
class Praktikum8no3 {
   public static void main( String[] args ){ 
        Scanner user = new Scanner (System.in);
        try{
            File myFile =new File("d:/PP2020B/Praktikum8no3.txt");
            if(!myFile.exists()){
            myFile.createNewFile();
            }
        PrintWriter printWriter = new PrintWriter(myFile);
        System.out.println("Praktikum8no3");
        int pilih = user.nextInt();
        if (pilih == 1){
            printWriter.println(user.next());
            printWriter.println(user.next());
            printWriter.println(user.next());
        } else if (pilih == 2){
            printWriter.println(user.next());
            printWriter.println(user.next());
            printWriter.println(user.next());
            printWriter.println("");
            printWriter.println(user.next());
            printWriter.println(user.next());
            printWriter.println(user.next());
       } else if (pilih == 3){
            printWriter.println(user.next());
            printWriter.println(user.next());
            printWriter.println(user.next());
            printWriter.println("");
            printWriter.println(user.next());
            printWriter.println(user.next());
            printWriter.println(user.next());
            printWriter.println("");
            printWriter.println(user.next());
            printWriter.println(user.next());
            printWriter.println(user.next());
       }
        printWriter.close();
        System.out.println("Berhasil");
 
        }catch(IOException e){
            System.out.println("Gagal");
            e.printStackTrace();
        }
    }
}