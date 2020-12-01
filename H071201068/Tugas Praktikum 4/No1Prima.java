import java.util.Scanner;

public class No1Prima {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int banyakAngka = input.nextInt();
        int[] elemen = new int[banyakAngka];
        int a, b, fpb;

        for (int i = 0; i < elemen.length; i++){
            elemen [i] = input.nextInt();
        }
            input.close();

        for (int i = 0; i < elemen.length - 1; i ++){
            for (int j = i; j < elemen.length; j++){
                if (elemen [i] > elemen [j]){
                    a = elemen [i];
                    b = elemen [j];
                    fpb = a%b;

                    while (fpb != 0){
                        a = b;
                        b = fpb;
                        fpb = a%b;
                        if (b == 1){
                            System.out.printf("%d %d\n", elemen[i], elemen[j]);
                        }
                    }

                }else {
                    a = elemen [j];
                    b = elemen [i];
                    fpb = a%b;

                    while (fpb != 0){
                        a = b;
                        b = fpb;
                        fpb = a%b;
                        if (b == 1){
                            System.out.printf("%d %d\n", elemen[i], elemen[j]);
                        }
                    }
                }
            }
        }
    }
}
