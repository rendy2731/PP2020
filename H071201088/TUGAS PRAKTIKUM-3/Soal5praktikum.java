import java.util.Scanner;

public class Soal5praktikum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai =");
        while (userInput.hasNextFloat()){
            float derajat = userInput.nextFloat();

            if (0<=derajat && derajat < 360){
          
            // second = (derajat yang diinput/total derajat) * (1 hari dalam jam * 1 jam dalam detik)
             int second = Math.round((derajat / 360) * (24 * 3600)); // math round pembulatan ke terdekatan
            // System.out.println(second);

            int minute = 0, hour = 0, i = 0, j = 0;
        
             for (i = second; i >= 3600; i -= 3600) {
            hour++;
            }

            for (j = i; j >= 60; j -= 60) {
            minute++;
            }

             hour = (hour + 6) % 24;

             if (hour >= 6 && hour < 12) {
                System.out.print("Selamat Pagi");
             } else if (hour >= 12 && hour < 15) {
                System.out.print("Selamat Siang");
            } else if (hour >= 15 && hour < 18) {
                System.out.print("Selamat Sore");
            } else {
                System.out.print("Selamat Malam");
            }

             System.out.printf("\n%02d:%02d:%02d\n", hour, minute, j);
        
            }else  {
             System.out.println(" maaf inputan yang anda masukkan tidak terdeteksi");}
    
              
        }
         
    
          userInput.close();
     }

}