import java.util.Scanner;

class Nomor01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();

            for(int y = scan.nextInt(); x<=y; x++){
                if (x<=0)
                {
                    if(x%2==0)
                        System.out.printf("%d genap ",x);
                    else
                        System.out.printf("%d ganjil ",x); 
                    if (x<0)
                        System.out.println("negatif");
                    else 
                        System.out.println("nol");           
                }
                else
                {
                    if(x%2==0)
                        System.out.printf("%d genap ",x);
                    else
                        System.out.printf("%d ganjil ",x);
                    System.out.println("positif");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Data yang dimasukkan harus bilangan bulat!");
        }
    }
}
