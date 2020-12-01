import java.util.Scanner;
public class No2Praktikum3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan banyak jumlah deret perbaris yang diinginkan");
        int x = input.nextInt();
        System.out.println("Masukkan banyak angka yang ingin dicetak");
        int y = input.nextInt();
        int count = 0;
            input.close();

            System.out.println("-----------------------------------");
        for (int i=1; i<=y; i++){

            for (int j=1; j<=x; j++){
                count++;
                System.out.print(count);
                System.out.print(" ");
            }
            System.out.println();
            
            if (count==y){
                break;
            }
        }
    }
}
