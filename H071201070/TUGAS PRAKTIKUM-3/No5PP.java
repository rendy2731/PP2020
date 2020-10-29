import java.util.Scanner;
public class No5PP {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("|  Silahkan menginput nilai derajat  |");
        System.out.println("--------------------------------------");
        
        while(inputan.hasNextFloat()){    
            float derajat = inputan.nextFloat();
            int jam=6,menit=0;
            int detik = (int)((derajat*86400)/360);

            while (derajat<0) {
                System.out.println("Nilai derajat tidak sesuai dengan syarat soal, silahkan menginput nilai kembali...");
                derajat = inputan.nextFloat();
            }
            while (derajat>360) {
                System.out.println("Nilai derajat tidak sesuai dengan syarat soal, silahkan menginput nilai kembali...");
                derajat = inputan.nextFloat();   
            }

            while(detik>=3600){
                detik-=3600;
                jam++;
            }
            while(detik>=60){
                detik-=60;
                menit++;
            }
            jam%=24;

            if(jam>=18){
                System.out.println("Selamat Malam");
            }
            else if(jam>=14){
                System.out.println("Selamat Sore");
            }
            else if(jam>=10){
                System.out.println("Selamat Siang");
            }
            else{
                System.out.println("Selamat Pagi");
            }
            System.out.printf("%02d:%02d:%02d",jam,menit,detik);
        }

    }
}
