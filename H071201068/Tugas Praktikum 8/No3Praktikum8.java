import java.io.*;
import java.util.*;

public class No3Praktikum8 {

    private static HashMap<String, ArrayList<String>> inputData(
        Scanner scan, HashMap<String, ArrayList<String>> data, int banyakAsisten) 
    {
        scan.nextLine();
        for (int i = 0; i < banyakAsisten; i++) {
            System.out.print("Masukkan Nama = ");
            data.get("Nama").add(scan.nextLine());
            if (data.get("Nama").get(i).length() > 20) {
                System.out.println("Jumlah Karakter Nama Lebih.");
                return data;
            }
            System.out.print("Masukkan NIM = ");
            data.get("NIM").add(scan.nextLine());
            System.out.print("Masukkan Angkatan = ");
            data.get("Angkatan").add(scan.nextLine());
        }
        return data;
    }

    private static void makeFile(String fileName, HashMap<String, ArrayList<String>> data) {
        try (BufferedWriter writeFile = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
            writeFile.write("+----------------------+------------+-----------+\n");
            writeFile.write("|NAMA                  |NIM         |ANGKATAN   |\n");
            writeFile.write("+----------------------+------------+-----------+\n");
            for (int i = 0; i < data.get("Nama").size(); i++) {
                String nama = data.get("Nama").get(i);
                String nim = data.get("NIM").get(i);
                String angkatan = data.get("Angkatan").get(i);
                writeFile.write(String.format("| %-20s | %-10s | %-8s  |", nama, nim, angkatan));
                writeFile.newLine();
            }
            writeFile.write("+----------------------+------------+-----------+\n");
            System.out.println("Berhasil");
        } catch (Exception e) {
            System.out.println("Gagal");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama File = ");
        String fileName = scan.nextLine();
        System.out.print("Jumlah Asistensi yang ingin diinput = ");
        int banyakAsisten = scan.nextInt();
        HashMap<String, ArrayList<String>> data = new HashMap<>();
        data.put("Nama", new ArrayList<>());
        data.put("NIM", new ArrayList<>());
        data.put("Angkatan", new ArrayList<>());

        inputData(scan, data, banyakAsisten);
        makeFile(fileName, data);
    }
}
