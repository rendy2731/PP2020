import java.util.Scanner;
public class Soal3praktikum{
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

       // int count=0;

       System.out.printf("masukkan nilai n = ");
       int n = input.nextInt();
       int a =0;
       int b=1;
       int count=2;
       
       //int next=0;
      System.out.print(a+ " ");
      System.out.print(b);
      while(count<n){
          int  next= a+b;
            System.out.print(" "+next);
         
           a=b;
           b=next;
           count++;
       }
      // System.out.println(a);
      // System.out.println(b);

     //  System.out.println(next);
       
   
    }
}




