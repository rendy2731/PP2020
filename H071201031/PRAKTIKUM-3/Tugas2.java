import java.util.Scanner;
class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai x [enter] nilai y");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x < y) {
            for(int i = 1; i<=y; i++) {
                if(i%x==0) {
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Masukkan inputan X < Y.");
        }
    }
}