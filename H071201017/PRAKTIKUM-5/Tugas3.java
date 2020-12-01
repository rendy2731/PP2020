/*
 * @author User
 */
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner zoro = new Scanner(System.in);
        int usia = zoro.nextInt();
        
        System.out.println(myDay(usia));
    } 
    public static String myDay(int usia) {
        int tahun, bulan, hari;
        
        tahun = usia / 365;
        usia = usia % 365;
        bulan = usia / 30;
        hari = usia % 30;
        
        return tahun + " tahun \n" + bulan + " bulan \n" + hari + " hari \n";
    }
    
}
