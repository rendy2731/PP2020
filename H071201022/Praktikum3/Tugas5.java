import java.util.Scanner;

class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float M;

        while (input.hasNext()) {
            M = input.nextFloat();
            if(M>=0 && M <360){
                int hour = 0, minute = 0, second = 0;
                int dSementara = (int) (M * 240);
                
                hour = dSementara/3600;
                minute = dSementara%3600/60;
                second = dSementara%60;
                hour += 6;
                System.out.println();

                if (hour>=24) {
                    hour -= 24;
                }
                if (hour<11) {
                    System.out.println("Selamat pagi");
                    System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
                }
                else if (hour<15) {
                    System.out.println("Selamat siang");
                    System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
                }
                else if (hour<7) {
                    System.out.println("Selamat sore");
                    System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
                }
                else {
                    System.out.println("Selamat malam");
                    System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
                }
            } else
                System.out.println("MASUKKAN NILAI 0 <= M < 360.");
            }
    }    
}