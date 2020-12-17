import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class No01{
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        cek(inputan);
    }
    
    public static void add(HashMap<String, ArrayList<String>> mainMenu, Scanner input2) {
        input2.nextLine();

        System.out.println("Judul:"); 
            String judul = input2.nextLine();
                mainMenu.get("Judul").add(judul);
        System.out.println("Rilis:"); 
            String rilis = input2.nextLine(); 
                mainMenu.get("Rilis").add(rilis);
        System.out.println("Durasi:"); 
            String durasi = input2.nextLine();
                mainMenu.get("Durasi").add(durasi);
        System.out.println("Genre:"); 
            String genre = input2.nextLine();
                mainMenu.get("Genre").add(genre);
        System.out.println("Sinopsis:"); 
            String sinopsis = input2.nextLine();
                mainMenu.get("Sinopsis").add(sinopsis);
        System.out.println("Cast:"); 
            String cast = input2.nextLine();
                mainMenu.get("Cast").add(cast);
    }

    public static void daftar(HashMap<String, ArrayList<String>> mainMenu){
        ArrayList<String> judul = mainMenu.get("Judul");
        System.out.println("Favourite Movie");
        if(judul.isEmpty()){
            System.out.println("Main menu is empty");
        }
        for(int i = 0; i < judul.size(); i++){
            System.out.println(i + 1 +". "+ judul.get(i));
        }
    }

    public static void detail(HashMap<String, ArrayList<String>> mainMenu, int num) {
        System.out.println("Judul: " + mainMenu.get("Judul").get(num));
        System.out.println("Rilis: " + mainMenu.get("Rilis").get(num));
        System.out.println("Durasi: " + mainMenu.get("Durasi").get(num));
        System.out.println("Genre: " + mainMenu.get("Genre").get(num));
        System.out.println("Sinopsis: " + mainMenu.get("Sinopsis").get(num));
        System.out.println("Cast: " + mainMenu.get("Cast").get(num));
    }

    public static void remove(int deleting, HashMap<String, ArrayList<String>> mainMenu){
        mainMenu.get("Judul").remove(deleting);
        mainMenu.get("Rilis").remove(deleting);
        mainMenu.get("Durasi").remove(deleting);
        mainMenu.get("Genre").remove(deleting);
        mainMenu.get("Sinopsis").remove(deleting);
        mainMenu.get("Cast").remove(deleting);
    }
    public static String search(String input2, HashMap<String, ArrayList<String>> mainMenu){
        ArrayList<String> judul = mainMenu.get("Judul");
        String result = "hasil("+ input2 +")\n";
        for (int i = 0; i < judul.size(); i++) {
            String movie = judul.get(i);
            for (int j = 0; j < movie.length(); j++) {
                if(j+input2.length() <= movie.length()){
                    if(input2.equalsIgnoreCase(movie.substring(j,j+input2.length()))){
                        result += String.format(i+1 + "." + movie + "\n");
                        break;
                    }
                }else{
                    continue;
                }
            }
        }return result;
    }

    public static void cek(Scanner inputan) {
        HashMap<String, ArrayList<String>> mainMenu = new HashMap<>();
        mainMenu.put("Judul", new ArrayList<>());
        mainMenu.put("Rilis", new ArrayList<>());
        mainMenu.put("Durasi", new ArrayList<>());
        mainMenu.put("Genre", new ArrayList<>());
        mainMenu.put("Sinopsis", new ArrayList<>());
        mainMenu.put("Cast", new ArrayList<>());
        
        String cek = "Ya";
        while(cek.equalsIgnoreCase("Ya")){
            daftar(mainMenu);
            System.out.println("(d) detail (s) search (a) add (r) remove");
            String input = inputan.next();
        if(input.equalsIgnoreCase("d")){
            int num = inputan.nextInt() - 1;
            detail(mainMenu, num);
            System.out.println("lanjutkan? (Ya/No)");
            cek = inputan.next();
        }else if(input.equalsIgnoreCase("a")){
            add(mainMenu,inputan);
            daftar(mainMenu);
            System.out.println("lanjutkan? (Ya/No)");
            cek = inputan.next();
        }else if(input.equalsIgnoreCase("r")){
            int deleting = inputan.nextInt() - 1;
            remove(deleting, mainMenu);
            daftar(mainMenu);
            System.out.println("lanjutkan? (Ya/No)");
            cek = inputan.next();
        }else if(input.equalsIgnoreCase("s")){
            String input2 = inputan.next();
            System.out.printf(search(input2,mainMenu));
            System.out.println("lanjutkan? (Ya/No) ");
            cek = inputan.next();
        }else{
            System.out.println("Berhenti? (Ya/No)");
            cek = inputan.next();
        }
      }  
    }    
}