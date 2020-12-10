import java.io.*;
import java.util.Scanner;

class No1 {
    public static void main(String[] args) {
        Scanner aku = new Scanner (System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(aku.next()+".txt");
            out = new FileOutputStream(aku.next()+".txt");
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (IOException ioe) {
            System.out.println("gagal");
        }

        finally {
            try {
                if (in != null) {
                    System.out.println("berhasil");
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
                System.out.println("gagal");
            }
        }
    }
}