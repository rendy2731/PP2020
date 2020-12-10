import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class No3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileWriter fileWrite = null;
        PrintWriter printWrite = null;

        try{
            System.out.print("Nama file = ");
            String file = scan.nextLine() + ".txt";
            ArrayList<String> nama = new ArrayList<>();
            ArrayList<String> nim = new ArrayList<>();
            ArrayList<String> angkatan = new ArrayList<>();

            System.out.print("input jumlah asistensi  =");
            int numberAssistance = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < numberAssistance; i++) {
                System.out.print("Nama = ");
                nama.add(scan.nextLine());

                System.out.print("Nim = ");
                nim.add(scan.nextLine());

                System.out.print("Angkatan = ");
                angkatan.add(scan.nextLine());
            }

            fileWrite = new FileWriter (file);
            printWrite = new PrintWriter(fileWrite);

            printWrite.printf("+--------------------------------+--------------------+-----------+\n");
            printWrite.printf("|NAMA                            |NIM                 |ANGKATAN   |\n");
            printWrite.printf("+--------------------------------+--------------------+-----------+\n");
            
            for (int j = 0; j < numberAssistance; j++) {    
                printWrite.printf("| %-30s | %-18s | %-8s  |\n", nama.get(j), nim.get(j), angkatan.get(j));
            }
            printWrite.printf("+--------------------------------+--------------------+-----------+\n");

        } catch (IOException ioe){
            System.out.println("Gagal");
        } finally {
            try {
                if (printWrite != null) {
                    System.out.println("Berhasil");
                    printWrite.close();
                } 
                if (fileWrite != null) {
                    fileWrite.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
} 
    

