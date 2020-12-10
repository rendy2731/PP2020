import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class no03 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        FileWriter fw = null;
        PrintWriter pw = null;

        try{
            String myFile = inputan.nextLine() + ".txt";
            int n = inputan.nextInt();
            inputan.nextLine();
            String nama[] = new String[n];
            String nim[] = new String[n];
            String angkatan[] = new String[n];
            
            for (int i = 0; i < n; i++) {
                nama[i] = inputan.nextLine();
                nim[i] = inputan.nextLine();
                angkatan[i] = inputan.nextLine();
            }inputan.close();
            
            fw = new FileWriter(myFile);
            pw = new PrintWriter(fw);
            pw.write("+----------------------------------+-----------------+--------------+\n");
            pw.write("|               Nama               |       NIM       |   ANGKATAN   |\n");
            pw.write("+----------------------------------+-----------------+--------------+\n");
            for (int i = 0; i < n; i++) {    
                pw.printf("| %-32s | %-15s | %-11s  |\n", nama[i], nim[i], angkatan[i]);
            }
            pw.write("+----------------------------------+-----------------+--------------+\n");

        } catch (IOException ioe){
            System.out.println("Gagal");
        } finally {
            try {
                if (pw != null) {
                    System.out.println("Berhasil");
                    pw.close();
                } 
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
} 