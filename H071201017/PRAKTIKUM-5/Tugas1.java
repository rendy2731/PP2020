/*
 * @author Ummul
 */
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sasageyo = new Scanner(System.in);
        int a = sasageyo.nextInt();
        int b = sasageyo.nextInt();
        
        System.out.println( "FPB dari " + a + " dan " + b + " = " + cariFPB(a, b));
    }
    public static int cariFPB(int a, int b) {
        if (b == 0) 
            return a;
        
        else
            return cariFPB(b, a % b);
    }
}
