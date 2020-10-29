import java.util.Scanner;
public class No1Praktikum3{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nilai Awal");
        int x = input.nextInt();
        System.out.println("Masukkan Nilai Akhir");
        int y = input.nextInt();
            input.close();
        
        if(x<y){
            while (x<=y){
                if (x==0){
                    System.out.printf("%d adalah nol\n", x);
                }else if(x%2==0){
                    if (x<0){
                        System.out.printf("%d adalah bilangan genap dan negatif\n", x);
                    }else {
                        System.out.printf("%d adalah bilangan genap dan positif\n", x);
                    }
                }else{
                    if (x<0){
                        System.out.printf("%d adalah bilangan ganjil dan negatif\n", x);
                    }else {
                        System.out.printf("%d adalah bilangan ganjil dan positif\n", x);
                    }
                }
                x++;
            }

        }else{
            while (x>=y){
                if (x==0){
                    System.out.printf("%d adalah nol\n", x);
                }else if(x%2==0){
                    if (x<0){
                        System.out.printf("%d adalah bilangan genap dan negatif\n", x);
                    }else {
                        System.out.printf("%d adalah bilangan genap dan positif\n", x);
                    }
                }else{
                    if (x<0){
                        System.out.printf("%d adalah bilangan ganjil dan negatif\n", x);
                    }else {
                        System.out.printf("%d adalah bilangan ganjil dan positif\n", x);
                    }
                }
                x--;
            }
        }
    }
}