import java.util.Scanner;

    class Soal3PPcoba{
        public static void main(String[] args) {
            Scanner inputan = new Scanner(System.in);
            System.out.println("Masukkan nilai h :");
            int h = inputan.nextInt();
            System.out.println("Masukkan nilai a :");  
            int a = inputan.nextInt();
            while(a>90){
                System.out.println("Nilai a tidak memenuhi syarat soal. Silahkan menginput nilai kembali.");
                a = inputan.nextInt();
            }
            System.out.println("Masukkan nilai b :");
            int b = inputan.nextInt();
            while(b>a){
                System.out.println("Nilai b tidak memenuhi syarat soal. Silahkan menginput nilai kembali.");
                b = inputan.nextInt();
            }
            int y = 180-(90+b);
            double c = (h*Math.sin(Math.toRadians(b)))/(Math.sin(Math.toRadians(y)));
            int z = 180-(90+a);
            double x = (h-c*Math.tan(Math.toRadians(z)))/Math.tan(Math.toRadians(z));
            System.out.printf("%.1f" , x ); System.out.print(" m");
          
            }
        }
        
    