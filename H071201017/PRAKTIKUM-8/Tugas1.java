/*
 * @author Ummul Qura
 */
import java.io.*;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        File isChecked = null;
        
        try {
            String inputan1 = input.nextLine();
            String inputan2 = input.nextLine();
            input.close();
            in = new FileInputStream(String.format("%s.txt", inputan1));
            out = new FileOutputStream(String.format("%s.txt", inputan2));
            isChecked = new File(String.format("%s.txt", inputan1));
            int read;
            while ((read = in.read()) != -1) {
                out.write(read);
            }
            if (isChecked.exists()) {
                System.out.println("Berhasil");
            } 
        } 
        catch (IOException ioe) {
            System.out.println("Gagal");
        } 
        finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } 
            catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
