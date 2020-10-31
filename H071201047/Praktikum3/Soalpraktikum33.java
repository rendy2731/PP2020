import java.util.Scanner;

public class Soalpraktikum33 
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            long x=0,y=1,next;
            int n = scan.nextInt();
            System.out.print(x+" "+y);
            for(int count = 2; count<n; count++)
            {
                next = x+y;
                System.out.print(" "+next);
                x=y;
                y=next;
            }
        }
        catch(Exception e)
        {
            System.out.println("DATA HARUS BILANGAN BULAT");
        }
    }
}
