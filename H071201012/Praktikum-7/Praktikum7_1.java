import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

 class Praktikum7_1 {

   static void printMov (HashMap<Integer, String> m) {
     for (Integer num : m.keySet()) {
       String key = num.toString();
       String val = m.get(num);
       System.out.println(key + ". " + val);
     }

   }
  public static void main(String[] args) {
    Scanner inp = new Scanner (System.in);

    HashMap<Integer, String> favMov = new HashMap<> ();
    favMov.put(1, "Avenger : Endgame");
    favMov.put(2, "Spiderman : Far From Home");
    favMov.put(3, "Venom");
    favMov.put(4, "Thor : Ragnarok");

    Map<Integer, String> rilis = new HashMap<> ();
    rilis.put(1, "24 April 2019");
    rilis.put(2, "26 Juni 2019" );
    rilis.put(3, "1 Oktober 2018 ");
    rilis.put(4, "10 Oktober 2017");

    Map<Integer, String> durasi = new HashMap<>();
    durasi.put(1, "3 Jam 1 Menit");
    durasi.put(2, "2 Jam 9 Menit");
    durasi.put(3, "1 Jam 52 Menit");
    durasi.put(4, "2 Jam 10 Menit");

    Map<Integer,String> genre = new HashMap<>();
    genre.put(1, "Adventure, Sci-Fi, Action");
    genre.put(2, "Adventure, Sci-Fi, Action");
    genre.put(3, "Adventure, Sci-Fi, Action");
    genre.put(4, "Adventure, Sci-Fi, Action, Fantasy, Comedy");

    Map<Integer, String> sinopsis = new HashMap<>();
    sinopsis.put(1, "ini sinopsis");
    sinopsis.put(2, "ini sinopsis");
    sinopsis.put(3, "ini sinopsis");
    sinopsis.put(4, "ini sinopsis");

    Map<Integer, String> cast = new HashMap<>();
    cast.put(1, "Robert Downey Jr., Chris Evan, Mark Ruffalo");
    cast.put(2, "Tom Holland, Samuel L. Jackson, Jake Gyllenhall");
    cast.put(3, "Tom Hardy, Michelle Williams, Riz Ahmed");
    cast.put(4, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");

    while (true) {
    printMov(favMov);
    System.out.println("(d)Detail (s)Search (a)Add (r)Remove");

    String op = inp.next();
    if (op.equals("d")) {
      int j = inp.nextInt();
      String judul = favMov.get(j);
      String date = rilis.get(j);
      String duration = durasi.get(j);
      String tag = genre.get(j);
      String sin = sinopsis.get(j);
      String pemain = cast.get(j);

      System.out.println("Judul    : " + judul);
      System.out.println("Rilis    : " + date);
      System.out.println("Durasi   : " + duration);
      System.out.println("Genre    : " + tag);
      System.out.println("Sinposis : " + sin);
      System.out.println("Cast     : " + pemain);

    }
    else if (op.equals("s")) {
      String src = inp.next();

      for (int i = 1;i <= favMov.size() ;i++) {
        if (favMov.get(i).contains(src)) {
          System.out.println("Hasil Pencarian : " + favMov.get(i));
        }
      }

    }
    else if (op.equals("a")) {
      String judul = inp.nextLine();

      judul = judul.substring(1);
      System.out.printf("judul    : %s", judul);

      System.out.printf("%nRilis    : ");
      String date = inp.nextLine();

      System.out.printf("Durasi   : ");
      String duration = inp.nextLine();

      System.out.printf("Genre    : ");
      String tag = inp.nextLine();

      System.out.printf("Sinopsis : ");
      String sin = inp.nextLine();

      System.out.printf("Cast     : ");
      String pemain = inp.nextLine();

      favMov.put(favMov.size()+1, judul);
      rilis.put(rilis.size()+1, date);
      durasi.put(durasi.size()+1, duration);
      genre.put(genre.size()+1, tag);
      sinopsis.put(sinopsis.size()+1, sin);
      cast.put(cast.size()+1, pemain);

      printMov(favMov);

    }
    else if (op.equals("r")) {
    int j = inp.nextInt();

    for (int i = 0;i  < favMov.size() - 1 ;i++ ) {
    favMov.replace(j+i, favMov.get(j+i+1));
    rilis.replace(j+i, rilis.get(j+i+1));
    durasi.replace(j+i, durasi.get(j+i+1));
    genre.replace(j+i, genre.get(j+i+1));
    sinopsis.replace(j+i, sinopsis.get(j+i+1));
    cast.replace(j+i, cast.get(j+i+1));
    }

    favMov.remove(favMov.size());
    rilis.remove(rilis.size());
    durasi.remove(durasi.size());
    genre.remove(genre.size());
    sinopsis.remove(sinopsis.size());
    cast.remove(cast.size());

    printMov(favMov);

    }

  System.out.println("continue? yes/no");
  String ctn = inp.next();
    if (ctn.equals("no")) {
    break;
    }
  }
  inp.close();
  }
}
