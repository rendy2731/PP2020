import java.util.ArrayList;
import java.util.Scanner;

public class Jawaban {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> avangersEG = new ArrayList<>();
        avangersEG.add("Avangers : Endgame");
        avangersEG.add("Rilis    : 24 April 2019");
        avangersEG.add("Durasi   : 3 jam 1 menit (181 menit)");
        avangersEG.add("Genre    : Adventure, Sci-Fi, Action");
        avangersEG.add("Sinopsis : Melanjutkan Avengers Infinity War, dimana kejadian setelah Thanos berhasil mendapatkan semua infinity stones \n \t   dan memusnahkan 50% semua mahluk hidup di alam semesta. Akankah para Avengers berhasil mengalahkan Thanos?");
        avangersEG.add("Cast     : Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth, Scarlett Johansson, Tom Holland, etc..");

        ArrayList<String> spidermanFFH = new ArrayList<>();
        spidermanFFH.add("Spiderman : Far From Home");
        spidermanFFH.add("Rilis    : 3 Juli 2019");
        spidermanFFH.add("Durasi   : 2 jam 9 menit (129 menit)");
        spidermanFFH.add("Genre    : Action, Adventure, Comedy, Fantasy");    
        spidermanFFH.add("Sinopsis : Peter Parker (Tom Holland) tengah mengunjungi Eropa untuk liburan panjang bersama temaan-temanya. Sayangnya , Parker tidak bisa dengan tenang menikmati liburannya, karena Nick Fury datang secara tiba-tiba di kamar hotelnya. Selama di Eropa pun Peter harus menghadapi banyak musuh mulai dari Hydro Man, Sandman dan Molten Man.");
        spidermanFFH.add("Cast     : Christian Balle, Heath Ledger, Motrgan Freeman, Aaron Heckhart, Gary Oldman, etc..");
        
        ArrayList<String> justiceLeague = new ArrayList<>();
        justiceLeague.add("Justice League");
        justiceLeague.add("Rilis    : 17 November 2017");
        justiceLeague.add("Durasi   : 2jam (120 menit)");
        justiceLeague.add("Genre    : Action, Adventure, Fantasy, Sci-Fi");
        justiceLeague.add("Sinopsis : Dipicu oleh kepercayaannya terhadap kemanusiaan dan terinspirasi oleh tindakan tanpa pamrih Superman (Henry Cavill), Bruce Wayne (Ben Affleck) mengumpulkan sekutu baru Diana Prince untuk menghadapi ancaman yang lebih besar lagi. Bersama-sama, Batman dan Wonder Woman bekerja sama untuk merekrut tim untuk melawan musuh yang baru dibangun ini. Meskipun terbentuknya liga pahlawan yang belum pernah terjadi sebelumnya - Batman, Wonder Woman, Aquaman, Cyborg dan Flash - mungkin sudah terlambat untuk menyelamatkan planet ini dari serangan dengan proporsi bencana.");
        justiceLeague.add("Cast     : Tom Holland, Samuel L Jakson, Jake Gyllenhaal, Marisa Tomei, Jon Favreau, etc..");
        
        ArrayList<String> theDarkKnight = new ArrayList<>();
        theDarkKnight.add("The Dark Knight");
        theDarkKnight.add("Rilis    : 18 Juli 2008");
        theDarkKnight.add("Durasi   : 2 jam 32 menit (152 menit)");
        theDarkKnight.add("Sinopsis : Batman memiliki musuh baru, Joker, otak kriminal yang berambisi menghancurkan Gotham City. Bersama Gordon dan Harvey Dent, Batman harus berjuang untuk menghentikannya sebelum semuanya terlambat.");
        theDarkKnight.add("Genre    : Action, Crime, Drama, Thriller");
        theDarkKnight.add("Cast     : Ben Affleck, Henry Cavil, Jason Mamoa, Gal Gadot, Ezra Miller, Amy Adams, etc..");
        
        ArrayList<String> gundala = new ArrayList<>();
        gundala.add("Gundala");
        gundala.add("Rilis    : 29 Agustus 2019");
        gundala.add("Durasi   : 2 jam 3 menit (150 menit)");
        gundala.add("Sinopsis : Sancaka hidup di jalanan sejak ditinggal ayah dan ibunya. Menghadapi hidup yang keras, Sancaka belajar untuk bertahan hidup dengan tidak peduli dengan orang lain dan hanya mencoba untuk mendapatkan tempat yang aman bagi dirinya sendiri. Ketika situasi kota semakin tidak aman dan ketidakadilan merajalela di seluruh negeri, Sancaka harus buat keputusan yang berat, tetap hidup di zona amannya, atau keluar sebagai Gundala untuk membela orang-orang yang ditindas.");
        gundala.add("Genre    : Action, Adventure, Drama, Sci-Fi");
        gundala.add("Cast     : Abimana Aryasatya, Tara Basro, Bront Palarae, Ario Bayu, Lukman Sardi, Arswendi Nasution, etc..");

        ArrayList<String> wiroSableng= new ArrayList<>();
        wiroSableng.add("Wiro Sableng : Pendekar Kapak Maut Naga Geni 212");
        wiroSableng.add("Rilis    : 30 Agustus 2018");
        wiroSableng.add("Durasi   : 2 jam 3 menit (123 Menit)");
        wiroSableng.add("Sinopsis : Setelah ilmu silatnya siap, gurunya mengutus Wiro agar turun gunung untuk mencari Mahesa Birawa. Dalam perjalanan, ia tak sengaja bertemu pangeran yang tengah diculik oleh para pengkhianat kerajaan.");
        wiroSableng.add("Genre    : Action, Adventure, Comedy, Fantasy");
        wiroSableng.add("Cast     : Vino G. Bastian, Yayan Ruhian, Fariz Alfarazi, Ruth Marini, Marsha Timothy, Sherina Munaf, etc..");

        ArrayList<ArrayList> favouriteMovie = new ArrayList<ArrayList>(); 
        favouriteMovie.add(avangersEG);
        favouriteMovie.add(spidermanFFH);
        favouriteMovie.add(justiceLeague);
        favouriteMovie.add(theDarkKnight);
        
        ArrayList<ArrayList> allMovie = new ArrayList<ArrayList>();
        allMovie.add(gundala);
        allMovie.add(wiroSableng);
        allMovie.addAll(favouriteMovie);

        // Mengelola perintah input
        while (true) {
        // Tampilan awal
        System.out.println("======= Favourite movie =======");
        daftarFilm(favouriteMovie);
        System.out.println("(d)Detail (s)Search (a)Add (r)Remove");

            switch (input.next()) {
                case "r": // Menghapus daftar film
                    int hapus = input.nextInt();
                    favouriteMovie.remove(hapus-1);
                    break;
                case "s": // Mencari judul film Yang cocok
                    String cari = input.next();
                    int urutanCari = 1;
                    for (ArrayList<String> data: favouriteMovie) {
                        if (data.get(0).contains(cari)){
                            System.out.print("\n>> "+ (urutanCari)+ ". "+ data.get(0)+" <<");
                        }
                        urutanCari++;
                    }
                    System.out.println();
                    continue;
                case "d":  // Menampilkan detail film
                        System.out.println();
                        for (String detail: (ArrayList<String>) favouriteMovie.get(input.nextInt()-1)) {
                            System.out.println(detail);
                        }
                    break;
                case "a": // Menambahkan film
                System.out.println("======= All Movie =======");
                    daftarFilm(allMovie);
                    System.out.println("Insert movie number to add ");
                    favouriteMovie.add(allMovie.get(input.nextInt()-1));
                    break;
                default:
                    System.out.println("Please insert correct keyword!s ");
                    break;     
            }
            System.out.println("(L)Favourite Movie List (E)Exit");
            if (input.next().equalsIgnoreCase("L")){
                continue;
            } else {
                break;
            }
        }
        input.close();
    }
    
    static void daftarFilm(ArrayList<ArrayList> data) {
        int urutan = 0;
        for (ArrayList detail: data) {
            System.out.println((urutan+1)+ ". "+ detail.get(0));
            urutan++;
        }
    }
}
