import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        try {
            int a, b, c, d, e;
            a = user.nextInt();
            b = user.nextInt();
            c = user.nextInt();
            d = user.nextInt();
            e = user.nextInt();

        // Hitungan banyaknya bilangan genap dan ganjil

        int genapA = 0;
        int genapB = 0;
        int genapC = 0;
        int genapD = 0;
        int genapE = 0;

        int ganjilA = 0;
        int ganjilB = 0;
        int ganjilC = 0;
        int ganjilD = 0;
        int ganjilE = 0;

        if(a % 2 == 0) {
            genapA = 1;
            ganjilA = 0;
        } else {
            genapA = 0;
            ganjilA = 1;
        } 

        if(b % 2 == 0) {
            genapB = 1;
            ganjilB = 0;
        } else {
            genapB = 0;
            ganjilB = 1;
        } 

        if(c % 2 == 0) {
            genapC = 1;
            ganjilC = 0;
        } else {
            genapC = 0;
            ganjilC = 1;
        } 

        if(d % 2 == 0) {
            genapD = 1;
            ganjilD = 0;
        } else {
            genapD = 0;
            ganjilD = 1;
        } 

        if(e % 2 == 0) {
            genapE = 1;
            ganjilE = 0;
        } else {
            genapE = 0;
            ganjilE = 1;
        } 

        int totalGenap = genapA + genapB + genapC + genapD + genapE;
        int totalGanjil = ganjilA + ganjilB + ganjilC + ganjilD + ganjilE;

        // Hitungan banyaknya bilangan positif dan negatif

        int PositifA = 0;
        int PositifB = 0;
        int PositifC = 0;
        int PositifD = 0;
        int PositifE = 0;

        int NegatifA = 0;
        int NegatifB = 0;
        int NegatifC = 0;
        int NegatifD = 0;
        int NegatifE = 0;

        if(a > 0) {
            PositifA = 1;
            NegatifA = 0;
        } else {
            if(a == 0) {
                PositifA = 0;
                NegatifA = 0;
            } else {
                PositifA = 0;
                NegatifA = 1;
            }
        } 

        if(b > 0) {
            PositifB = 1;
            NegatifB = 0;
        } else {
            if(b == 0) {
                PositifB = 0;
                NegatifB = 0;
            } else {
                PositifB = 0;
                NegatifB = 1;
            }
        } 

        if(c > 0) {
            PositifC = 1;
            NegatifC = 0;
        } else {
            if(c == 0) {
                PositifC = 0;
                NegatifC = 0;
            } else {
                PositifC = 0;
                NegatifC = 1;
            }
        } 

        if(d > 0) {
            PositifD = 1;
            NegatifD = 0;
        } else {
            if(d == 0) {
                PositifD = 0;
                NegatifD = 0;
            } else {
                PositifD = 0;
                NegatifD = 1;
            }
        } 

        if(e > 0) {
            PositifE = 1;
            NegatifE = 0;
        } else {
            if(e == 0) {
                PositifE = 0;
                NegatifE = 0;
            } else {
                PositifE = 0;
                NegatifE = 1;
            }
        } 

        int totalPositif = PositifA + PositifB + PositifC + PositifD + PositifE;
        int totalNegatif = NegatifA + NegatifB + NegatifC + NegatifD + NegatifE;

        System.out.println(totalGenap + " Angka Genap");
        System.out.println(totalGanjil + " Angka Ganjil");
        System.out.println(totalPositif + " Angka Positif");
        System.out.println(totalNegatif + " Angka Negatif");

    } catch(InputMismatchException ime) {
        System.out.println("Inputan Tidak Valid");    
    }finally {
        user.close();
    }

    }
}