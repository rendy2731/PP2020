import java.util.Scanner;

public class   Soalpraktikum34
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            int seratusribu=0,limapuluhribu=0,duapuluhribu=0,sepuluhribu=0,limaribu=0,duaRibu=0,seribu=0;
            int harga = scan.nextInt();
            int uang = scan.nextInt();
            if (harga<=uang)
            {
                int kembalian = uang-harga;
                while(kembalian > 0)
                {
                    if(kembalian-100000>=0)
                    {
                        kembalian -= 100000;
                        seratusribu++;
                    }
                    else if(kembalian-50000>=0)
                    {
                        kembalian -= 50000;
                        limapuluhribu++;
                    }
                    else if(kembalian-20000>=0)
                    {
                        kembalian -= 20000;
                        duapuluhribu++;
                    }
                    else if(kembalian-10000>=0)
                    {
                        kembalian -= 10000;
                        sepuluhribu++;
                    }
                    else if(kembalian-5000>=0)
                    {
                        kembalian -= 5000;
                        limaribu++;
                    }
                    else if(kembalian-2000>=0)
                    {
                        kembalian -= 2000;
                        duaRibu++;
                    }
                    else
                    {
                        kembalian -= 1000;
                        if(kembalian==0)
                            seribu++;
                    }
                }
                System.out.println(seratusribu+" UANG Rp.100.000");
                System.out.println(limapuluhribu+" UANG Rp.50.000");
                System.out.println(duapuluhribu+" UANG Rp.20.000");
                System.out.println(sepuluhribu+" UANG Rp.10.000");
                System.out.println(limaribu+" UANG Rp.5.000");
                System.out.println(duaRibu+" UANG Rp.2.000");
                System.out.println(seribu+" UANG Rp.1.000");
            }
            else
                System.out.println("UANG ANDA TIDAK CUKUP UNTUK MEMBAYAR");
        }
        catch(Exception e)
        {
            System.out.println("MASUKKAN DATA YANG BENAR");
        }
    }
    
}
