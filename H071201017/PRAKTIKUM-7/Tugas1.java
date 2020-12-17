/**
 * @author Ummul Qura
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class Tugas1 {
    static List<String> movies;
    static Map<String, String> movieDetails;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        movies = new ArrayList<>();
        movieDetails = new HashMap<>();
        boolean execute = true;
        
        while(execute) {
            printMovies();
            choice();
            
            while(true) {
                System.out.print("Continue? (y/n) : ");
                String continueProgram = input.next();
                input.nextLine();
        
                if(continueProgram.equalsIgnoreCase("y")) {
                    execute = true;
                    break;
                }
                else if(continueProgram.equalsIgnoreCase("n")) {
                    execute = false;
                    break;
                }
                else {
                    System.out.println("Invalid Input!");
                }
            }
        }
        System.out.println("Bye!");
    }
    static void choice() {
        if(movies.size()==0) {
            System.out.println("No Data Available!");
        }
        System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
        System.out.print(">");
        String menuInput = input.nextLine();
        char menuChoice = menuInput.length()>0?menuInput.charAt(0):' ';
        String inputValue = "";
        
        if(menuInput.length()>=2) {
            inputValue = menuInput.substring(2,menuInput.length());
        }
        try{
            if(menuChoice == 'd' ||menuChoice == 'D') {
                if(number(inputValue) !=10) {
                    detail(number(inputValue));
                }
            }
            else if(menuChoice == 's' ||menuChoice == 'S') {
                search(inputValue);
            }
            else if(menuChoice == 'a' ||menuChoice == 'A') {
                add();
            }
            else if(menuChoice == 'r' ||menuChoice == 'R') {
                remove(number(inputValue));
            }
        }
        catch(Exception e) {
            System.out.println("Invalid Input!");
        }
    }
    static void printMovies() {
        System.out.println("Favourite Movies : ");
        
        for(int i = 0;i<movies.size();i++) {
            System.out.printf("%d. %s\n",i+1,movies.get(i));
        }
    }
    static void detail(int movie) {
        try{
            System.out.println(movieDetails.get(movies.get(movie-1)));
        }
        catch(Exception e) {
            System.out.println("Index doesn't exist!");
        }
    }
    static void search(String movie) {
        if(movieDetails.get(movie) != null) {
            System.out.println(movieDetails.get(movie));
        }
        else{
            System.out.println("Movie doesn't exist!");
        }
    }
    static void add() {
        String[] details = {"Judul\t\t\t: ","Rilis\t\t\t: ","Durasi\t\t\t: ","Genre\t\t\t: ","Sinopsis\t\t: ","Cast\t\t\t: "};
        String output = "";
        String movie ="";
    
        for(int i =0;i<details.length;i++) {
            System.out.print(details[i]);
            
            if(i==0) {
                movie = input.nextLine();
                movies.add(movie);
                output += details[i]+ movie +"\n";
                continue;
            }
            output += details[i]+ input.nextLine();
            
            if(i<details.length-1) {
                output += "\n";
            }
        }
        movieDetails.put(movie,output);
    }
    static void remove(int index) {
        try{
            movieDetails.remove(movies.get(index-1));
            movies.remove(index-1);
        }
        catch(Exception e) {
            System.out.println("Index doesn't exist!");
        }
    }
    static int number(String numberInString) {
        try{
           return Integer.valueOf(numberInString);
        }
        catch(Exception e) {
            return -1;
        }
    }
}