/*
 * @author Ummul
 */
import java.util.Scanner;
public class Tugas2 {
    public static void main (String[] args) {
        Scanner aot = new Scanner(System.in);
        String sentence = aot.nextLine();
        String newKalimat ="";
        
        for (int i = 0; i < sentence.length(); i++) {
            if (i % 2 == 0){
                newKalimat += (sentence.charAt(i));
            }
            else {
                newKalimat += (int)(sentence.charAt(i));
            }
        }
        int counter = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0;j < 4; j++) {
                for (int k = 0; k < Math.ceil((double)newKalimat.length()/16); k++) {
                    if (counter < newKalimat.length()) {
                        System.out.print(newKalimat.charAt(counter));
                        counter++;
                    }
                    else {
                        System.out.print("?");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
