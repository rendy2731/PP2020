import java.util.Scanner;

/**
 * Soal1praktikum
 */
public class Soal1praktikum {

    public static void main(String[] args) {
        Scanner aqila = new Scanner (System.in);
        int x = aqila.nextInt();
        int y = aqila.nextInt();

        if (x<y){
        for(int i=x ; i<=y ; i++){
            if (i%2==0){
                if (i>=0 && i!=0){
                    System.out.println(i+" bilangan genap postitif ");
                }else if  (i<0 && i!=0){
                    System.out.println(i+" bilangan genap negatif ");
                }
            }else{
                if (i>0 && i!=0){
                    System.out.println(i+" bilangan ganjil postitif ");
                }if (i<0 && i!=0){
                    System.out.println(i+" bilangan ganjil negatif ");
                } 
            }if (i==0){
                System.out.println(i+" bilangan nol ");
            }
        }
        }if (x>y){
            for(int i=y ; i<=x ; i++){
                if (i%2==0){
                    if (i>=0 && i!=0){
                        System.out.println(i+" bilangan genap postitif ");
                    }else if (i<0 && i!=0){
                        System.out.println(i+" bilangan genap negatif ");
                    }
                }else{
                    if (i>0 && i!=0){
                        System.out.println(i+" bilangan ganjil postitif ");
                    }else if (i<0 && i!=0){
                        System.out.println(i+" bilangan ganjil negatif ");
                    } 
                }if (i==0){
                    System.out.println(i+" bilangan nol ");
                }
            }

        }
    }
}