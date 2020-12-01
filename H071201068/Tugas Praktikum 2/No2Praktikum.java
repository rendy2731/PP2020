import java.util.Scanner;

public class No2Praktikum {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int menu1, menu2;
        double a, b, c, hasil;

        System.out.println("====SELAMAT DATANG====");
        System.out.println();
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println();
        System.out.println("Masukkan Angka Pilihan Menu yang Anda Inginkan :");
        menu1 = input.nextInt();
        System.out.println("--------------------------------------------------");

        switch (menu1) {
            case 1 :
                System.out.println("** Pilihan Bangun Datar **");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-Layang");
                System.out.println();
                System.out.println("Masukkan Angka Sesuai Pilihan Bangun Datar yang Anda Inginkan :");
                menu2 = input.nextInt();
                System.out.println("--------------------------------------------------");

                switch (menu2){
                    case 1 :
                            System.out.println("Masukkan Nilai Sisi");
                        a = input.nextDouble();
                        hasil = Math.pow(a, 2);
                            System.out.println("Luas Persegi = " + hasil);
                        break;

                    case 2 :
                            System.out.println("Masukkan Nilai Panjang");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Lebar");
                        b = input.nextDouble();
                        hasil = a*b;
                            System.out.println("Luas Persegi Panjang = " + hasil);
                        break;

                    case 3 :
                            System.out.println("Masukkan Nilai Alas");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Tinggi");
                        b = input.nextDouble();
                        hasil = ((a*b)/2);
                            System.out.println("Luas Segitiga = " + hasil);
                        break;

                    case 4 :
                            System.out.println("Masukkan Jari-Jari");
                        a = input.nextDouble();
                        hasil = Math.PI*Math.pow(a, 2);
                            System.out.println("Luas Lingkaran = " + hasil);
                        break;
                        
                    case 5 :
                            System.out.println("Masukkan Nilai Alas");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Tinggi");
                        b = input.nextDouble();
                        hasil = a*b;
                            System.out.println("Luas Jajar Genjang = " + hasil);
                        break;

                    case 6 :
                            System.out.println("Masukkan Nilai Sisi Atas");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Sisi Bawah");
                        b = input.nextDouble();
                            System.out.println("Masukkan Nilai Tinggi");
                        c = input.nextDouble();
                        hasil = ((a+b)*c)/2;
                            System.out.println("Luas Trapesium = " + hasil);
                        break;

                    case 7 :
                            System.out.println("Masukkan Nilai Diagonal 1");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Diagonal 2");
                        b = input.nextDouble();
                        hasil = ((a*b)/2);
                            System.out.println("Luas Belah Ketupat = " + hasil);
                        break;

                    case 8 :
                        System.out.println("Masukkan Nilai Diagonal 1");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Diagonal 2");
                        b = input.nextDouble();
                        hasil = ((a*b)/2);
                            System.out.println("Luas Layang-Layang = " + hasil);
                        break;
                    
                }break;

            case 2 :
                System.out.println("** Pilihan Bangun Ruang **");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Limas Segiempat");
                System.out.println("4. Prisma Segitiga");
                System.out.println("5. Limas Segitiga");
                System.out.println("6. Tabung");
                System.out.println("7. Kerucut");
                System.out.println("8. Bola");
                System.out.println();
                System.out.println("Masukkan Angka Sesuai Pilihan Bangun Ruang yang Anda Inginkan :");
                menu2 = input.nextInt();
                System.out.println("--------------------------------------------------");

                switch (menu2){
                    case 1 :
                            System.out.println("Masukkan Nilai Rusuk");
                        a = input.nextDouble();
                        hasil = Math.pow(a, 3);
                            System.out.println("Volume Kubus = " + hasil);
                        break;

                    case 2 :
                            System.out.println("Masukkan Nilai Panjang");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Lebar");
                        b = input.nextDouble();
                            System.out.println("Masukkan Nilai Tinggi");
                        c = input.nextDouble();
                        hasil = a*b*c;
                            System.out.println("Volume Balok = " + hasil);
                        break;

                    case 3 :
                            System.out.println("Masukkan Nilai Luas Alas");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Tinggi");
                        b = input.nextDouble();
                        hasil = ((a*b)/3);
                            System.out.println("Volume Limas Segiempat = " + hasil);
                        break;

                    case 4 :
                            System.out.println("Masukkan Nilai Luas Alas");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Tinggi");
                        b = input.nextDouble();
                        hasil = ((a*b)/2);
                            System.out.println("Volume Prisma Segitiga = " + hasil);
                        break;
                        
                    case 5 :
                            System.out.println("Masukkan Nilai Luas Alas");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai Tinggi");
                        b = input.nextDouble();
                        hasil = ((a*b)/6);
                            System.out.println("Volume Limas Segitiga = " + hasil);
                        break;

                    case 6 :
                            System.out.println("Masukkan Nilai Jari-Jari");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai TInggi");
                        b = input.nextDouble();
                        hasil = Math.PI*Math.pow(a, 2)*b;
                            System.out.println("Volume Tabung = " + hasil);
                        break;

                    case 7 :
                            System.out.println("Masukkan Nilai Jari-Jari");
                        a = input.nextDouble();
                            System.out.println("Masukkan Nilai TInggi");
                        b = input.nextDouble();
                        hasil = (Math.PI*Math.pow(a, 2)*b)/3;
                            System.out.println("Volume Kerucut = " + hasil);
                        break;

                    case 8 :
                        System.out.println("Masukkan Nilai Jari-Jari");
                        a = input.nextDouble();
                        hasil = (4*Math.PI*Math.pow(a, 3))/3;
                            System.out.println("Volume Bola = " + hasil);
                        break;
                    
                }break;

        }   
            input.close();
            
        System.out.println("\n====SILAHKAN DATANG KEMBALI====");
    }
}
