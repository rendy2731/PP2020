import java.io.*;
import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        System.out.print("Masukkan nama file : ");
        String input = input.next();
        System.out.print("Masukkan nama file hasil salinan : ");
        String output = input.next();

        try {
            in = new FileInputStream("C:\\new\\"+input+".txt");
            out = new FileOutputStream("C:\\new\\"+output+".txt");
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
            System.out.println("Berhasil");

        } catch (IOException ioe) {
            System.out.println("Gagal");

        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
                System.out.println("Gagal");
            }
        }
    }
}