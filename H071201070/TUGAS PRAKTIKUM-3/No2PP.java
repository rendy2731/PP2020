import java.util.Scanner;
public class No2PP {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("|  Silahkan menginput nilai x dan nilai y  |");
        System.out.println("--------------------------------------------");
        int x = inputan.nextInt();
        int y = inputan.nextInt();
        System.out.println("-----");
        int i=1;

        while (i<=y){
            if(i%x==0){
                System.out.println(i + " ");
                i++;
            }else{
                System.out.print(i + " ");
                i++;
            }
        }
    } 
}
