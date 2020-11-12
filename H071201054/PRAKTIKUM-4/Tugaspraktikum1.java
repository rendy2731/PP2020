import java.util.Scanner;
public class Tugaspraktikum1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int n = user.nextInt();
        int[] array = new int[n];
        int x = n-1;
        
        for (int i = 0; i < n; i++){
            array[i] = user.nextInt();
        }
        for (int i = 0; i < x; i++){
            for (int j = i; j < n; j++){
                int a = array[i];
                int b = array[j];
                int p;
                int q;
                int r;
                if (a < b){
                    p = b;
                    q = a;
                    r = p%q;
                } else{
                    p = a;
                    q = b;
                    r = p%q;
                } while (r != 0){
                    p = q;
                    q = r;
                    r = p%q;
                } if (q == 1){
                    System.out.println(array[i] + " " + array[j]);
                } 

            }
        }
        
    }           
}

        


   

