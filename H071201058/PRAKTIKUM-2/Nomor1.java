import java.util.Scanner;
public class Nomor1 {
public static void main(String[] args) {
    
    Scanner inputan = new Scanner(System.in);
    int angka_1 ,angka_2 ,angka_3 ,angka_4, angka_5;
    angka_1 = 0;
    angka_2 = 0;
    angka_3 = 0;
    angka_4 = 0;
    angka_5 = 0;
    String kondisi = "Valid";

    try {
        angka_1 = inputan.nextInt();
        angka_2 = inputan.nextInt();
        angka_3 = inputan.nextInt();
        angka_4 = inputan.nextInt();
        angka_5 = inputan.nextInt();
        inputan.close();
    } catch (java.util.InputMismatchException e) {
        kondisi ="Inputan tidak valid";
    }

    int positif = 0;
    int negatif = 0;
    int ganjil = 0;
    int genap = 0;

    if (angka_1%2 == 0) {  genap +=1; }
    if (angka_2%2 == 0) {  genap +=1; }
    if (angka_3%2 == 0) {  genap +=1; }
    if (angka_4%2 == 0) {  genap +=1; }
    if (angka_5%2 == 0) {  genap +=1; }

    if (angka_1%2 != 0) {  ganjil +=1; }
    if (angka_2%2 != 0) {  ganjil +=1; }
    if (angka_3%2 != 0) {  ganjil +=1; }
    if (angka_4%2 != 0) {  ganjil +=1; }
    if (angka_5%2 != 0) {  ganjil +=1; }

    if (angka_1 > 0) {  positif +=1; }
    if (angka_2 > 0) {  positif +=1; }
    if (angka_3 > 0) {  positif +=1; }
    if (angka_4 > 0) {  positif +=1; }
    if (angka_5 > 0) {  positif +=1; }

    if (angka_1 < 0) {  negatif +=1; }
    if (angka_2 < 0) {  negatif +=1; }
    if (angka_3 < 0) {  negatif +=1; }
    if (angka_4 < 0) {  negatif +=1; }
    if (angka_5 < 0) {  negatif +=1; }

    if (kondisi.equals("Valid")) {
        System.out.println(genap+ " Angka genap");
        System.out.println(ganjil+ " Angka ganjil");
        System.out.println(positif+ " Angka positif");
        System.out.println(negatif+ " Angka negatif");
        } else System.out.println(kondisi);
        
    }
}