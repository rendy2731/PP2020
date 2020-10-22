import java.util.Scanner;

class Soalpraktikum22 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("**MENU**");
        System.out.println("1.Luas dari bangun datar");
        System.out.println("2.Volume dari bangun Ruang");
        System.out.println("MASUKKAN NONOR YANG MAU ANDA PILIH :");
        int menu = A.nextInt();
        int tinggi, alas, jarijari;
        double phi = 3.14;
        switch (menu) {
            case 1 :
            System.out.println("**PILIHLAH SATU BANGUN DATAR**");
            System.out.println("1.Persegi");
            System.out.println("2.Persegi panjang");
            System.out.println("3.Segitiga");
            System.out.println("4.Lingkaran");
            System.out.println("5.Jajar genjang");
            System.out.println("6.Trapesium");
            System.out.println("7.Belah ketupat");
            System.out.println("8.Layang - layang");
            System.out.println("MASUKKAN NOMOR YANG MAU ANDA PILIH :");
            
            int Bangun = A.nextInt();
            switch (Bangun) {
                case 1 :
                System.out.println("Panjang sisi dari persegi :");
                int sisi = A.nextInt();
                double Luaspersegi = sisi * sisi;
                System.out.println( "Luas dari persegi :" + Luaspersegi);
                break;
                case 2 :
                System.out.println("Panjang sisi persegi panjang:");
                int panjang = A.nextInt();
                System.out.println("Lebar sisi persegi panjang:");
                int lebar = A.nextInt();
                double Luaspersegipanjang = panjang * lebar;
                System.out.println("Luas dari persegi panjang :" + Luaspersegipanjang);
                break;
                case 3 :
                System.out.println("Alas sisi segitiga :");
                alas = A.nextInt();
                System.out.println("Tinggi sisi segitiga :");
                tinggi = A.nextInt();
                double Luassegitiga = (alas * tinggi) / 2;
                System.out.println("Luas sisi segitiga :" + Luassegitiga );
                break;
                case 4 :
                System.out.println("Jari jari dari lingkaran : ");
                int Jari = A.nextInt();
                phi = 3.14;
                double Luaslingkaran = phi * Jari * Jari ; 
                System.out.println("Luas dari lingkaran :" + Luaslingkaran);
                break;
                case 5 :
                System.out.println("Alas sisi jajargenjang:");
                alas = A.nextInt();
                System.out.println("Tinggi sisi jajargenjang :");
                tinggi = A.nextInt();
                double LuasJajargenjang = alas*tinggi;
                System.out.println("Luas  sisi jajargenjang :" + LuasJajargenjang);
                break;
                case 6 :
                System.out.println("Sisi Atas trapesium :");
                int atas = A.nextInt();
                System.out.println("Sisi Bawah trapesium :");
                int bawah = A.nextInt();
                System.out.println("Tinggi trapesium :");
                tinggi = A.nextInt();
                double Luastrapesium = (atas+bawah) * 1/2 * tinggi;
                break;
                case 7 :
                System.out.println("Diagonal 1 dari belah ketupat:");
                int diagonal1 = A.nextInt();
                System.out.println("Diagonal 2 dari belah ketupat:");
                int diagonal2 = A.nextInt();
                double Luasbelahketupat = (diagonal1 / diagonal2) / 2;
                System.out.println("Luas dari belah ketupat :" + Luasbelahketupat);
                break;
                case 8 :
                System.out.println("Diagonal 1 dari layang-layang :");
                int d1 = A.nextInt();
                System.out.println("Diagonal 2 dari layang-layang :");
                int d2 = A.nextInt();
                double Luaslayanglayang = (d1 * d2) / 2;
                System.out.println("Luas dari layang layang :" + Luaslayanglayang);
                break;

                default :
                System.out.println("***INPUTAN ANDA SALAH ATAU TIDAK VALID***");
                break;
            }
                case 2 :
                System.out.println("**PILIHLAH SATU BANGUN RUANG**");
                System.out.println("1.Bola");
                System.out.println("2.Kubus");
                System.out.println("3.Prisma segitiga");
                System.out.println("4.Balok");
                System.out.println("5.Tabung");
                System.out.println("6.Kerucut");
                System.out.println("MASUKKAN NOMOR YANG MAU ANDA PILIH :");
                
                int BangunRuang = A.nextInt();
                switch (BangunRuang) {
                case 1 :
                System.out.println("Jari-jari dari bola :");
                jarijari = A.nextInt();
                System.out.println("phi :");
                phi = 3.14;
                double volumebola = 4 * phi * jarijari *jarijari * jarijari / 3;
                System.out.println("Volume dari bola : " + volumebola);
                break;
                case 2 :
                System.out.println("Sisi dari kubus:");
                int sisi = A.nextInt();
                double volumekubus = sisi * sisi * sisi;
                System.out.println("Volume sisi dari kubus :" + volumekubus);
                break;
                case 3 :
                System.out.println("Luas alas dari prisma segitiga :");
                int luasalas = A.nextInt();
                System.out.println("Tinggi dari prisma segitiga :");
                tinggi = A.nextInt();
                double volumeprismasegitiga = luasalas * tinggi;
                System.out.println("Volume dari prisma segitiga :" +volumeprismasegitiga);
                break;
                case 4 :
                System.out.println("Panjang balok :");
                int panjang = A.nextInt();
                System.out.println("Lebar balok :");
                int lebar = A.nextInt();
                System.out.println("Tinggi balok :");
                tinggi = A.nextInt();
                double volumebalok = panjang * lebar * tinggi;
                System.out.println("Volume balok :" +volumebalok);
                break;
                case 5 :
                System.out.println("Jari-jari tabung :");
                jarijari = A.nextInt();
                System.out.println("Tinggi tabung :");
                tinggi = A.nextInt();
                phi = A.nextDouble();
                double volumetabung = phi * jarijari * jarijari * tinggi;
                System.out.println("Volume tabung :" + volumetabung);
                break;
                case 6 :
                System.out.println("Jari-jari kerucut :");
                jarijari = A.nextInt();
                System.out.println("Tinggi kerucut :");
                tinggi = A.nextInt();
                phi = A.nextDouble();
                double volumekerucut = 1 * phi * jarijari *jarijari * tinggi;
                System.out.println("Volume kerucut :" + volumekerucut);
                break;

                default :
                System.out.println("***INPUTAN ANDA SALAH ATAU TIDAK VALID***");
                break;
              
                
                 
                }


            }


        }
    }

