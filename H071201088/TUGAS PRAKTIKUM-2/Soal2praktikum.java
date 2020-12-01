import java.util.Scanner;
class Soal2praktikum {
    public static void main(String[] args) {
        Scanner aqila = new Scanner(System.in);
        System.out.println("*************MENU*************");
        System.out.println("1. MENCARI LUAS BANGUN DATAR ");
        System.out.println("2. MENCARI VOLUME BANGUN RUANG");
        System.out.println("*******************************");
    
        System.out.print("Masukkan pilihan mu=");
        int a = aqila.nextInt();
        
      
        int b;
        int luas, alas, tinggi,sisi,r,d1,d2;
        int volume;
        int panjang;
        int lebar;
         
        if(a==1){ //LUAS BANGUN DATAR
            System.out.println("--- PILIHAN BANGUN DATAR ----");
            System.out.println("1. PERSEGI");
            System.out.println("2. PERSEGI PANJANG");
            System.out.println("3. SEGITIGA ");
            System.out.println("4. LINGKARAN ");
            System.out.println("5. JAJAR GENJANG");
            System.out.println("6. TRAPESIUM");
            System.out.println("7. BELAH KETUPAT");
            System.out.println("8. LAYANG-LAYANG ");

            System.out.print("Masukkan pilihan bangun datarmu=");
            b = aqila.nextInt();
            switch(b){ //persegi
                case 1:
                System.out.print("input sisi=");
                sisi = aqila.nextInt();
                luas = sisi*sisi;
                System.out.print("LUAS PERSEGI ="+luas);
                break;

                case 2://persegi panjang 
                System.out.print("input nilai panjang =");
                panjang = aqila.nextInt();
                System.out.print("input nilai lebar   =");
                lebar = aqila.nextInt();
                luas =panjang*lebar;
                System.out.print("LUAS PERSEGI PANJANG ="+luas);
                break; 

                case 3:// segitiga
                System.out.print("input nilai alas    =");
                alas = aqila.nextInt();
                System.out.print("input nilai panjang =");
                tinggi= aqila.nextInt();
                luas =(alas*tinggi)/2;
                System.out.println("LUAS SEGITIGA     ="+luas);
                break;

                case 4:// lingkaran 
                System.out.print("input nilai jari-jari =");
                r = aqila.nextInt();
                double luas1 =Math.PI*(r*r);
                System.out.printf("LUAS LINGKARAN =%.2f",luas1);
                break;

                case 5:// jajar genjang
                System.out.print("input nilai alas   =");
                alas = aqila.nextInt();
                System.out.print("input nilai tinggi =");
                tinggi = aqila.nextInt();
                luas= alas*tinggi;
                System.out.print("LUAS JAJAR GENJANG    ="+luas); 
                break;

                case 6://trapesium
                System.out.print("input nilai sisi 1=");
                int s1= aqila.nextInt();
                System.out.print("input nilai sisi 2 =");
                int s2 = aqila.nextInt();
                System.out.print("input nilai tinggi =");
                tinggi = aqila.nextInt();
                luas =((s1+s2)*tinggi)/2;
                System.out.print("LUAS TRAPESIUM    ="+luas);
                break;

                case 7://belah ketupat
                System.out.print("input nilai diagonal 1 =");
                d1 = aqila.nextInt();
                System.out.print("input nilai diagonal 2 =");
                d2= aqila.nextInt();
                luas= (d1*d2)/2;
                System.out.print("LUAS BELAH KETUPAT     ="+luas);
                break;

                case 8:// layang-layang
                System.out.print("input nilai diagonal 1 =");
                d1 = aqila.nextInt();
                System.out.print("input nilai diagonal 2 =");
                d2= aqila.nextInt();
                luas = (d1+d2)/2;
                System.out.print("LUAS LAYANG-LAYANG    ="+luas);
                break;

                default:
                System.out.print("MAAF NILAI INPUTAN YANG ANDA MASUKKAN SALAH");
            }    
        }else if (a==2){ //VOLUME
            System.out.println("--- PILIHAN BANGUN RUANG ----");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. LIMAS SEGIEMPAT ");
            System.out.println("4. PRISMA SEGITIGA ");
            System.out.println("5. LIMAS SEGITIGA");
            System.out.println("6. TABUNG");
            System.out.println("7. KERUCUT");
            System.out.println("8. BOLA");

            System.out.print("Masukkan pilihan bangun datarmu=");
            b = aqila.nextInt();

            switch(b){ //KUBUS 
                case 1:
                System.out.print("input sisi=");
                sisi = aqila.nextInt();
                volume= sisi*sisi*sisi;
                System.out.printf("VOLUME KUBUS ="+volume);
                break;

                case 2://BALOK 
                System.out.print("input nilai panjang=");
                panjang = aqila.nextInt();
                System.out.print("input nilai lebar  =");
                lebar = aqila.nextInt();
                System.out.print("input nilai tinggi =");
                tinggi = aqila.nextInt();
                volume= panjang*lebar*tinggi;
                System.out.print("VOLUME BALOK ="+volume);
                break; 

                case 3:// LIMAS SEGIEMPAT
                System.out.print("input nilai sisi  =");
                sisi= aqila.nextInt();
                int luas_alas= sisi*sisi;
                System.out.print("input nilai tinggi =");
                tinggi = aqila.nextInt();
                volume= (luas_alas*tinggi)/3;
                System.out.print("VOLUME LIMAS SEGIEMPAT ="+volume);
               
                break;

                case 4:// PRISMA SEGITIGA 
                System.out.print("input nilai alas=");
                alas = aqila.nextInt();
                System.out.print("input nilai tinggi segitiga  =");
                tinggi = aqila.nextInt();
                System.out.print("input nilai tinggi prisma =");
                 int tinggi1 = aqila.nextInt();
                volume= (alas*tinggi*tinggi1)/2;
                System.out.print("VOLUME PRISMA SEGITIGA ="+volume);
                break;

                case 5:// LIMAS SEGITIGA
                System.out.print("input nilai alas=");
                alas = aqila.nextInt();
                System.out.print("input nilai tinggi segitiga  =");
                tinggi = aqila.nextInt();
                System.out.print("input nilai tinggi limas =");
                tinggi1 = aqila.nextInt();
                volume= (alas*tinggi*tinggi)/6;
                System.out.print("VOLUME PRISMA SEGITIGA ="+volume);
                break;

                case 6:// TABUNG
                System.out.print("input nilai jari-jari=");
                r = aqila.nextInt();
                System.out.print("input nilai tinggi tinggi =");
                tinggi = aqila.nextInt();
                double volume1 = (Math.PI*r*r*tinggi);
                System.out.printf("VOLUME TABUNG = %.2f ",volume1);
                break;

                case 7://KERUCUT
                System.out.print("input nilai jari-jari=");
                r= aqila.nextInt();
                System.out.print("input nilai tinggi segitiga  =");
                tinggi= aqila.nextInt();
                
                volume1 = (Math.PI*r*r*tinggi)/3;
                System.out.printf("VOLUME KERUCUT = %.2f  ",volume1);
                
               
                break;
                case 8:// LINGKARAN 
                System.out.print("input nilai jari-jari=");
                r= aqila.nextInt();
                
                volume1 = (4*Math.PI*r*r*r)/3;
                System.out.printf("VOLUME KERUCUT = %.2f",volume1);
                break;
                default:
                System.out.print("MAAF NILAI INPUTAN YANG ANDA MASUKKAN SALAH ");
            }
        }
        else {
        System.out.print("MAAF NILAI INPUTAN YANG ANDA MASUKKAN SALAH");
        }
    }
        
}
