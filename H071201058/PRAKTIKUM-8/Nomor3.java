// Ichsan Takwa
// H071201058

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nomor3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        String namaFile = input.next()+".txt";
        int jumlahInput = input.nextInt();
        String[] jenisData = {"Nama","NIM","Angkatan"};
        String[][] inputData = new String[jumlahInput][3];
        boolean kondisi = true;

        File fileData = new File(namaFile);
        try (BufferedWriter tulisFile = new BufferedWriter(new FileWriter(fileData))) {
            // membuat jenis data pada kolom pertama
            tulisFile.write(batasKolom());
            tulisFile.write(isiKolom(jenisData));
            tulisFile.write(batasKolom());
            //mengisi file dari scanner
            String masukkanData = input.nextLine();
            for (int i = 0; i < jumlahInput; i++) {
                for (int j = 0; j < 3; j++) {
                    masukkanData = input.nextLine();
                    inputData[i][j] = masukkanData;
                    inputData[i][j].replace(' ', '_');
                    if (inputData[i][j].length()>20) {
                        kondisi = false;
                    }
                }
                tulisFile.write(isiKolom(inputData[i]));
            }
            tulisFile.write(batasKolom());
            input.close();
        } catch (IOException ioErr) {
            System.out.println(ioErr.getMessage());
        }
        // Membatasi inputan <= 20 dan memastikan file ada
        if (!kondisi) {
            fileData.delete();
            System.out.println("Gagal");
        } else if (fileData.exists() && fileData.isFile()) {
            System.out.println("Berhasil");
        }
    }

    // Membuat garis batas kolom
    public static String batasKolom() {
        String garis = new String();
        for (int i = 0; i < 76; i++) {
            if (i%25 == 0) {
                garis += "+";
            } else {
                garis += "-";
            }
        } 
        return garis+="\n";
    }

    // Mengisi data pada setiap kolom dalam file 
    public static String isiKolom(String[] data) {
        String isiData = new String();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < (data[i].length()); j++) {
                if (j%25 == 0) {
                    isiData += "|";
                    isiData += " "+data[i];
                    for (int k = 0; k < (23 - data[i].length()); k++) {
                        isiData += " ";
                    }
                }
            } 
        }
        return isiData += "|\n";
    }

}
