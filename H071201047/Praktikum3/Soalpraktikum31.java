import java.util.Scanner;

public class Soalpraktikum31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();

            for(int i = x<=y? x:y; i<=(x<=y? y:x); i++){
                if (i<=0)
                {
                    if(i==0) 
                        System.out.printf("%d NOL\n",i); 
                    else if(i%2==0)
                        System.out.printf("%d GENAP NEGATIF\n",i);
                    else
                        System.out.printf("%d GANJIL NEGATIF\n",i); 
                }
                else
                {
                    if(i%2==0)
                        System.out.printf("%d GENAP POSITIF\n",i);
                    else
                        System.out.printf("%d GANJIL POSITIF\n",i);
                }
            }
        }
        catch (Exception e) {
            System.out.println("DATA YANG ANDA MASUKKAN ADALAH BILANGAN!");
        }
    }
}
