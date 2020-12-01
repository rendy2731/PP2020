import java.util.Scanner;
class SoalPraktikum2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Menu");
    System.out.println("1. Mencari Luas Bangun Datar");
    System.out.println("2. Mencari Luas Bangun Ruang");
        int menu = input.nextInt();
        double phi = 3.14 ;
        if(menu == 1){
        System.out.println("**pilih bangun datar**");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi panjang");
        System.out.println("3.Segitiga");
        System.out.println("4.Lingkaran");
        System.out.println("5.Jajar Genjang");
        System.out.println("6.Trapesium");
        System.out.println("7.Belah Ketupat");
        System.out.println("8.Layang-layang");
        int D = input.nextInt();
            switch(D){
            case 1:
                System.out.println("masukkan panjang sisi : ");
                int s = input.nextInt();
                int persegi = s*s;
                System.out.println("Luas Persegi : "+ persegi );
                break;
            case 2:
                System.out.println("masukkan panjang (spasi) lebar : ");
                int p2 = input.nextInt();
                int l2 = input.nextInt();
                int persegipanjang = p2*l2;
                System.out.println("Luas Persegi panjang : " + persegipanjang);
                break;
            case 3 :
                System.out.println("masukkan alas (spasi) tinggi : ");
                double a3 = input.nextDouble();
                double t3 = input.nextDouble();
                double segitiga = (a3*t3)/2;
                System.out.println("Luas segitiga: " + segitiga);
                break;
            case 4 :
                System.out.println("masukkan jari-jari : ");
                double r4 = input.nextDouble();
                double lingkaran = phi*r4*r4;
                System.out.println("Luas lingkaran: " + lingkaran );
                break;
            case 5 :
                System.out.println("masukkan alas (spasi) tinggi : ");
                int a5 = input.nextInt();
                int t5 = input.nextInt();
                int JG = a5*t5;
                System.out.println("Luas Jajar genjang: " + JG );
                break;
            case 6 :
                System.out.println("masukkan sisi sejajar 1 (spasi) sisi sejajar 2 (spasi) tinggi : ");
                double ss1 = input.nextInt();
                double ss2 = input.nextInt();
                double t6 = input.nextInt();
                double trapesium = (ss1 + ss2) *t6 /2 ;
                System.out.println("Luas Trapesium : " + trapesium);
                break;
            case 7 :
                System.out.println("masukkan diagonal 1 (spasi) diagonal 2 : ");
                double d1 = input.nextInt();
                double d2 = input.nextInt();
                double BK = (d1+d2) /2 ;
                System.out.println("Luas Belah ketupat : " + BK );
                break;
            case 8 :
                System.out.println("masukkan diagonal 1 (spasi) diagonal 2 : ");
                double d3 = input.nextInt();
                double d4 = input.nextInt();
                double LL = (d3+d4) /2 ;
                System.out.println("Luas Layang-Layang : " + LL );
                break;
            default:
                System.out.println("tidak valid");
            }
        }
        else if(menu == 2){
        System.out.println("**pilih bangun ruang**");
        System.out.println("1.Kubus");
        System.out.println("2.Balok");
        System.out.println("3.Tabung");
        System.out.println("4.Kerucut");
        System.out.println("5.Bola");
        System.out.println("6.Prisma Segitiga");
        System.out.println("7.Limas Segitiga");
        System.out.println("8.Limas Segiempat");
        int R = input.nextInt();
            switch(R){
            case 1:
                System.out.println("masukkan panjang sisi : ");
                int sk = input.nextInt();
                int kubus = sk*sk*sk;
                System.out.println("Volume Kubus : "+ kubus );
            break;
            case 2:
                System.out.println("masukkan panjang (spasi) lebar (spasi) tinggi : ");
                int pb = input.nextInt();
                int lb = input.nextInt();
                int tb = input.nextInt();
                int balok = pb*lb*tb;
                System.out.println("Volume Balok : "+ balok );
            break;            
            case 3:
                System.out.println("masukkan jari-jari (spasi) tinggi : ");
                int rt = input.nextInt();
                int tt = input.nextInt();
                double tabung = phi*rt*rt*tt;
                System.out.println("Volume Tabung : "+ tabung );
            break;
            case 4:
                System.out.println("masukkan jari-jari (spasi) tinggi : ");
                int rk = input.nextInt();
                int tk = input.nextInt();
                double kerucut = (phi*rk*rk*tk) /3 ;
                System.out.println("Volume Kerucut : "+ kerucut );
            break;  
            case 5:
                System.out.println("masukkan jari-jari : ");
                int rb = input.nextInt();
                double bola = (4*phi*rb*rb*rb) /3 ;
                System.out.println("Volume Bola : "+ bola);
            break;
            case 6:
                System.out.println("masukkan luas alas (spasi) tinggi : ");
                int ap = input.nextInt();
                int tp = input.nextInt();
                double prismasegitiga = ap*tp;
                System.out.println("Volume Prisma Segitiga : "+ prismasegitiga );
            break;
            case 7:
                System.out.println("masukkan luas alas (spasi) tinggi : ");
                int als = input.nextInt();
                int tls = input.nextInt();
                double limassegitiga = (als*tls)/3;
                System.out.println("Volume Limas Segitiga : "+ limassegitiga );
            break;
            case 8:
                System.out.println("masukkan panjang alas (spasi) lebar alas (spasi) tinggi : ");
                int pa = input.nextInt();
                int la = input.nextInt();
                int tl = input.nextInt();
                double limassegiempat = (pa*la*tl)/3;
                System.out.println("Volume Limas Segiempat : "+ limassegiempat );
            break;                    
            default:
                System.out.println("tidak valid");
            }
        }
        else {
            System.out.println("tidak valid");
        }
    }
}

