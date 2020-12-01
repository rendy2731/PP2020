import java.util.Scanner;

public class Soal2praktikum {
    public static void main(String[] args) {
        Scanner aqila = new Scanner (System.in);
        int x = aqila.nextInt(); // 4
        int y = aqila.nextInt(); //100
        int a=1;
        
      for (int i=1; i<=y ; i++){ //setiap baris //5
            for (int j=1; j<=x ; j++){
            System.out.print(a+" ");
            a++;
            if (a>=y+1){
                return;
            }

                
           }
          
          
            System.out.println();
        }

    }
}
