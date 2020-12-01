import java.util.Scanner;
public class Praktikumno1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int bilangan1 = user.nextInt();
        int bilangan2 = user.nextInt();
       
        cariFPB(bilangan1, bilangan2);
        
    }
    static void cariFPB(int bil1, int bil2){
        int a, b, hasil;
        a = bil2;
        b = bil1;
        
        if (bil1 > bil2){
            a = bil1;
            b = bil2;
        } for (int i = b; i > 0; i--){
            if (b % i == 0 && a % i == 0){
                hasil = i;
                System.out.println("FPB dari " + bil1 + " dan " + bil2 + " = " + hasil);
                break;
            }
        }
            
    }
}


