import java.util.Scanner;

public class Praktikum5_3 {
public static void main(String[] args) {
    Scanner age = new Scanner (System.in);
    System.out.println("masukkan usia (hari) :");
    int usia = age.nextInt();
    age.close();
    System.out.println(myDay(usia));

}   
public static String myDay(int usia){
    int tahun = usia / 365;
    int usia1 = usia % 365;
    int bulan = usia1 / 30;
    int hari = usia1 % 30;

    return tahun + " Tahun  \n" + bulan + " Bulan \n" + hari + " Hari \n";

}

}