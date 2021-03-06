import java.io.*;
import java.util.*;

public class No2Praktikum8 {

    private static void copyingFromFile(String fileName, String copyFile) {
        FileReader fileReader = null;
        BufferedReader read = null;
        FileWriter fileWriter = null;
        BufferedWriter writer = null;

        try {
            fileReader = new FileReader(fileName + ".txt");
            read = new BufferedReader(fileReader);
            fileWriter = new FileWriter(copyFile + ".txt");
            writer = new BufferedWriter(fileWriter);

            String s;
            String cekPanjang;
            int ukuran = 0;
            while ((cekPanjang = read.readLine()) != null) {
                if (cekPanjang.length() > ukuran) {
                    ukuran = cekPanjang.length();
                }
            }
            fileReader = new FileReader(fileName + ".txt");
            read = new BufferedReader(fileReader);

            while ((s = read.readLine()) != null) {
                writer.write(String.format("%" + ukuran + "s", s));
                writer.newLine();
            }
        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if (writer != null) {
                    System.out.println("Berhasil");
                    writer.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (read != null) {
                    read.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (Exception e) {
                System.out.println("Gagal");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String file = scan.nextLine();
        String copyFile = scan.nextLine();
        scan.close();
        copyingFromFile(file, copyFile);
    }
}
