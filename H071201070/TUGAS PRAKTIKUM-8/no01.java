import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
class no01{
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream( inputan.next() + ".txt");
            out = new FileOutputStream( inputan.next() + "txt");
            int baca;
            while ((baca = in.read()) != -1) {
                out.write(baca);
            }
        }catch(IOException ioe){
            System.out.println("Gagal");
        }finally{
            try{
                if(in != null){
                    System.out.println("Berhasil");
                    in.close();
                }if(out != null){
                    out.close();
                }
            }catch(IOException ioe){
                System.out.println("Gagal");
            }    
        }    
    
    }
}