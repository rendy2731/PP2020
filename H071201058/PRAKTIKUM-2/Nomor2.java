import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        

        System.out.println("** Menu **");
        System.out.print("1. Mencari Luas Bangun Datar \n2. Mencari Volume Bangun Ruang \n\nInput angka sesua dengan menu yang dinginkan : ");
        int menu = inputan.nextInt();


                       // ============ OPSI 1 (BANGUN DATAR) ============ 
        if (menu == 1) {
            System.out.println("** Pilih Bangun Datar **");
            System.out.println("1. Persegi \n2. Persegi panjang \n3. Segitiga \n4. Lingkaran \n5. Jajar genjang \n6. Trapesium \n7. Belah ketupat \n8. Layang-layang");
            System.out.print("\nInput angka sesuai dengan nomor bangun datar yang diinginkan : ");
            int bangun_datar = inputan.nextInt();
                // Persegi --------------------------
            if (bangun_datar == 1) {
                System.out.print("\nInput sisi : ");
                double sisi = inputan.nextDouble();
                System.out.printf("Luas persegi = %.1f", (sisi*sisi));
            } else
                // Persegi Panjang ------------------
            if (bangun_datar == 2) {
                System.out.print("\nInput panjang : ");
                double panjang = inputan.nextDouble();
                System.out.print("Input lebar : ");
                double lebar = inputan.nextDouble();
                System.out.printf("Luas persegi panjang = %.1f", (panjang*lebar));
            } else
                // Segitiga dan jajar genjang -------------------------------
            if (bangun_datar == 3 | bangun_datar == 5) {
                System.out.print("Input alas = ");
                double alas = inputan.nextDouble();
                System.out.print("input tinggi = ");
                double tinggi = inputan.nextDouble();
                if (bangun_datar == 3) {
                System.out.printf("Luas segitiga = %.1f", (alas*tinggi/2));
                } else
                System.out.printf("Luas Jajar genjang = %.1f", (alas*tinggi));
            }else 
                // Lingkaran ------------------------------------------------
            if (bangun_datar == 4){
                System.out.print("Input jari-jari : ");
                double r = inputan.nextDouble();
                System.out.printf("Luas linkaran = %.1f", (Math.PI*Math.pow(r, 2)));
            } else 
                // Trapesium ----------------------- ------------------------
            if (bangun_datar == 6) {
                System.out.print("Input panjang sisi atas : ");
                double sisi_atas = inputan.nextDouble();
                System.out.print("Input panjang sisi bawah : ");
                double sisi_bawah = inputan.nextDouble();
                System.out.print("Input tinggi : ");
                double tinggi = inputan.nextDouble();
                System.out.printf("Luas Trapesium = %.1f", ((sisi_atas+sisi_bawah)*tinggi/2));
            } else
                // Belah ketupat dan layang layang ---------------------------
            if (bangun_datar == 7 | bangun_datar == 8 ) {
                System.out.print("Input diagonal 1 : ");
                double diagonal_1 = inputan.nextDouble();
                System.out.print("Input diagonal 2 : ");
                double diagonal_2 = inputan.nextDouble();
                if (bangun_datar == 7) {
                System.out.printf("Luas belah ketupat = %.1f", (diagonal_1*diagonal_2/2)); 
                }
                System.out.printf("Luas belah layang-layang = %.1f", (diagonal_1*diagonal_2/2)); 
            } else System.out.println("data yang di masukkan tidak sesuai");
               

                        // ============== OPSI 2 (BANGUN RUANG) ==============
        } else if (menu == 2) { 
            System.out.println("** Pilih Bangun Ruang **");
            System.out.println("1. Kubus \n2. Balok \n3. Limas persegi \n4. Limas segitiga \n5. Prisma segitiga \n6. Kerucut \n7. Bola \n8. Tabung ");
            System.out.print("\nInput angka sesuai dengan nomor bangun datar yang diinginkan : ");
            int bangun_ruang = inputan.nextInt();
                // Kubus ------------------------------------------------------
            if (bangun_ruang == 1) {
                System.out.print("Input rusuk : ");
                double rusuk = inputan.nextInt();
                System.out.printf("Volume kubus : %.1f", Math.pow(rusuk, 3));
        } else 
                 // Balok -----------------------------------------------------
        if (bangun_ruang == 2) {
                System.out.print("Input panjang : ");
                double panjang = inputan.nextInt();
                System.out.print("Input lebar : ");
                double lebar = inputan.nextInt();
                System.out.print("Input tinggi : ");
                double tinggi = inputan.nextInt();
                System.out.printf("Volume balok : %.1f", (panjang*lebar*tinggi));
            } else 
                    // Limas persegi, limas segitiga, dan prisma segitiga ------
                if (bangun_ruang == 3 | bangun_ruang == 4 | bangun_ruang == 5) {
                System.out.print("Input tinggi: ");
                double tinggi = inputan.nextInt();
                System.out.print("Input sisi alas : ");
                double sisi_alas = inputan.nextInt();
                if (bangun_ruang == 3){
                    System.out.printf("Volume limas persegi = %.1f", (sisi_alas*sisi_alas*tinggi/3));
                } else {
                    System.out.print("Input tinggi alas : ");
                    double tinggi_alas = inputan.nextInt();
                    if (bangun_ruang == 4) {
                    System.out.printf("Volume limas segitiga = %.1f", sisi_alas*tinggi_alas*tinggi/6); 
                    }else System.out.printf("volume prisma segitiga = : %.1f", (sisi_alas*tinggi_alas*tinggi/2) ); 
                }
            } else 
                    // Kerucut, tabung, dan bola --------
            if (bangun_ruang == 6 | bangun_ruang == 7 | bangun_ruang == 8) {
                System.out.print("Input jari-jari : ");
                double r = inputan.nextInt();
                if (bangun_ruang == 6 | bangun_ruang == 8) {
                    System.out.print("Input tinggi : ");
                    double tinggi = inputan.nextInt();
                    if (bangun_ruang == 6) {
                        System.out.printf("Volume kerucut = %.1f", (Math.PI*r*r*tinggi/3));
                    } else System.out.printf("Volume Tabung = %.1f", (Math.PI*r*r*tinggi) );
                } else System.out.printf("Volume bola = %.1f", ((4*Math.PI*Math.pow(r, 3))/3));
            } else System.out.println("Data yang dimasukkan tidak sesuai");
        } else System.out.println("Data yang dimasukkan tidak sesuai");
     inputan.close();
    }
}
