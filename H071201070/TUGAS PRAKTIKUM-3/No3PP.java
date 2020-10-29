import java.util.Scanner;
public class No3PP {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------");
        System.out.println("|  Silahkan menginput rentang fibonacci yang anda inginkan  |");
        System.out.println("-------------------------------------------------------------");
        int num = inputan.nextInt();
        int nA = 0;
        int nB = 1;
        int tot = 0;
    for(int i = 1; i <= num; i++){
        System.out.print(tot + " ");
        tot = nA+nB;
        nA = nB;
        nB = tot;
    }
    }
}
