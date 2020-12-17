import java.io.*;
import java.util.Scanner;

public class Tugas3 {

    /* Emha "Fudhol" Ismaulidin */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    FileWriter write = null;
    PrintWriter print = null;

    try {
    System.out.print("Input nama file : ");
    String namaFile1 = input.nextLine() + ".txt";
    System.out.print("Jumlah asisten yang ingin diinput : ");
    int jumlahAsisten = input.nextInt();

    String[] nama = new String[jumlahAsisten];
    String[] nim = new String[jumlahAsisten];
    int[] angkatan = new int[jumlahAsisten];

    for (int i = 0; i < jumlahAsisten; i++) {
        input.nextLine();
        System.out.print("Nama = ");
        nama[i] = input.nextLine();
        System.out.print("NIM = ");
        nim[i] = input.next();
        System.out.print("Angkatan = ");
        angkatan[i] = input.nextInt();
    }

    write = new FileWriter(namaFile1);
    print = new PrintWriter(write);
    int panjang = 0;

    for (int i = 0; i < nama.length;i++){
    if(nama[i].length() > panjang)
        panjang = nama[i].length();
    }

    print.printf("+%s+===========+===========+\n", outputter(panjang));
    panjang -= 4;
    print.printf("|NAMA%" + panjang + "s|NIM         |ANGKATAN  |\n"," ");
    panjang += 4;
    print.printf("+%s+===========+===========+\n", outputter(panjang));

    for (int j = 0; j < jumlahAsisten; j++) {
        panjang -= nama[j].length();
        print.printf("|%s", nama[j]);
        for(int x = 0; x < panjang; x++){
            print.print(" ");
        }
        print.printf("| %-10s | %-8s |\n", nim[j], angkatan[j]);
        panjang += nama[j].length();
    }
    print.printf("+%s+===========+===========+\n", outputter(panjang));

    } catch (IOException ioe){
        System.out.println("Gagal.");
        input.nextLine();
    } finally {
        try {
            if (print != null) {
                System.out.println("Berhasil.");
                print.close();
            } 
            if (write != null) {
                write.close();
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}

    public static String outputter(int a){
        String str = "";
        for (int i = 0; i < a; i++){
            str += "=";
        } 
        return str;
    }
}  