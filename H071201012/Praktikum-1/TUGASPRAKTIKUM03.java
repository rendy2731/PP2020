import java.util.Scanner;
public class TUGASPRAKTIKUM03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int h, a, b;
        double j1, j2, p;

        System.out.println("================================");
        System.out.println("Masukkan tinggi menara :");
        h = input.nextInt();
        System.out.println("Masukkan nilai sudut elevasi belakang kapal :");
        a = input.nextInt();
        System.out.println("Masukkan nilai sudut elevasi depan kapal :");
        b= input.nextInt();

        j1 = Math.tan(Math.toRadians(a))*h;      
        j2 = Math.tan(Math.toRadians(b))*h;      
        
        p = j1 - j2;

        if (90 > a && a > b){           
                                        
            System.out.printf("Panjang kapal : %.1f meter \n", p);
        }
        else {
            System.out.println("Data yang dimasukkan salah");
        }
        System.out.println("================================");
    }
}
