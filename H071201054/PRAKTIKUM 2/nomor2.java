import java.util.Scanner;
public class nomor2{
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);
        int menu;
        int luas;
        int volume;

        System.out.println("**Menu**");
        System.out.println("1. Mencari luas bangun datar");
        System.out.println("2. Mencari volume bangun ruang");
        System.out.println("input angka sesuai dengan menu yang diinginkan");
        menu = user.nextInt();

        if (menu == 1){
            System.out.println("**Pilih Bangun Datar**");
            System.out.println("1. Persegi ");
            System.out.println("2. Persegi panjang ");
            System.out.println("3. Segitiga ");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar genjang ");
            System.out.println("6. Trapesium ");
            System.out.println("7. Belah ketupat ");
            System.out.println("8. Layang-layang ");
            System.out.println("input angka sesuai dengan nomor bangun datar yang diinginkan :" );
            luas = user.nextInt();

            switch(luas){
                case 1:
                System.out.println("input sisi");
                float sisi = user.nextFloat();
                float luaspersegi = sisi*sisi;
                System.out.println("luas persegi = " + luaspersegi);
                break;

                case 2:
                System.out.println("input panjang");
                float panjang = user.nextInt();
                System.out.println("input lebar");
                float lebar = user.nextInt();
                float luaspersegipanjang = panjang*lebar;
                System.out.println("luas persegi panjang = " + luaspersegipanjang);
                break;

                case 3:
                System.out.println("input alas");
                float alas = user.nextFloat();
                System.out.println("input tinggi");
                float tinggi = user.nextFloat();
                float luassegitiga = (alas*tinggi)/2;
                System.out.println("luas segitiga = " + luassegitiga);
                break;

                case 4:
                System.out.println("input jari jari");
                double r = user.nextDouble();
                double phi = 3.14;
                double luaslingkaran = phi * r * r;
                System.out.println("luas lingkaran = " + luaslingkaran);
                break;

                case 5:
                System.out.println("input alas");
                float a = user.nextFloat();
                System.out.println("input tinggi");
                float t = user.nextFloat();
                float luasjajargenjang = a*t;
                System.out.println("luas jajar genjang = " + luasjajargenjang);
                break;

                case 6:
                System.out.println("input rusuk sejajar");
                float rusuk = user.nextFloat();
                System.out.println("input tinggi");
                float tinggitrap = user.nextFloat();
                float luastrapseium = (rusuk * tinggitrap)/2;
                System.out.println("luas trapesium = " + luastrapseium);
                break;

                case 7:
                System.out.println("input diagonal 1");
                float d1 = user.nextFloat();
                System.out.println("input diagonal 2");
                float d2 = user.nextFloat();
                float luasbelahketupat = (d1 * d2)/2;
                System.out.println("luas belah ketupat = " + luasbelahketupat);
                break;

                case 8:
                System.out.println("input diagonal 1");
                float diag1 = user.nextFloat();
                System.out.println("input diagonal 2");
                float diag2 = user.nextFloat();
                float luaslayang = (diag1 * diag2)/2;
                System.out.println("luas layang-layang = " + luaslayang);
                break;
        }

        } else if(menu == 2){
            System.out.println("**Pilih Bangun Ruang**");
            System.out.println("1. Kubus ");
            System.out.println("2. Balok ");
            System.out.println("3. Tabung ");
            System.out.println("4. Kerucut");
            System.out.println("5. Limas segitiga ");
            System.out.println("6. Limas segiempat ");
            System.out.println("7. Prisma segitiga ");
            System.out.println("8. Bola ");
            System.out.println("input angka sesuai dengan nomor bangun ruang yang diinginkan :" );
            volume = user.nextInt();
            
            switch(volume){
                case 1:
                System.out.println("input rusuk");
                float s = user.nextFloat();
                float volumekubus = s * s * s;
                System.out.println("volume kubus = " + volumekubus);
                break;

                case 2:
                System.out.println("input panjang");
                float p = user.nextFloat();
                System.out.println("input lebar");
                float l = user.nextFloat();
                System.out.println("input tinggi");
                float t = user.nextFloat();
                float volumebalok = p*l*t;
                System.out.println("volume balok = " + volumebalok);
                break;

                case 3:
                System.out.println("input jari-jari");
                double r = user.nextDouble();
                System.out.println("input tinggi");
                double h = user.nextFloat();
                double pi = 3.14;
                double volumetabung = pi*r*r*h;
                System.out.println("volume tabung = " + volumetabung);         
                break;

                case 4:
                System.out.println("input jari-jari");
                double jarijari = user.nextDouble();
                System.out.println("input tinggi");
                double tnggi = user.nextDouble();
                double phii = 3.14;
                double volumekerucut = (phii*jarijari*jarijari*tnggi)/3;
                System.out.println("volume kerucut = " + volumekerucut);
                break;

                case 5:
                System.out.println("input luas alas ");
                float la = user.nextFloat();
                System.out.println("input tinggi");
                float tinggii = user.nextFloat();
                float volumelimassegitiga = (la*tinggii)/3;
                System.out.println("volume limas segitiga = " + volumelimassegitiga);
                break;

                case 6:
                System.out.println("input luas alas");
                float luasalas = user.nextFloat();
                System.out.println("input tinggi");
                float tinggilimas = user.nextFloat();
                float volumelimas = (luasalas*tinggilimas)/3;
                System.out.println("volume limas segiempat = " + volumelimas);
                break;

                case 7:
                System.out.println("input luas alas");
                float luasalasprisma = user.nextFloat();
                System.out.println("input tinggi");
                float tinggiprisma = user.nextFloat();
                float volumeprisma = luasalasprisma*tinggiprisma;
                System.out.println("volume prisma segitiga = " + volumeprisma);
                break;

                case 8:
                System.out.println("input jari-jari");
                double jarijaribola = user.nextDouble();
                double pimtk = 3.14;
                double volumebola = 4 * (pimtk*jarijaribola*jarijaribola*jarijaribola)/3;
                System.out.println("volume bola = " + volumebola);
                break;




            }

        }    


    }
}

