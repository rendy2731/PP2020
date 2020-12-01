import java.util.Scanner;
class Soalpraktikum21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e;
        int negatif=0;
        int positif=0;
        int ganjil=0;
        int genap=0;
        System.out.printf("MASUKKAN ANGKA :");
        try{
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            d = input.nextInt();
            e = input.nextInt();

            if (a<=0){
                if (a<0)
                    negatif++;
                if(a%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(a%2==0)
                    genap++;
                else
                    ganjil++;
            }
            if (b<=0){
                if (b<0)
                negatif++;
                if(b%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(b%2==0)
                    genap++;
                else
                    ganjil++;
            }
            if (c<=0){
                if (c<0)
                negatif++;
                if(c%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(c%2==0)
                    genap++;
                else
                    ganjil++;
            }
            if (d<=0){
                if (d<0)
                negatif++;
                if(d%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(d%2==0)
                    genap++;
                else
                    ganjil++;
            }
            if (e<=0){
                if (e<0)
                negatif++;
                if(e%2==0)
                    genap++;
                else
                    ganjil++;            
            }
            else
            {
                positif++;
                if(e%2==0)
                    genap++;
                else
                    ganjil++;
            }
            
            System.out.printf("ANGKA BILANGAN GENAP = %d \n",genap);
            System.out.printf("ANGKA BILANGAN GANJIL = %d \n",ganjil);
            System.out.printf("ANGKA BILANGAN POSITIF = %d \n",positif);
            System.out.printf("ANGKA BILANGAN NEGATIF = %d \n",negatif);
        }          
        catch (Exception er) {
            System.out.println("INPUTAN SALAH ATAU TIDAK VALID");
        }
    }
}
