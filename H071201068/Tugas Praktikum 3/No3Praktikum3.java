import java.util.Scanner;
public class No3Praktikum3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan banyaknya elemen dalam himpunan yang diinginkan");
        int n = input.nextInt();
            input.close();
        int a = 0;
        int b = 1;
        int count = 1;
        
        System.out.println("__________________________________");
        do{
            System.out.printf("%d ",a);
            int sum= a+b;
            a = b;
            b = sum;
            count++;
        }while (count<=n);
    }
}
