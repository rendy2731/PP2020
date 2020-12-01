import java.util.Scanner;

public class O2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double sisi, pan, leb, ting;
		double rumus;
		System.out.println("** Menu **");
		System.out.println("1. Mencari luas bangun datar");
		System.out.println("2. Mencari volume bangun ruang");
		System.out.println("\nInput angka sesuai dengan Menu yang diinginkan :");
		int menuA = in.nextInt();

		if(menuA == 1){
			System.out.println("\n** Pilih Bangun Datar **");
			System.out.println("1. Persegi");
			System.out.println("2. Persegi Panjang");
			System.out.println("3. Segitiga");
			System.out.println("4. Lingkaran");
			System.out.println("5. Jajar Genjang");
			System.out.println("6. Trapesium");
			System.out.println("7. Belah Ketupat");
			System.out.println("8. Layang-layang");
			System.out.println("\nInput angka sesuai dengan nomor bangun datar yang diinginkan :");
			int menuB = in.nextInt();
			if(menuB == 1){
				System.out.println("Input Sisi");
				sisi = in.nextDouble();
				rumus = sisi * sisi;
				System.out.println("\nLuas Persegi : " + String.format("%.1f", rumus));
			}else if(menuB == 2){
				System.out.println("Input Panjang");
				pan = in.nextDouble();
				System.out.println("Input Lebar");
				leb = in.nextDouble();
				rumus = pan * leb;
				System.out.println("\nLuas Persegi Panjang : " + String.format("%.1f", rumus));
			}else if(menuB == 3){
				System.out.println("Input Alas");
				pan = in.nextDouble();
				System.out.println("Input Tinggi");
				leb = in.nextDouble();
				rumus = (pan * leb) / 2;
				System.out.println("\nLuas Segitiga : " + String.format("%.1f", rumus));
			}else if(menuB == 4){
				System.out.println("Input Jari-jari");
				sisi = in.nextDouble();
				rumus = Math.PI * sisi * sisi;
				System.out.println("\nLuas Lingkaran : " + String.format("%.1f", rumus));
			}else if(menuB == 5){
				System.out.println("Input Alas");
				pan = in.nextDouble();
				System.out.println("Input Tinggi");
				leb = in.nextDouble();
				rumus = pan * leb;
				System.out.println("\nLuas Jajar Genjang : " + String.format("%.1f", rumus));
			}else if(menuB == 6){
				System.out.println("Input Sisi Atas");
				pan = in.nextDouble();
				System.out.println("Input Sisi Bawah");
				leb = in.nextDouble();
				System.out.println("Input Tinggi");
				ting = in.nextDouble();
				rumus = ((pan + leb) * ting)/ 2;
				System.out.println("\nLuas Trapesium : " + String.format("%.1f", rumus));
			}else if(menuB == 7){
				System.out.println("Input Diagonal 1");
				pan = in.nextDouble();
				System.out.println("Input Diagonal 2");
				leb = in.nextDouble();
				rumus = (pan * leb) / 2;
				System.out.println("\nLuas Belah Ketupat : " + String.format("%.1f", rumus));
			}else if(menuB == 8){
				System.out.println("Input Diagonal 1");
				pan = in.nextDouble();
				System.out.println("Input Diagonal 2");
				leb = in.nextDouble();
				rumus = (pan * leb) / 2;
				System.out.println("\nLuas Layang-Layang : " + String.format("%.1f", rumus));
			}else{
			System.out.println("\nMenu Tidak Ditemukan.");
			}
		}else if(menuA == 2){
			System.out.println("\n** Pilih Bangun Ruang **");
			System.out.println("1. Kubus");
			System.out.println("2. Balok");
			System.out.println("3. Prisma");
			System.out.println("4. Limas Segitiga");
			System.out.println("5. Limas Segiempat");
			System.out.println("6. Tabung");
			System.out.println("7. Bola");
			System.out.println("8. Kerucut");
			System.out.println("\nInput angka sesuai dengan nomor bangun datar yang diinginkan :");
			int menuC = in.nextInt();
			if(menuC == 1){
				System.out.println("Input Rusuk");
				sisi = in.nextInt();
				rumus = sisi * sisi * sisi;
				System.out.println("\nVolume Kubus : " + String.format("%.1f", rumus));
			}else if(menuC == 2){
				System.out.println("Input Panjang");
				pan = in.nextInt();
				System.out.println("Input Lebar");
				leb = in.nextInt();
				System.out.println("Input Tinggi");
				ting = in.nextInt();
				rumus = pan * leb * ting;
				System.out.println("\nVolume Balok : " + String.format("%.1f", rumus));
			}else if(menuC == 3){
				System.out.println("Input Alas Segitiga");
				sisi = in.nextDouble();
				System.out.println("Input Tinggi Segitiga");
				ting = in.nextDouble();
				System.out.println("Input Panjang Prisma");
				pan = in.nextDouble();
				rumus = ((sisi * pan * ting) / 2);
				System.out.println("\nVolume Prisma : " + String.format("%.1f", rumus));
			}else if(menuC == 4){
				System.out.println("Input Panjang Segitiga Alas");
				sisi = in.nextDouble();
				System.out.println("Input Tinggi Segitiga Alas");
				pan = in.nextDouble();
				System.out.println("Input Tinggi Limas");
				ting = in.nextDouble();
				rumus = (sisi * pan * ting) / 6;
				System.out.println("\nVolume Limas Segitiga : " + String.format("%.1f", rumus));
			}else if(menuC == 5){
				System.out.println("Input Panjang Alas");
				pan = in.nextInt();
				System.out.println("Input Lebar Alas");
				leb = in.nextInt();
				System.out.println("Input Tinggi Limas");
				ting = in.nextInt();
				rumus = (pan * leb * ting) / 3;
				System.out.println("\nVolume Limas Segiempat : " + String.format("%.1f", rumus));
			}else if(menuC == 6){
				System.out.println("Input Jari-jari");
				sisi = in.nextDouble();
				System.out.println("Input Tinggi Tabung");
				ting = in.nextDouble();
				rumus = Math.PI * sisi * sisi * ting;
				System.out.println("\nVolume Tabung : " + String.format("%.1f", rumus));
			}else if(menuC == 7){
				System.out.println("Input Jari-jari");
				sisi = in.nextDouble();
				rumus = (4 * (Math.PI * sisi * sisi * sisi)) / 3;
				System.out.println("\nVolume Bola : " + String.format("%.1f", rumus));
			}else if(menuC == 8){
				System.out.println("Input Jari-jari Alas");
				sisi = in.nextDouble();
				System.out.println("Input Tinggi Kerucut");
				ting = in.nextDouble();
				rumus = (Math.PI * sisi * sisi * ting) /3;
				System.out.println("\nVolume Kerucut : " + String.format("%.1f", rumus));
			}else{
			System.out.println("\nMenu Tidak Ditemukan.");
			}
		}else{
			System.out.println("\nMenu Tidak Ditemukan.");
		}
	}
}