import java.util.Scanner;

    
    class Soal2PPcoba{
        public static void main(String[] args) {
            Scanner inputan = new Scanner(System.in);
            System.out.print("Masukkan nilai detik : ");
            int X = inputan.nextInt();
            int J = X/3600;
            int M = (X%3600)/60;
            int D = ((X%3600)%60);  
        System.out.printf("%02d:%02d:%02d",J,M,D);
       
    }
}
            
     
