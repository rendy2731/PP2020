import java.util.Scanner;
public class Tugas5 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int menit = 0;
        int jam = 0;
        int i = 0;
        int j = 0;
        jam = (jam + 6) % 24;
    
        while (user.hasNextFloat()){

            float m = user.nextFloat();

            int detik = Math.round(( m / 360)*(24*3600));
           
            if (0 <= m && m < 360){
                for (i = detik; i >= 3600; i -= 3600){
                    jam++;
                } for (j = i; j >=60; j -= 60){
                    menit++;
                } 
            
                if (jam >= 6 && jam < 12){
                    System.out.print("Selamat pagi");
                } 
                else if (jam >= 15 && jam < 18){
                    System.out.print("Selamat sore");
                }
                else if (jam >= 12 && jam < 15){
                    System.out.print("Selamat siang");
                }
                else {
                    System.out.print("Selamat malam");
                }
                System.out.printf("\n%02d:%02d:%02d\n" , jam, menit, j);   
    
            } else {
                System.out.println("tidak valid");
            }

        }
            

    }
            
}

            

    

