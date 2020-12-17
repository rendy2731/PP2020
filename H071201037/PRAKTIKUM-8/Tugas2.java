import java.io.*;
import java.util.Scanner;

public class Tugas2{

	/* Emha "Fudhol" Ismaulidin */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	FileWriter write = null;
	PrintWriter print = null;
	FileReader read = null;
    BufferedReader buffer = null;

	System.out.print("Input nama file yang ingin disalin : ");
	String namaFile1 = input.next();
	System.out.print("Input nama file hasil salinan : ");
	String namaFile2 = input.next();
	input.close();

	try {
    read = new FileReader(String.format("%s.txt", namaFile1));
	buffer = new BufferedReader(read);
	write = new FileWriter(String.format("%s.txt", namaFile2));
	print = new PrintWriter(write);

	String test;

    int max = 0;
    while ((test = buffer.readLine()) != null){
       max = test.length() > max ? test.length() : max;
    }
    read = new FileReader(String.format("%s.txt",namaFile1));
    buffer = new BufferedReader(read);

    String test1;

    while ((test1 = buffer.readLine()) != null) {
       print.write(String.format("%"+max+"s\n", test1));
    }
	} catch (IOException e) {
		System.out.println("Gagal.");
		e.printStackTrace();
	} finally{
		try {
            if (write != null){
               System.out.println("Berhasil.");
               write.close();
            } 
            if (read != null){
               read.close();
            }
         } catch (IOException ioe){
            System.out.println(ioe.getMessage());
         }
	}
}
}