import java.util.*;

public class Praktikum7 {

    private static void printFavMovie(HashMap<String, ArrayList<String>> favMovie) {
        System.out.println("--------------------------------------------");
        System.out.println("Favourite Movie");
        if (favMovie.get("Judul").isEmpty()) {
            System.out.println("Tidak Tersedia Daftar Movie");
        } else {
            for (int i = 0; i < favMovie.get("Judul").size(); i++) {
                System.out.printf("%d. %s\n", i + 1, favMovie.get("Judul").get(i));
            }
        }
        System.out.print("(d)Detail (s)Search (a)Add (r)Remove\n> ");

    }

    private static String cekLoop(String loopInput, HashMap<String, ArrayList<String>> favMovie) {
        if (loopInput.equalsIgnoreCase("Ya")) {
            printFavMovie(favMovie);
        } else {
            System.out.println("---------------------------------------------");
            System.out.println("======= Terima Kasih. Program Selesai =======");
        }
        return loopInput;
    }

    private static HashMap<String, ArrayList<String>> addMovie(HashMap<String, ArrayList<String>> favMovie, Scanner scan) {
        scan.nextLine();
        System.out.print("Masukkan Judul : ");
        favMovie.get("Judul").add(scan.nextLine());
        System.out.print("Masukkan Tanggal Rilis : ");
        favMovie.get("Rilis").add(scan.nextLine());
        System.out.print("Masukkan Lama Durasi : ");
        favMovie.get("Durasi").add(scan.nextLine());
        System.out.print("Masukkan Jenis Genre : ");
        favMovie.get("Genre").add(scan.nextLine());
        System.out.print("Masukkan Sinopsis Movie : ");
        favMovie.get("Sinopsis").add(scan.nextLine());
        System.out.print("Masukkan Cast Movie : ");
        favMovie.get("Cast").add(scan.nextLine());

        return favMovie;
    }

    private static void detailMovie(HashMap<String, ArrayList<String>> favMovie, int kode) {
        if (favMovie.get("Judul").isEmpty()) {
            System.out.println("Tidak Tersedia Daftar Movie");
        } else {
            System.out.print("Judul\t : " + favMovie.get("Judul").get(kode - 1));
            System.out.print("\nRilis\t : " + favMovie.get("Rilis").get(kode - 1));
            System.out.print("\nDurasi\t : " + favMovie.get("Durasi").get(kode - 1));
            System.out.print("\nGenre\t : " + favMovie.get("Genre").get(kode - 1));
            System.out.print("\nSinopsis : " + favMovie.get("Sinopsis").get(kode - 1));
            System.out.print("\nCast\t : " + favMovie.get("Cast").get(kode - 1));
            System.out.println();
        }

    }

    private static HashMap<String, ArrayList<String>> removeMovie(HashMap<String, ArrayList<String>> favMovie, int kode) {
        if (favMovie.get("Judul").isEmpty()) {
            System.out.println("Tidak Tersedia Daftar Movie");
        } else {
            favMovie.get("Judul").remove(kode - 1);
            favMovie.get("Rilis").remove(kode - 1);
            favMovie.get("Durasi").remove(kode - 1);
            favMovie.get("Genre").remove(kode - 1);
            favMovie.get("Sinopsis").remove(kode - 1);
            favMovie.get("Cast").remove(kode - 1);
        }
        return favMovie;
    }

    private static void searchMovie(HashMap<String, ArrayList<String>> favMovie, String kode) {
        String[] listMovie = favMovie.get("Judul").toArray(new String[favMovie.get("Judul").size()]);
        System.out.println("Hasil Pencarian : " + kode);
        for (int i = 0; i < listMovie.length; i++) {
            for (int j = 0; j < listMovie[i].length(); j++) {
                if (j + kode.length() <= listMovie[i].length()) {
                    if (kode.equalsIgnoreCase(listMovie[i].substring(j, j + kode.length()))) {
                        System.out.printf("%d. %s\n", i + 1, listMovie[i]);
                        break;
                    }
                } else {
                    continue;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, ArrayList<String>> favMovie = new HashMap<>();
        favMovie.put("Judul", new ArrayList<>());
        favMovie.put("Rilis", new ArrayList<>());
        favMovie.put("Durasi", new ArrayList<>());
        favMovie.put("Genre", new ArrayList<>());
        favMovie.put("Sinopsis", new ArrayList<>());
        favMovie.put("Cast", new ArrayList<>());
        printFavMovie(favMovie);

        String loopInput = "Ya";
        while (loopInput.equalsIgnoreCase("Ya")) {
            String kodeHuruf = scan.next();
            if (kodeHuruf.equals("d")) {
                int kodeAngka = scan.nextInt();
                detailMovie(favMovie, kodeAngka);
                scan.nextLine();
                System.out.println("--------------------------------------------");
                System.out.print("Lanjutkan Daftar Film? (Ya/Tidak)\n>");
                loopInput = scan.nextLine();
                cekLoop(loopInput, favMovie);

            } else if (kodeHuruf.equals("r")) {
                int kodeAngka = scan.nextInt();
                removeMovie(favMovie, kodeAngka);
                scan.nextLine();
                System.out.println("--------------------------------------------");
                System.out.print("Lanjutkan Daftar Film? (Ya/Tidak)\n>");
                loopInput = scan.nextLine();
                cekLoop(loopInput, favMovie);

            } else if (kodeHuruf.equals("s")) {
                String kodeKata = scan.next();
                searchMovie(favMovie, kodeKata);
                scan.nextLine();
                System.out.println("--------------------------------------------");
                System.out.print("Lanjutkan Daftar Film? (Ya/Tidak)\n>");
                loopInput = scan.nextLine();
                cekLoop(loopInput, favMovie);

            } else if (kodeHuruf.equals("a")) {
                favMovie = addMovie(favMovie, scan);
                System.out.println("--------------------------------------------");
                System.out.print("Lanjutkan Daftar Film? (Ya/Tidak)\n>");
                loopInput = scan.nextLine();
                cekLoop(loopInput, favMovie);

            } else {
                System.out.println("Kode yang anda masukkan salah");
                System.out.println("Masukkan Kode yang Benar");
                cekLoop(loopInput, favMovie);
            }
        }
    }
}