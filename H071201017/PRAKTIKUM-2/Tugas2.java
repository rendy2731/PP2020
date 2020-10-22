/*
 * @author Ummul
 * Don't copyright
 */
import java.util.Scanner;
public class Tugas2 {
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
        double s, L, V, r, a, t, p, l, s1, s2, d1, d2, pi=3.14;       
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("");
        System.out.println("Input Angka Sesuai Dengan Menu Yang Diingingkan :");
        int nomor = obj.nextInt();
        
        if ( nomor == 1){
            System.out.println("** Pilih Bangun Datar **");
            System.out.println("1. Persegi");  
            System.out.println("2. Persegi Panjang");  
            System.out.println("3. Segitiga");  
            System.out.println("4. Lingkaran");  
            System.out.println("5. Jajar Genjang");  
            System.out.println("6. Trapesium");  
            System.out.println("7. Belah Ketupat");  
            System.out.println("8. Layang-Layang");  
            System.out.println("");  
            System.out.println("Input Angka Sesuai Dengan Nomor Bangun Datar Yang Diinginkan :"); 
            nomor = obj.nextInt();
            
            switch (nomor){
                case 1:
                    System.out.println("Input sisi :");
                    s = obj.nextDouble();
                    L = s*s;
                    System.out.println("Luas Persegi : " + L);
                    break;
                case 2:
                    System.out.println("Input Panjang :");
                    p = obj.nextDouble();
                    System.out.println("Input Lebar :");
                    l = obj.nextDouble();
                    L = p*l;
                    System.out.println("Luas Persegi Panjang : " + L); 
                    break;
                case 3:
                    System.out.println("Input Alas :");
                    a = obj.nextDouble();
                    System.out.println("Input Tinggi :");
                    t = obj.nextDouble();
                    L = (a*t)/2;
                    System.out.println("Luas Segitiga : " + L); 
                    break;
                case 4:
                    System.out.println("Input Jari-Jari :");
                    r = obj.nextDouble();
                    L = pi*r*r;
                    System.out.println("Luas Lingkaran : " + L);
                    break;
                case 5:
                    System.out.println("Input Alas :");
                    a = obj.nextDouble();
                    System.out.println("Input Tinggi :");
                    t = obj.nextDouble();
                    L = a*t;
                    System.out.println("Luas Jajar Genjang : " + L);
                    break;
                case 6:
                    System.out.println("Input Sisi Sejajar 1 :");
                    s1 = obj.nextDouble();
                    System.out.println("Input Sisi Sejajar 2 :");
                    s2 = obj.nextDouble();
                    System.out.println("Input Tinggi :");
                    t = obj.nextDouble();
                    L = (s1+s2)*t/2;
                    System.out.println("Luas Segitiga : " + L);
                    break;
                case 7:
                    System.out.println("Input Diagonal 1 :");
                    d1 = obj.nextDouble();
                    System.out.println("Input Diagonal 2 :");
                    d2 = obj.nextDouble();
                    L = (d1*d2)/2;
                    System.out.println("Luas Belah Ketupat : " + L);
                    break;
                case 8:
                    System.out.println("Input Diagonal 1 :");
                    d1 = obj.nextDouble();
                    System.out.println("Input Diagonal 2 :");
                    d2 = obj.nextDouble();
                    L = (d1*d2)/2;
                    System.out.println("Layang-Layang : " + L);
                    break;
                default :
                    System.out.println("Mohon Maaf, Pilihan Yang Tersedia hanya 1-8");
                    System.out.println("Silahkan Input Ulang Pilihan Anda");
            }
             
        } 
        else if (nomor == 2){
            System.out.println("** Pilih Bangun Ruang **");
            System.out.println("1. Kubus");  
            System.out.println("2. Balok");  
            System.out.println("3. Prisma Segitiga");  
            System.out.println("4. Limas Segiempat");  
            System.out.println("5. Limas Segitiga");  
            System.out.println("6. Tabung");  
            System.out.println("7. Kerucut");  
            System.out.println("8. Bola");  
            System.out.println("");  
            System.out.println("Input Angka Sesuai Dengan Nomor Bangun Ruang Yang Diinginkan :"); 
            nomor = obj.nextInt();
            switch (nomor){
                case 1:
                    System.out.println("Input sisi :");
                    s = obj.nextDouble();
                    V = s*s*s;
                    System.out.println("Volume Kubus : " + V);
                    break;
                case 2:
                    System.out.println("Input Panjang :");
                    p = obj.nextDouble();
                    System.out.println("Input Lebar :");
                    l = obj.nextDouble();
                    System.out.println("Input Tinggi :");
                    t = obj.nextDouble();
                    V = p*l*t;
                    System.out.println("Luas Balok : " + V);
                    break;
                case 3:
                    System.out.println("Input alas :");
                    a = obj.nextDouble();
                    System.out.println("Input Tinggi :");
                    t = obj.nextDouble();
                    V = ((a*t)/2)*t;
                    System.out.println("Luas Prisma Segitiga : " + V);
                    break;
                case 4:
                    System.out.println("Input Panjang :");
                    p = obj.nextDouble();
                    System.out.println("Input Lebar :");
                    l = obj.nextDouble();
                    System.out.println("Input Tinggi :");
                    t = obj.nextDouble();
                    V = (p*l*t)/3;
                    System.out.println("Luas Limas Segi Empat : " + V);
                    break;
                case 5:
                    System.out.println("Input Alas :");
                    a = obj.nextDouble();
                    System.out.println("Input Tinggi :");
                    t = obj.nextDouble();
                    V = ((a*t)/3)*t;
                    System.out.println("Luas Limas Segitiga : " + V);
                    break;
                case 6:
                    System.out.println("Input Jari-Jari :");
                    r = obj.nextDouble();
                    System.out.println("Input Tinggi :");
                    t = obj.nextDouble();
                    V = pi*r*r*t;
                    System.out.println("Luas Tabung : " + V);
                    break;
                case 7:
                    System.out.println("Input Jari-Jari :");
                    r = obj.nextDouble();
                    System.out.println("Input Tinggi :");
                    t = obj.nextDouble();
                    V = (pi*r*r*t)/3;
                    System.out.println("Luas Kerucut : " + V);
                    break;
                case 8:
                    System.out.println("Input Jari-Jari :");
                    r = obj.nextDouble();
                    V = (4*pi*r*r*r)/3;
                    System.out.println("Luas Bola : " + V);
                    break;
                default :
                    System.out.println("Mohon Maaf, Pilihan Yang Tersedia hanya 1-8");
                    System.out.println("Silahkan Input Ulang Pilihan Anda");
            }
            
        } 
        else {
            System.out.println("Mohon Maaf, Pilihan Yang Tersedia hanya 1 Dan 2 ");
            System.out.println("Silahkan Input Ulang Pilihan Anda");
        }
    }
}