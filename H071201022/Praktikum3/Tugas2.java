import java.util.Scanner;

class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai X :");
        int x = input.nextInt();
        System.out.println("Masukkan nilai Y :");
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
            System.out.println("Masukkan inputan dimana nilai X < Y.");
        }
    }
}