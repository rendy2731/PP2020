import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nomor2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        String namaFile = input.next()+".txt";
        String namaFileCopyan = input.next()+".txt";
        
        String content = "Nama   : Ichsan Takwa\nNIM    : H071201058\nProdi  : Ilmu Komputer\nAlamat : Jl.Bulupattirong, Desa Mario, Kec.Mare, Kab.Bone";

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
                String rataKanan = new String();
                while ((isiFile = bacaText.readLine()) != null ) {
                    for (int i = 0; i < 100 - isiFile.length(); i++) {
                        rataKanan += " ";
                    }
                    tulisText.write(rataKanan+""+isiFile);
                    tulisText.newLine();
                    rataKanan = "";
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
