/*
 * @author Ummul Qura
 */
import java.io.*;
import java.util. Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        FileReader fReader = null;
        BufferedReader bReader = null;
        FileWriter fWriter = null;
        PrintWriter pWriter = null; 
        
        try {
            String source = input.next();
            String destination = input.next();
            input.close();
            fReader = new FileReader(source + ".txt");
            bReader = new BufferedReader(fReader);
            fWriter = new FileWriter(destination + ".txt");
            pWriter = new PrintWriter(fWriter);
            String read;
            int max = 0;

            while ((read = bReader.readLine()) != null) {
                max = read.length() > max ? read.length() : max ;
            }
            fReader = new FileReader(source + ".txt");
            bReader = new BufferedReader(fReader);

            String check;
            while ((check = bReader.readLine()) != null) {
                pWriter.write(String.format("%" + "max" + "s\n", check));
            }
        } 
        catch (IOException ioe) {
            System.out.println("Gagal");
        } 
        finally {
            try {
                if (fWriter != null) {
                    fWriter.close();
                }
                if (pWriter != null) {
                    pWriter.close();
                }
                if (bReader != null) {
                    System.out.println("Berhasil");
                    bReader.close();
                }
                if (fReader != null) {
                    fReader.close();
                }    
            } 
            catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
