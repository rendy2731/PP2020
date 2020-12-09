import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nomor1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        String namaFile = input.next()+".txt";
        String namaFileCopyan = input.next()+".txt";

        String content = "Nama\t: Ichsan Takwa\nNIM \t: H071201058\nProdi\t: Ilmu Komputer\nAlamat\t: jl.bulupattirong, Kec.Mare, Kab.Bone (92773)";
        
        // Membuat dan mengisi file awal
        try (BufferedWriter tulisText = new BufferedWriter(new FileWriter(namaFile) )) {
            tulisText.write(content);

        } catch (IOException ioerr) {
            System.out.println(ioerr.getMessage());
        } 
        input.close();

        // Membaca dan menyalin isi file
        File fileCopyan = new File(namaFileCopyan);
        try (BufferedReader bacaText = new BufferedReader(new FileReader(namaFile))) {
            try (BufferedWriter tulisText = new BufferedWriter(new FileWriter(fileCopyan) )) {
                String isiFile = new String();
                while ((isiFile = bacaText.readLine()) != null) {
                    tulisText.write(isiFile);
                    tulisText.newLine();
                }
            } catch (IOException ioerr) {
                System.out.println(ioerr.getMessage());
            } 
        } catch (IOException ioerr) {
            System.out.println(ioerr.getMessage());
        } 

        // Mengecek file hasil salinan
        if (fileCopyan.isFile() && fileCopyan.exists()) {
            System.out.println("Berhasil");
        } else {
            System.out.println("Gagal");
        }

    }
}
