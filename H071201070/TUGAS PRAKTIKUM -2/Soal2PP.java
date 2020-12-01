import java.util.Scanner;
    class Soal2PP {
    
        public static void main(String[] args) {
            Scanner inputan = new Scanner (System.in);
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("|      Silahkan input angka sesuai dengan Menu yang diinginkan       |");
        System.out.println("----------------------------------------------------------------------");
            int P = inputan.nextInt();

        if(P==1) {
            System.out.println("** Pilih Bangun Datar **");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-Layang");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("| Silahkan input angka sesuai dengan nomor bangun datar yang diinginkan |");
            System.out.println("-------------------------------------------------------------------------");

            int q = inputan.nextInt();
            if (q==1) {
                System.out.println("Input Panjang Sisi");
                int s = inputan.nextInt();
                float L = (float)s*s;
                System.out.printf("Luas = %.2f", L);
            }
            else if (q==2) { 
                System.out.println("Input Panjang");
                int p = inputan.nextInt();
                System.out.println("Input Lebar");
                int l = inputan.nextInt();
                float L = (float) p*l;
                System.out.printf("Luas = %.2f", L);
            }
            else if (q==3) {
                System.out.println("Input Alas");
                int a = inputan.nextInt();
                System.out.println("Input Tinggi");
                int t = inputan.nextInt();
                float L = (float) 1/2*a*t;
                System.out.printf("Luas = %.2f", L);
            }
            else if (q==4){
                System.out.println("Input Jari-Jari");
                int r = inputan.nextInt();
                double L = ((double)Math.PI*r*r);
                System.out.printf("Luas = %.2f", L);
            }
            else if (q==5){
                System.out.println("Input Alas");
                int a = inputan.nextInt();
                System.out.println("Input Tinggi");
                int t = inputan.nextInt();
                float L = (float)a*t;
                System.out.printf("Luas = %.2f", L);
            }
            else if (q==6){
                System.out.println("Input Jumlah Panjang Sisi Sejajar");
                int p = inputan.nextInt();
                System.out.println("Input Tinggi");
                int t = inputan.nextInt();
                float L = ((float) (1/2)*p*t);
                System.out.printf("Luas = %.2f", L);
            }
            else if (q==7){
                System.out.println("Input Nilai d1");
                int d1 = inputan.nextInt();
                System.out.println("Input Nilai d2");
                int d2 = inputan.nextInt();
                float L = ((float)(1/2)*d1*d2);
                System.out.printf("Luas = %.2f", L);
            }
            else {
                System.out.println("Input Nilai d1");
                int d1 = inputan.nextInt();
                System.out.println("Input Nilai d2");
                int d2 = inputan.nextInt();
                float L = ((float)(1/2)*d1*d2);
                System.out.printf("Luas = %.2f", L);
            }
        } else {
            System.out.println("** Pilih Bangun Ruang **");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas Segitiga");
            System.out.println("4. Prisma Segitiga");
            System.out.println("5. Limas Segitiga");
            System.out.println("6. Tabung");
            System.out.println("7. Kerucut");
            System.out.println("8. Bola");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("| Silahkan input angka sesuai dengan nomor bangun ruang yang diinginkan |");
            System.out.println("-------------------------------------------------------------------------");
            int q = inputan.nextInt();
            if (q==1) {
                System.out.println("Input Panjang Rusuk");
                int r = inputan.nextInt();
                float V = (float)r*r*r;
                System.out.printf("Volume = %.2f", V);
            }
            else if (q==2) { 
                System.out.println("Input Panjang");
                int p = inputan.nextInt();
                System.out.println("Input Lebar");
                int l = inputan.nextInt();
                System.out.println("Input Tinggi");
                int t = inputan.nextInt();
                float V = (float) p*l*t;
                System.out.printf("Volume = %.2f", V);
            }
            else if (q==3) {
                System.out.println("Input Luas Alas");
                int la = inputan.nextInt();
                System.out.println("Input Tinggi");
                int t = inputan.nextInt();
                float V = (float) 1/3*la*t;
                System.out.printf("Volume = %.2f", V);
            }
            else if (q==4){
                System.out.println("Input Luas Alas");
                int la = inputan.nextInt();
                System.out.println("Input Tinggi");
                int t = inputan.nextInt();
                float V = (float) 1/2*la*t;
                System.out.printf("Volume = %.2f", V);
            }
            else if (q==5){
                System.out.println("Input Luas Alas");
                int la = inputan.nextInt();
                System.out.println("Input Tinggi");
                int t = inputan.nextInt();
                float V = (float) 1/3*la*t;
                System.out.printf("Volume = %.2f", V);
            }
            else if (q==6){
                System.out.println("Input Jari-Jari");
                int r = inputan.nextInt();
                System.out.println("Input Tinggi");
                int t = inputan.nextInt();
                double V = ((double)(Math.PI*r*r*t));
                System.out.printf("Volume = %.2f", V);
            }
            else if (q==7){
                System.out.println("Input Jari-Jari");
                int r = inputan.nextInt();
                System.out.println("Input Tinggi");
                int t = inputan.nextInt();
                double V = ((double)(1.0/3)*Math.PI*r*r*t);
                System.out.printf("Volume = %.2f", V);
            }
            else {
                System.out.println("Input Jari-Jari");
                int r = inputan.nextInt();
                double V = ((double)(4.0/3)*(Math.PI)*r*r*r);
                System.out.printf("Volume = %.2f", V);
            }
        }

  
    }

}
