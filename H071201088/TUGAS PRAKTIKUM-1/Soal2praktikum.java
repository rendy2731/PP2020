import java.util.Scanner;
class Soal2praktikum{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total detik = ");
        int detik1  = input.nextInt();
        int jam,jam1,menit,menit1,detik;
        jam=detik1/3600;
        jam1=detik1%3600;
        menit=jam1/60;
        menit1=detik1%60;
        detik=menit1;


        System.out.printf("%02d:%02d:%02d",jam,menit,detik);
        
      
    }

}
