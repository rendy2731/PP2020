import java.util.Scanner;
public class No1PP{

    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("|  Silahkan menginput nilai awal dan nilai akhir yang anda inginkan  |");
        System.out.println("----------------------------------------------------------------------");
        int x = inputan.nextInt();
        int y = inputan.nextInt();
        System.out.println("----\n");
        System.out.println("Hasil/output:");
        if(x<y){
            do {
                if(x<0){
                    if(x%2==0){
                         System.out.println(x + " genap negatif");
                    }else{
                         System.out.println(x + " ganjil negatif");
                    }
                }else if (x>0){
                    if(x%2==0){
                        System.out.println(x + " genap postif");
                    }else{
                        System.out.println(x + " ganjil positif");
                    }
                }else{
                    System.out.println(x + " nol");
                }
              x++;
            }while(x<=y);
        } else {
            do {
                if(x<0){
                    if(x%2==0){
                        System.out.println(x + " genap negatif");
                    }else{
                        System.out.println(x + " ganjil negatif");
                    }
                }else if (x>0){
                    if(x%2==0){
                        System.out.println(x + " genap postif");
                    }else{
                        System.out.println(x + " ganjil positif");
                    }
                }else{
                    System.out.println(x + " nol");
                }
              x--;
            }while(x>=y);
        }
        
        

    }
}