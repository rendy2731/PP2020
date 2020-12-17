import java.util.ArrayList;
import java.util.Scanner;

public class No1 {
  Scanner scan = new Scanner(System.in);
  ArrayList<String> namaFilm = new ArrayList<String>();
  ArrayList<String> rilisArray = new ArrayList<String>();
  ArrayList<String> durasiArray = new ArrayList<String>();
  ArrayList<String> genreArray = new ArrayList<String>();
  ArrayList<String> sinopsisArray = new ArrayList<String>();
  ArrayList<String> castArray = new ArrayList<String>();

  public void deleteFilm(int i) {
    System.out.println();
    namaFilm.remove(i);
    sinopsisArray.remove(i);
    castArray.remove(i);
    genreArray.remove(i);
    durasiArray.remove(i);
    rilisArray.remove(i);
  }

  public void addFilm() {
    String newString;

    System.out.println();

    System.out.print("Judul: ");
    String nama = new String(scan.nextLine());
    namaFilm.add(nama);

    System.out.print("Rilis: ");
    newString = scan.nextLine();
    rilisArray.add(newString);

    System.out.print("Durasi: ");
    newString = scan.nextLine();
    durasiArray.add(newString);

    System.out.print("Genre: ");
    newString = scan.nextLine();
    genreArray.add(newString);

    System.out.print("Sinopsis: ");
    newString = scan.nextLine();
    sinopsisArray.add(newString);

    System.out.print("Cast: ");
    newString = scan.nextLine();
    castArray.add(newString);

    

    System.out.println("\nFilm baru berhasil ditambahkan!");
  }

  public void searchFilm(String s) {
    boolean dapat = false;
    System.out.println();
    for (int i = 0; i < rilisArray.size(); i++) {
      if (namaFilm.get(i).indexOf(s) >= 0) {
        System.out.println("----Film ditemukan----\n film yang anda cari adalah:" + namaFilm.get(i));
        dapat = true;
        break;
      }
    }
    if (dapat == false)
      System.out.println("Tidak ada film dengan nama " + s + " ditemukan!\nPeriksa ejaan dan besar kecil huruf lagi!");
  }

  public void showFilmDetail(int i) {

    System.out.println();
    System.out.println("berikut adalah detail film yang anda inginkan");
    System.out.println("Judul    :" + namaFilm.get(i));
    System.out.println("Rilis    :" + rilisArray.get(i));
    System.out.println("Durasi   :" + durasiArray.get(i));
    System.out.println("Genre    :" + genreArray.get(i));
    System.out.println("Sinopsis :" + sinopsisArray.get(i));
    System.out.println("Cast     :" + castArray.get(i));
  }

  public void startProg() {

    while (true) {
      String command = "";
      System.out.println();
      System.out.println("------------------------");
      System.out.println("    Favourite Movie     ");
      System.out.println("------------------------");
      if (namaFilm.isEmpty()) {
        System.out.println("Daftar Kosong\n\n");
      }
      for (int i = 0; i < namaFilm.size(); i++) {
        System.out.println(i + 1 + ". " + namaFilm.get(i));

      }

      System.out.println("\nMENU PILIHAN :");
      System.out.println("1. d(Detail) <spasi> nomor film");
      System.out.println("2. s(Search) <spasi> nama film");
      System.out.println("3. a(Add)");
      System.out.println("4. r(Remove) <spasi> nomor film");
      System.out.println("5. e(Exit)");

      System.out.print("MASUKKAN PILIHAN ANDA: ");
      command = scan.nextLine();

      
      if (command.length() > 2 && command.substring(0, 2).equalsIgnoreCase("s ")) {
        searchFilm(command.substring(2));
      } else if (command.length() > 2 && command.substring(0, 2).equalsIgnoreCase("d ") && Character.isDigit(command.charAt(2))) {
        showFilmDetail(Character.getNumericValue(command.charAt(2) - 1));
      } else if (command.length() > 2 && command.substring(0, 2).equalsIgnoreCase("r ") && Character.isDigit(command.charAt(2))) {
        deleteFilm(Character.getNumericValue(command.charAt(2) - 1));
      } else if (command.length() == 1 && command.charAt(0) == 'a') {
        addFilm();
      }else if (command.equalsIgnoreCase("e")){
        return;
      }
      
    }
  }
    
  

  public static void main(String[] args) {
    No1 test = new No1();
    test.startProg();
  }
}
