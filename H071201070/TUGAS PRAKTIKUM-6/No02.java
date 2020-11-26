import java.util.Scanner;
public class No02 {
    public static void main(String[] args) {
        System.out.println("|-----------------------------|");
        System.out.println("|  Silahkan masukkan kalimat  |");
        System.out.println("|-----------------------------|");
        Scanner inputan = new Scanner(System.in);
        String word = inputan.nextLine();
        int count = word.length();
        int num [] = new int [count];

        //mengubah string ke int
        //untuk character yang ganjil
        for ( int i = 0; i < count; i++) {
            num[i] = word.codePointAt(i);
        }

        //seleksi index genap dan ganjil
        char[]rentang = word.toCharArray();
        String result = "";
        for(int i = 0; i < count; i ++){
            if(i % 2 == 0){
                result += rentang[i];
            }
            else{
                int ubah = num[i];
                result += ubah;
            }
        }

        //penentuan jumlah karakter per elemen matriks
        char [] resultArray = result.toCharArray();
        int panjang = result.length();
        int panjangResult = (int) Math.ceil(result.length()/16.0);
        int sisa = (panjangResult*16)-panjang;
        int panjangsisa = panjang+sisa;

        for (int i = 0; i < sisa; i++) {
            result+='?';
        }
        
        //cetak matriks
        System.out.println("\n---------HASIL---------");
        char [] resultArray1 = result.toCharArray();  
        int a = 0;
        for (int i = 0; i < 4; i++) {//baris
            for (int j = 0; j < 4; j++) {//kolom
                for (int k = 0; k < panjangResult; k++) {//jumlah karakter/elemen
                    System.out.print(resultArray1[a]);
                    a++;       
                }
                System.out.print(" ");
            }
            System.out.println();
            
        }System.out.println();
    }
}  