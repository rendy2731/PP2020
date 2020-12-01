import java.util.Scanner;
public class Tugas3 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan nilai n = ");
      int n = input.nextInt();
      int a = 0;
      int b = 1;
      int count = 2;
      System.out.print("Himpunan A = ");
      System.out.print(a);
      System.out.print(" " + b);
      
      for (int i = count; i < n; i++) {
        int next = a + b;
        System.out.print(" " + next);
        a = b;
        b = next;
        count = count + 1;
      }
  }
}