import java.util.Scanner;

public class TP6_Nomor2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String teks = scan.nextLine();
        if(teks.length()>=16){

            String teksBaru = new String();

            for (int i = 0; i<teks.length(); i++){
                if (i%2==1)
                    teksBaru += Character.codePointAt(teks, i);
                else
                    teksBaru += teks.charAt(i);
            }
            for(float i=teksBaru.length();i/4f%4f!=0;i++){
                teksBaru +="?";
            }
            int jumlah = teksBaru.length()/4/4;
            int x=1;
            for (int i=1;i<=teksBaru.length();i++){
                if(i%jumlah==0 && x%4!=0){
                    System.out.print(teksBaru.charAt(i-1)+" ");
                    x++;
                }
                else if(i%jumlah!=0){
                    System.out.print(teksBaru.charAt(i-1));
                }
                else{
                    System.out.println(teksBaru.charAt(i-1));
                    x=1;
                }
            }
        }
    }
}