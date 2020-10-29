import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner ang = new Scanner(System.in);
        int n = ang.nextInt();
        int a = 0;
        int b = 1;
        int next;

        System.out.print(a);
        System.out.print(" " + b);

        for (int i = 2; i < n; i++){
            next = a + b;
            a = b;
            b = next;
            System.out.print(" " + next);
        }
    }

    
}
