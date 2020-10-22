import java.util.Scanner;
class SoalPraktikum1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try{
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;
        
        if (a>0){
            if ((a%2==0)){
                genap += 1;
                positif += 1;
            }
            else {
                ganjil+=1;
                positif+=1;
            }
        }
        else if (a<0) {
            if ((a%2==0)){
                genap+=1;
                negatif+=1;
                }
            else {
                ganjil+=1;
                negatif+=1;
            }
        } 
        else {genap+=1;}
        if (b>0){
            if ((b%2==0)){
                genap += 1;
                positif += 1;
            }
            else {
                ganjil+=1;
                positif+=1;
            }
        }
        else if (b<0) {
            if ((b%2==0)){
                genap+=1;
                negatif+=1;
                }
            else {
                ganjil+=1;
                negatif+=1;
            }
        } 
        else {genap+=1;}
        if (c>0){
            if ((c%2==0)){
                genap += 1;
                positif += 1;
            }
            else {
                ganjil+=1;
                positif+=1;
            }
        }
        else if (c<0) {
            if ((c%2==0)){
                genap+=1;
                negatif+=1;
                }
            else {
                ganjil+=1;
                negatif+=1;
            }
        } 
        else {genap+=1;}
        if (d>0){
            if ((d%2==0)){
                genap += 1;
                positif += 1;
            }
            else {
                ganjil+=1;
                positif+=1;
            }
        }
        else if (d<0) {
            if ((d%2==0)){
                genap+=1;
                negatif+=1;
                }
            else {
                ganjil+=1;
                negatif+=1;
            }
        } 
        else {genap+=1;}
        if (e>0){
            if ((e%2==0)){
                genap += 1;
                positif += 1;
            }
            else {
                ganjil+=1;
                positif+=1;
            }
        }
        else if (e<0) {
            if ((e%2==0)){
                genap+=1;
                negatif+=1;
                }
            else {
                ganjil+=1;
                negatif+=1;
            }
        } 
        else {genap+=1;}
    System.out.println(genap + " Angka Genap");
    System.out.println(ganjil + " Angka Ganjil");
    System.out.println(positif + " Angka Positif");
    System.out.println(negatif + " Angka Negatif");
    }
    catch (Exception exception) {
        System.out.println("Tidak Valid");
        }
    }
}
