import java.util.Scanner;

class T002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PILIH MENU\n1. Mencari Luas Bangun Datar:\n2. Mencari Volume Bangun Ruang:\nMasukkan angka sesuai dengan menu yang diinginkan: ");
        int menu = input.nextInt();
        double s,p,l,A,h,t,r;
        double satas,sbawah,d1,d2;
        double phi = 3.14;

        // jika memilih Menu 1

        if (menu == 1) {
            System.out.print("PILIH BANGUN DATAR:\n1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Trapesium\n7. Belah Ketupat\n8. Layang-Layang\nMasukkan angka sesuai dengan nomor bangun datar yang diinginkan: ");
            int bangun = input.nextInt();
            if (bangun == 1) {
                System.out.println("Masukkan Panjang Sisi");
                s = input.nextDouble();
                double persegi = s * s;
                System.out.println("Luas Persegi = " + persegi);
                }
                else if (bangun == 2) {
                    System.out.println("Masukkan Panjang");
                    p = input.nextDouble();
                    System.out.println("Masukkan Lebar");
                    l = input.nextDouble();
                    double persegipanjang = p * l;
                    System.out.println("Luas Persegi Panjang = " + persegipanjang);
                    }
                else if (bangun == 3) {
                    System.out.println("Masukkan Alas");
                    A = input.nextDouble();
                    System.out.println("Masukkan Tinggi");
                    h = input.nextDouble();
                    double segitiga = (A * h) / 2;
                    System.out.println("Luas Segitiga = " + segitiga);
                    }
                else if (bangun == 4) {
                    System.out.println("Masukkan jari-jari" );
                    r = input.nextDouble();
                    double lingkaran = phi * r * r;
                    System.out.println("Luas Lingkaran = " + lingkaran);
                    }
                else if (bangun == 5) {
                    System.out.println("Masukkan Alas");
                    A = input.nextDouble();
                    System.out.println("Masukkan Tinggi");
                    h = input.nextDouble();
                    double jajargenjang = A * h;
                    System.out.println("Luas Jajar Genjang = " + jajargenjang);
                    }
                else if (bangun == 6) {
                    System.out.println("Masukkan Sisi Atas");
                    satas = input.nextDouble();
                    System.out.println("Masukkan Sisi Bawah");
                    sbawah = input.nextDouble();
                    System.out.println("Masukkan Tinggi");
                    h = input.nextDouble();
                    double trapesium = (satas + sbawah) * 1/2 * h;
                    System.out.println("Luas Trapesium = " + trapesium);
                    }
                else if (bangun == 7) {
                    System.out.println("Masukkan Diagonal 1");
                    d1 = input.nextDouble();
                    System.out.println("Masukkan Diagonal 2");
                    d2 = input.nextDouble();
                    double ketupat = (d1 * d2) / 2;
                    System.out.println("Luas Belah Ketupat = " + ketupat);
                    }
                else if (bangun == 8) {
                    System.out.println("Masukkan Diagonal 1");
                    d1 = input.nextDouble();
                    System.out.println("Masukkan Diagonal 2");
                    d2 = input.nextDouble();
                    double layang = (d1 * d2) / 2;
                    System.out.println("Luas Layang-Layang = " + layang);
                    }
                else
                    System.out.println("Inputan Anda tidak Valid");

        // Jika Memilih Menu 2

        } else if (menu == 2) {
                System.out.print("PILIH BANGUN RUANG\n1. Kubus\n2. Balok\n3. Prisma Segitiga\n4. Tabung\n5. Limas Segiempat\n6. Limas Segitiga\n7. Kerucut\n8. Bola\nMasukkan angka sesuai dengan nomor bangun ruang yang diinginkan: ");
                int bangun = input.nextInt();
                if (bangun == 1) {
                        System.out.println("Masukkan Panjang Sisi");
                        s = input.nextDouble();
                        double kubus = s * s * s;
                        System.out.println("Volume Kubus = " + kubus);
                        }
                    else if (bangun == 2) {
                        System.out.println("Masukkan Panjang");
                        p = input.nextDouble();
                        System.out.println("Masukkan Lebar");
                        l = input.nextDouble();
                        System.out.println("Masukkan Tinggi");
                        h = input.nextDouble();
                        double balok = p * l * h;
                        System.out.println("Volume Balok = " + balok);
                        }
                    else if (bangun == 3) {
                        System.out.println("Masukkan Alas Segitiga");
                        A = input.nextDouble();
                        System.out.println("Masukkan Tinggi segitiga");
                        t = input.nextDouble();
                        System.out.println("Masukkan Tinggi");
                        h = input.nextDouble();
                        double Psegitiga = A * t * h / 2;
                        System.out.println("Volume Prisma Segitiga = " + Psegitiga);
                        }
                    else if (bangun == 4) {
                        System.out.println("Masukkan jari-jari");
                        r = input.nextDouble();
                        System.out.println("Masukkan Tinggi");
                        h = input.nextDouble();
                        double tabung = phi * r * r * h;
                        System.out.println("Volume Tabung = " + tabung);
                        }
                    else if (bangun == 5) {
                        System.out.println("Masukkan Panjang");
                        p = input.nextDouble();
                        System.out.println("Masukkan Lebar");
                        l = input.nextDouble();
                        System.out.println("Masukkan Tinggi Limas");
                        h = input.nextDouble();
                        double LimasSegiempat = p * l * h / 3;
                        System.out.println("Volume Limas Segiempat = " + LimasSegiempat);
                        }
                    else if (bangun == 6) {
                        System.out.println("Masukkan Alas Segitiga");
                        A = input.nextDouble();
                        System.out.println("Masukkan tinggi Segitiga");
                        t = input.nextDouble();
                        System.out.println("Masukkan Tinggi Limas");
                        h = input.nextDouble();
                        double LimasSegitiga = (A * t / 2) * h / 3;
                        System.out.println("Volume Limas Segitiga = " + LimasSegitiga);
                        }
                    else if (bangun == 7) {
                        System.out.println("Masukkan Jari-jari Lingkaran");
                        r = input.nextDouble();
                        System.out.println("Masukkan Tinggi");
                        h = input.nextDouble();
                        double Kerucut = phi * r * r * h / 3;
                        System.out.println("Volume Kerucut = " + Kerucut);
                        }
                    else if (bangun == 8) {
                        System.out.println("Masukkan Jari-jari");
                        r = input.nextDouble();
                        double Bola = phi * r * r * r * 4/3;
                        System.out.println("Volume Bola = " + Bola);
                        }

                        else
                    System.out.println("Inputan Anda tidak Valid");  
                }

        else
            System.out.println("Inputan Anda tidak Valid");
        } 
    }