import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class Tugas1 {
    static void printMov (HashMap<Integer, String> m) {
        for (Integer num : m.keySet()) {
           String key = num.toString();
           String val = m.get(num);
           System.out.println(key + ". " + val);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        HashMap<Integer, String> movies = new HashMap<> ();
        movies.put(1, "Avenger: Endgame");
        movies.put(2, "Spiderman: Far From Home");
        movies.put(3, "Venom");
        movies.put(4, "Thor: Ragnarok");

        Map<Integer, String> release = new HashMap<> ();
        release.put(1, "24 April 2019");
        release.put(2, "2 Juli 2019" );
        release.put(3, "5 Oktober 2018");
        release.put(4, "3 November 2017");

        Map<Integer, String> duration = new HashMap<>();
        duration.put(1, "3 Jam 1 Menit");
        duration.put(2, "2 Jam 9 Menit");
        duration.put(3, "1 Jam 52 Menit");
        duration.put(4, "2 Jam 10 Menit");

        Map<Integer, String> genre = new HashMap<>();
        genre.put(1, "Adventure, Sci-Fi, Action");
        genre.put(2, "Adventure, Sci-Fi, Action");
        genre.put(3, "Adventure, Sci-Fi, Action");
        genre.put(4, "Action, Adventure, Comedy");

        Map<Integer, String> synopsis = new HashMap<>();
        synopsis.put(1, "Ini adalah sinopsis");
        synopsis.put(2, "Ini adalah sinopsis");
        synopsis.put(3, "Ini adalah sinopsis");
        synopsis.put(4, "Ini adalah sinopsis");

        Map<Integer, String> cast = new HashMap<>();
        cast.put(1, "Robert Downey Jr., Chris Evan, Mark Ruffalo");
        cast.put(2, "Tom Holland, Samuel L. Jackson, Jake Gyllenhall");
        cast.put(3, "Tom Hardy, Michelle Williams, Riz Ahmed");
        cast.put(4, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");

        while (true) {
            printMov(movies);
            System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
            System.out.print("> ");
            String choice = input.next();

            //Detail
            if (choice.equals("d")) {
                int j = input.nextInt();
                String judul = movies.get(j);
                String rilis = release.get(j);
                String durasi = duration.get(j);
                String aliran = genre.get(j);
                String sinopsis = synopsis.get(j);
                String pemain = cast.get(j);

                System.out.println("Judul    : " + judul);
                System.out.println("Rilis    : " + rilis);
                System.out.println("Durasi   : " + durasi);
                System.out.println("Genre    : " + aliran);
                System.out.println("Sinopsis : " + sinopsis);
                System.out.println("Cast     : " + pemain);

            //Search
            } else if (choice.equals("s")) {
                String search = input.next();

                for (int i = 1;i <= movies.size() ;i++) {
                    if (movies.get(i).contains(search)) {
                        System.out.println("Hasil Pencarian : " + movies.get(i));
                        break;
                    } else {
                        System.out.println("Judul tidak ditemukan.");
                        break;
                    }
                }

            //Add
            } else if (choice.charAt(0) == 'a') {
                String judul = input.nextLine();
                judul = judul.substring(1);
                System.out.print("Judul    : " + judul);

                System.out.print("\nRilis    : ");
                String rilis = input.nextLine();

                System.out.print("Durasi   : ");
                String durasi = input.nextLine();

                System.out.print("Genre    : ");
                String aliran = input.nextLine();

                System.out.print("Sinopsis : ");
                String sinopsis = input.nextLine();

                System.out.print("Cast     : ");
                String pemain = input.nextLine();

                movies.put(movies.size()+1, judul);
                release.put(release.size()+1, rilis);
                duration.put(duration.size()+1, durasi);
                genre.put(genre.size()+1, aliran);
                synopsis.put(synopsis.size()+1, sinopsis);
                cast.put(cast.size()+1, pemain);

                printMov(movies);

            //Remove
            } else if (choice.equals("r")) {
                int j = input.nextInt();

                for (int i = 0;i  < movies.size() - 1 ;i++ ) {
                    movies.replace(j+i, movies.get(j+i+1));
                    release.replace(j+i, release.get(j+i+1));
                    duration.replace(j+i, duration.get(j+i+1));
                    genre.replace(j+i, genre.get(j+i+1));
                    synopsis.replace(j+i, synopsis.get(j+i+1));
                    cast.replace(j+i, cast.get(j+i+1));
                }

                movies.remove(movies.size());
                release.remove(release.size());
                duration.remove(duration.size());
                genre.remove(genre.size());
                synopsis.remove(synopsis.size());
                cast.remove(cast.size());

                printMov(movies);

            } else {
                System.out.println("Inputan tidak valid.");
                break;
            }

            System.out.println("\nContinue? Y/N");
            System.out.print("> ");
            String ctn = input.next();
            if (ctn.equalsIgnoreCase("N")) {
                break;
            } else if (ctn.equalsIgnoreCase("Y")) {
                System.out.println();
            } else {
                System.out.println("Inputan tidak valid.");
                break;
            }
        }
    input.close();
    }
}
