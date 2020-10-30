import java.util.Scanner;
public class Nomor3 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int n = inputan.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;
        System.out.print(a+ " ");
        System.out.print(b);
        inputan.close();

        for (int count = 2; count < n; count++) {
            
            next  = a + b;
            a = b;
            b = next ;
            System.out.print(" "+next );
        }
    }
}
