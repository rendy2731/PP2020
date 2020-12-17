import java.io.*;
import java.util.Scanner;

public class Tugas1{

	/* Emha "Fudhol" Ismaulidin */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	FileInputStream in = null;
	FileOutputStream out = null;

	System.out.print("Input nama file yang ingin disalin : ");
	String namaFile1 = input.next();
	System.out.print("Input nama file hasil salinan : ");
	String namaFile2 = input.next();

	try {
	in = new FileInputStream(namaFile1+".txt");
    out = new FileOutputStream(namaFile2+".txt");
    int data;
    while ((data = in.read()) != -1) {
        out.write(data);
    }
    System.out.println("Berhasil.");
	} catch (IOException e) {
		System.out.println("Gagal.");
		e.printStackTrace();
	} finally{
		try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
                System.out.println("Gagal.");
            }
        }
	}
}