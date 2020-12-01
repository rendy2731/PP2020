import java.util.Scanner;

class No01 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("|------------------------------------------|");
        System.out.println("  Masukkan rentang elemen beserta elemennya ");
        System.out.println("|------------------------------------------|");
        int n = inputan.nextInt();
        int elemen[] = new int[n];
        int count1;
        int count2;
        int r;
        for (int i = 0; i < n; i++) {
            elemen[i] = inputan.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                int a = elemen[i];
                int b = elemen[j];
                if (a > b) {
                    count1 = a;
                    count2 = b;
                    r = count1 % count2;
                    while (r != 0) {
                        count1 = count2;
                        count2 = r;
                        r = count2 % count1;
                    }
                } else {
                    count1 = b;
                    count2 = a;
                    r = count1 % count2;
                    while (r != 0) {
                        count1 = count2;
                        count2 = r;
                        r = count1 % count2;
                    }
                    
                    if (count2 == 1) {
                        System.out.print(elemen[i] + " " + elemen[j]);
                        System.out.println();
                    }
                }
            }
        }
    }
}