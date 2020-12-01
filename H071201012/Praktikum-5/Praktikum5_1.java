import java.util.Scanner;

public class Praktikum5_1 {
    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        int angka1 = obj.nextInt();
        int angka2 = obj.nextInt();
        obj.close();

        System.out.println("FPB dari angka " + angka1 + " dan " + angka2 +" = " + cariFPB(angka1,angka2));
    
    }
    public static int cariFPB(int angka1, int angka2 ){
    if (angka2 == 0)
    return angka1;
    else 
    return cariFPB(angka2, angka1 % angka2);
    }
}
