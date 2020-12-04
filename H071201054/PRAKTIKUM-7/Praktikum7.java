import java.util.Scanner;
import java.util.ArrayList;

public class Praktikum7 {
    public static void main(String[] args){
        Praktikum7 scan = new Praktikum7();
        scan.inputan();
    }
        Scanner user = new Scanner(System.in);
        ArrayList<String> JudulFilm = new ArrayList<String>();
        ArrayList<String> Rilis = new ArrayList<String>();
        ArrayList<String> Durasi = new ArrayList<String>();
        ArrayList<String> Genre = new ArrayList<String>();
        ArrayList<String> Sinopsis = new ArrayList<String>();
        ArrayList<String> Cast = new ArrayList<String>();

    public void deleteFilm(int film){
        System.out.println();
        JudulFilm.remove(film);
        Rilis.remove(film);
        Durasi.remove(film);
        Genre.remove(film);
        Sinopsis.remove(film);
        Cast.remove(film); 
        }
    public void addFilm(){
        String userString;
        System.out.println();
        System.out.println("Judul : ");
        String judul = new String(user.nextLine());
        JudulFilm.add(judul);

        System.out.println("Rilis : ");
        userString = user.nextLine();
        Rilis.add(userString);

        System.out.println("Durasi : ");
        userString = user.nextLine();
        Durasi.add(userString);

        System.out.println("Genre : ");
        userString = user.nextLine();
        Genre.add(userString);

        System.out.println("Sinposis : ");
        userString = user.nextLine();
        Sinopsis.add(userString);

        System.out.println("Cast : ");
        userString = user.nextLine();
        Cast.add(userString);
    }
    public void searchfilm(String f){
        boolean yes = false;
        System.out.println();
        for (int i = 0; i < Rilis.size(); i++){
            if (JudulFilm.get(i).indexOf(f) >= 0){
                System.out.println(JudulFilm.get(i));
                yes = true;
                break;
            }
        } if (yes == false)
            System.out.println("tidak valid");
    }
    public void show_deskripsi_film(int desk){
        System.out.println();
        System.out.println("Judul : " + JudulFilm.get(desk));
        System.out.println("Rilis : " + Rilis.get(desk));
        System.out.println("Durasi : " + Durasi.get(desk));
        System.out.println("Genre : " + Genre.get(desk));
        System.out.println("Sinopsis : " + Sinopsis.get(desk));
        System.out.println("Cast : " + Cast.get(desk));
    }
    public void inputan(){
        while (true){
            String input = "";
            System.out.println();
            System.out.println("Favorite Movie");
            
            if (JudulFilm.isEmpty()){
                System.out.println("belum ada film yang terdaftar");
                System.out.println();
            }
            for (int i = 0; i < JudulFilm.size(); i++){
                System.out.println(i + 1 + ". " + JudulFilm.get(i));
            }
            System.out.println("d(detail) s(search) a(add) r(remove)");
            System.out.println(">");
            input = user.nextLine();

            if(input.length() > 2 && input.substring(0,2).equalsIgnoreCase("s ")){
                searchfilm(input.substring(2));
            } else if (input.length() > 2 && input.substring(0,2).equalsIgnoreCase("d ") && Character.isDigit(input.charAt(2))){
                show_deskripsi_film(Character.getNumericValue(input.charAt(2)-1));
            } else if(input.length() > 2 && input.substring(0,2).equalsIgnoreCase("r ") && Character.isDigit(input.charAt(2))){
                deleteFilm(Character.getNumericValue(input.charAt(2)-1));
            } else if(input.length() == 1 && input.charAt(0) == 'a'){
                addFilm();
            } else{
                return;
            }
        }
    }
}
    



