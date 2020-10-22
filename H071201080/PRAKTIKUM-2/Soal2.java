import java.util.Scanner;

public class Soal2{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println(" ");
        System.out.println("Input Angka Sesuai Menu Yang Diinginkan : "); 
        
        int angka = read.nextInt();
        int bangunDatar;

        if(angka == 1){
                System.out.println(" ");
                System.out.println("** Pilih Bangun Datar **");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang ");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-Layang");
                System.out.println(" ");
                System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan : ");
                
                bangunDatar = read.nextInt();

                     switch(bangunDatar){

                            //PERSEGI
                            case 1:
                            System.out.println("Input sisi persegi: ");
                            int sisi = read.nextInt();
                            double sisi2 = sisi * sisi;
                            System.out.println("Luas Persegi adalah: " + sisi2);

                            break;

                            //PERSEGIPANJANG
                            case 2:
                            System.out.println("Input Panjang Persegi Panjang: ");
                            int panjang = read.nextInt();
                            System.out.println("Input Lebar Persegi Panjang: ");
                            int lebar = read.nextInt();
                            double luas = panjang * lebar;
                            System.out.println("Luas Persegi Panjang: " + luas); 

                            break;

                            //SEGITIGA
                            case 3:
                            System.out.println("Input Alas: ");
                            int alas = read.nextInt();
                            System.out.println("Input Tinggi: ");
                            int tinggi = read.nextInt();
                            double luasSegitiga = (alas * tinggi)/2;
                            System.out.println("Luas Segitiga adalah: " + luasSegitiga);

                            break;

                            //LINGKARAN
                            case 4:
                            System.out.println("Input Phi: ");
                            double phi = Math.PI;
                            System.out.println("Input Jari-jari:  ");
                            int jari2 = read.nextInt();
                            double luasLingkaran = phi * Math.pow(jari2,2);
                            System.out.printf("Luas Lingkaran adalah: " + "%.2f \n",luasLingkaran);

                            break;

                            //JAJAR GENJANG
                            case 5:
                            System.out.println("Input Alas: ");
                            int alas2 = read.nextInt();
                            System.out.println("Input Tinggi: ");
                            int tinggi2 = read.nextInt();
                            double luasGenjang = alas2 * tinggi2;
                            System.out.println("Luas Jajar Genjang adalah: " + luasGenjang);

                            break;

                            //TRAPESIUM
                            case 6:
                            System.out.println("Input Panjang Sisi Sejajar: ");
                            int panjangSisi = read.nextInt();
                            System.out.println("Input Tinggi: ");
                            int tinggi3 = read.nextInt();
                            double luasTrapesium = (panjangSisi * tinggi3) / 2;
                            System.out.println("Luas Trapesium adalah: " + luasTrapesium);

                            break;

                            //BELAHKETUPAT
                            case 7:
                            System.out.println("Input Alas: ");
                            int alas4 = read.nextInt();
                            System.out.println("Input Tinggi: ");
                            int tinggi4 = read.nextInt();
                            double luasBelah = alas4 * tinggi4;
                            System.out.println("Luas Belah Ketupat adalah: " + luasBelah);

                            break;

                            //LAYANG-LAYANG
                            case 8:
                            System.out.println("Input Diagonal1: ");
                            int diagonal1 = read.nextInt();
                            System.out.println("Input Diagonal2: ");
                            int diagonal2 = read.nextInt();
                            double luasLayang = (diagonal1 * diagonal2) / 2;
                            System.out.println("Luas Layang-layang adalah: " + luasLayang);

                            break;

                            default:
                            System.out.println("Input Tidak Valid");

                        }
            }
        else if(angka == 2){
                System.out.println(" ");
                System.out.println("** Pilih Bangun Ruang **");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Limas SegiEmpat");
                System.out.println("4. Prisma Segitiga");
                System.out.println("5. Limas Segitiga ");
                System.out.println("6. Silinder");
                System.out.println("7. Kerucut");
                System.out.println("8. Bola");
                System.out.println(" ");
                System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan : ");
          
                bangunDatar = read.nextInt();

                    switch(bangunDatar){

                            //KUBUS
                            case 1:
                            System.out.println("Input Rusuk: ");
                            int rusuk = read.nextInt();
                            double volume = Math.pow(rusuk,3);
                            System.out.println("Volume Bangun Datar Kubus adalah: " + volume);

                            break;

                            //BALOK
                            case 2:
                            System.out.println("Input Panjang: ");
                            int panjangBalok = read.nextInt();
                            System.out.println("Input Lebar: ");
                            int lebarBalok = read.nextInt();
                            System.out.println("Input tinggi: ");
                            int tinggiBalok = read.nextInt();
                            double volumeBalok = panjangBalok * lebarBalok * tinggiBalok;
                            System.out.println("Volume Bangun Datar Balok adalah: " + volumeBalok);

                            break;

                            //LIMAS SEGIEMPAT
                            case 3:
                            System.out.println("Input Luas Alas: ");
                            int luasAlas = read.nextInt();
                            System.out.println("Input Lebar: ");
                            int tinggiLimas4 = read.nextInt();
                            double volumeLimas4 = (luasAlas * tinggiLimas4) / 3;
                            System.out.println("Volume Bangun Datar Segi Empat adalah: " + volumeLimas4);

                            break;

                            //PRISMA SEGITIGA
                            case 4:
                            System.out.println("Input alas: ");
                            int alasPrisma3 = read.nextInt();
                            System.out.println("Input t: ");
                            int t = read.nextInt();
                            System.out.println("Input Tinggi: ");
                            int tinggiPrisma3 = read.nextInt();
                            double volumePrisma3 = (alasPrisma3 * t * tinggiPrisma3) / 2;
                            System.out.println("Volume Prisma Segitiga adalah: " + volumePrisma3);

                            break;

                            //LIMAS SEGITIGA
                            case 5:
                            System.out.println("Input alas: ");
                            int alasLimas3 = read.nextInt();
                            System.out.println("Input t: ");
                            int t3 = read.nextInt();
                            System.out.println("Input Tinggi: ");
                            int tinggiLimas3 = read.nextInt();
                            double volumeLimas3 = (alasLimas3 * t3 * tinggiLimas3) / 6;
                            System.out.println("Volume Limas Segitiga adalah: " + volumeLimas3);

                            break;

                            //SILINDER
                            case 6:
                            System.out.println("Input phi: ");
                            double phiSilinder = Math.PI;
                            System.out.println("Input jari-jari: ");
                            int jariSilinder = read.nextInt();
                            System.out.println("Input Tinggi: ");
                            int tinggiSilinder = read.nextInt();
                            double volumeSilinder = phiSilinder * Math.pow(jariSilinder,2) * tinggiSilinder;
                            System.out.printf("Volume Silinder adalah: " + "%.2f",volumeSilinder);

                            break;

                            //KERUCUT
                            case 7:
                            System.out.println("Input phi: ");
                            double phiKerucut = Math.PI;
                            System.out.println("Input jari-jari: ");
                            int jariKerucut = read.nextInt();
                            System.out.println("Input Tinggi: ");
                            int tinggiKerucut = read.nextInt();
                            double volumeKerucut = (phiKerucut * Math.pow(jariKerucut,2) * tinggiKerucut) / 3;
                            System.out.printf("Volume Kerucut adalah: " + "%.2f",volumeKerucut);

                            break;

                            //BOLA
                            case 8:
                            System.out.println("Input phi: ");
                            double phiBola = Math.PI;
                            System.out.println("Input jari-jari: ");
                            int jariBola = read.nextInt();
                            double volumeBola = (4 * phiBola * Math.pow(jariBola,3)) / 3;
                            System.out.printf("Volume Bola adalah: " + "%.2f",volumeBola);

                            break;

                            default:
                            System.out.println("Input Tidak Valid");

                    }
            }
        else{
            System.out.println("Input Tidak Valid");
        }
        read.close();
    }
}