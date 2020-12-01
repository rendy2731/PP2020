import java.util.Scanner;
public class No4PP {
    
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
            System.out.println("------------------------------------");
            System.out.println("|  Masukkan total harga belanjaan  |");
            System.out.println("------------------------------------");
            int hb = inputan.nextInt();
            System.out.println("----------------------------------------");
            System.out.println("|  Masukkan nilai uang yang dibayarkan |");
            System.out.println("----------------------------------------");
            int ub = inputan.nextInt();
            int sisa = ub-hb;
            int totalA=0,totalB=0,totalC=0,totalD=0,totalE=0,totalF=0,totalG=0;

                do{
                    if (sisa>=100000){
                        sisa-=100000;
                        totalA++;
                    } else if (sisa>=50000) {
                                sisa-=50000;
                        totalB++;
                    } else if (sisa>=20000){
                        sisa-=20000;
                        totalC++;
                    } else if (sisa>=10000) {
                        sisa-=10000;
                        totalD++;
                    } else if (sisa>=5000){
                        sisa-=5000;
                        totalE++;
                    } else if (sisa>=2000) {
                        sisa-=2000;
                        totalF++;
                    } else {
                        sisa-=1000;
                        totalG++;
                    }
                }while (sisa>0);

            System.out.println(totalA + " uang Rp. 100.000");
            System.out.println(totalB + " uang Rp. 50.000");
            System.out.println(totalC + " uang Rp. 20.000");
            System.out.println(totalD + " uang Rp. 10.000");
            System.out.println(totalE + " uang Rp. 5.000");
            System.out.println(totalF + " uang Rp. 2.000");
            System.out.println(totalG + " uang Rp. 1.000");
        }
    }


