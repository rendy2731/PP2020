import java.io.*;
import java.util.Scanner;
class Soalpraktikum81 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        String input = A.next();
        String output = A.next();
    try {
        in = new FileInputStream("C:\\TP8\\"+input+".txt");
        out = new FileOutputStream("C:\\TP8\\"+output+".txt");
        int data;
            
        while ((data = in.read()) != -1) {
            out.write(data);
        }
                System.out.print("(BERHASIL)");
    } 
            catch (IOException ioe) {
                System.out.print("(GAGAL)");
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
                    System.out.print("(GAGAL)");
            }
        }
    }
}