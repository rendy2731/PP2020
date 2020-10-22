import java.util.Scanner;
class nomor1 {
    public static void main(String[] args) {
        Scanner ang = new Scanner (System.in);
        try{
            int genap = 0;
            int ganjil = 0;
            int positif = 0;
            int negatif = 0;
            int a = ang.nextInt();
            int b = ang.nextInt();
            int c = ang.nextInt();
            int d = ang.nextInt();
            int e = ang.nextInt();

            if (a % 2 == 0){
                genap+=1;
                if (a < 0 && a !=0){
                    negatif+=1;
                } else if (a >= 0 && a != 0){
                    positif+=1;
                } 
            } else if(a % 2 == 1) {
                ganjil+=1;
                if (a < 0 && a !=0){
                    negatif+=1;
                } else if (a >= 0 && a != 0){
                    positif+=1;
                }
            } 
            if (b % 2 == 0){
                genap+=1;
                if (b < 0 && b !=0){
                    negatif+=1;
                } else if (b >= 0 && b != 0){
                    positif+=1;
                } 
            } else if(b % 2 == 1) {
                ganjil+=1;
                if (b < 0 && b !=0){
                    negatif+=1;
                } else if (b >= 0 && b != 0){
                    positif+=1;
                } 
            }  
            if (c % 2 == 0){
                genap+=1;
                if (c < 0 && c !=0){
                    negatif+=1;
                } else if (c >= 0 && c != 0){
                    positif+=1;
                } 
            } else if (c % 2 ==1) {
                ganjil+=1;
                if (c < 0 && c !=0){
                    negatif+=1;
                } else if (c >= 0 && c != 0){
                    positif+=1;
                } 
            } 
    
            if (d % 2 == 0){
                genap+=1;
                if (d < 0 && d !=0){
                    negatif+=1;
                } else if (d >= 0 && d != 0){
                    positif+=1;
                } 
            } else if (d % 2 == 1){
                ganjil+=1;
                if (d < 0 && d !=0){
                    negatif+=1;
                } else if (d >= 0 && d != 0){
                    positif+=1;
                } 
            } 
    
            if (e % 2 == 0){
                genap+=1;
                if (e < 0 && e !=0){
                    negatif+=1;
                } else if (e >= 0 && e != 0){
                    positif+=1;
                } 
            } else if(e % 2 ==1) {
                ganjil+=1;
                if (e < 0 && e !=0){
                    negatif+=1;
                } else if (e >= 0 && e != 0){
                    positif+=1;
                } 
            }
            System.out.println(genap + " angka genap");
            System.out.println(ganjil + " angka ganjil");
            System.out.println(positif + " angka positif");
            System.out.println(negatif + " angka negatif");
      
        } catch(Exception er){
            System.out.println("input tidak valid");
        }

      
            
        } 

        
       
     
        

    }
    

