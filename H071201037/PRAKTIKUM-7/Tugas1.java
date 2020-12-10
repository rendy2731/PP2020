import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum7 {

	/* Emha "Fudhol" Ismaulidin */

	static void print (HashMap<Integer, String> m) {
		for (Integer num : m.keySet()) {
		String key = num.toString();
		String val = m.get(num);
		System.out.println(key + ". " + val);
		}
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	HashMap<Integer, String> filem = new HashMap<> ();
	filem.put(1, "Avenger : Endgame");
	filem.put(2, "Spiderman : Far From Home");
	filem.put(3, "Venom");
	filem.put(4, "Thor : Ragnarok");

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
	sinopsis.put(1, "Kembali ke masa lalu, Musuh Lama Bersemi Kembali.");
	sinopsis.put(2, "Lagi liburan eh kena hipnotis Uya Kuya.");
	sinopsis.put(3, "Depresi, seorang pria menjalin hubungan intim dengan alien.");
	sinopsis.put(4, "Seperti film Merantau, tapi di luar angkasa. ");

	Map<Integer, String> cast = new HashMap<>();
	cast.put(1, "Robert Downey Jr., Chris Evan, Mark Ruffalo");
	cast.put(2, "Tom Holland, Samuel L. Jackson, Jake Gyllenhall");
	cast.put(3, "Tom Hardy, Michelle Williams, Riz Ahmed");
	cast.put(4, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");

	while (true) {
    print(filem);
    System.out.println("(d)Detail (s)Search (a)Add (r)Remove");

    String opsi = input.next();

    if (opsi.equals("d")) {
      int j = input.nextInt();
      String judul = filem.get(j);
      String date = rilis.get(j);
      String duration = durasi.get(j);
      String tag = genre.get(j);
      String sin = sinopsis.get(j);
      String pemain = cast.get(j);

      System.out.println("Judul    : " + judul);
      System.out.println("Rilis    : " + date);
      System.out.println("Durasi   : " + duration);
      System.out.println("Genre    : " + tag);
      System.out.println("Sinopsis : " + sin);
      System.out.println("Cast     : " + pemain);

    }
    else if (opsi.equals("s")) {
      String src = input.next();

      for (int i = 1;i <= filem.size() ;i++) {
        if (filem.get(i).contains(src)) {
          System.out.println("Hasil Pencarian : " + filem.get(i));
        }
      }

    }
    else if (opsi.equals("a")) {
      String judul = input.nextLine();

      judul = judul.substring(1);
      System.out.printf("judul    : %s", judul);

      System.out.printf("%nRilis    : ");
      String date = input.nextLine();

      System.out.printf("Durasi   : ");
      String duration = input.nextLine();

      System.out.printf("Genre    : ");
      String tag = input.nextLine();

      System.out.printf("Sinopsis : ");
      String sin = input.nextLine();

      System.out.printf("Cast     : ");
      String pemain = input.nextLine();

      filem.put(filem.size()+1, judul);
      rilis.put(rilis.size()+1, date);
      durasi.put(durasi.size()+1, duration);
      genre.put(genre.size()+1, tag);
      sinopsis.put(sinopsis.size()+1, sin);
      cast.put(cast.size()+1, pemain);

      print(filem);

    }
    else if (opsi.equals("r")) {
    int j = input.nextInt();

    for (int i = 0; i < filem.size() - 1 ; i++ ) {
    filem.replace(j + i, filem.get(j + i + 1));
    rilis.replace(j + i, rilis.get(j + i + 1));
    durasi.replace(j + i, durasi.get(j + i + 1));
    genre.replace(j + i, genre.get(j + i + 1));
    sinopsis.replace(j + i, sinopsis.get(j + i + 1));
    cast.replace(j + i, cast.get(j + i + 1));
    }

    filem.remove(filem.size());
    rilis.remove(rilis.size());
    durasi.remove(durasi.size());
    genre.remove(genre.size());
    sinopsis.remove(sinopsis.size());
    cast.remove(cast.size());

    print(filem);

    }
    System.out.println("Lanjut? yes/no");
    String ljt = input.next();
      	if (ljt.equals("no")) {
      	break;
      	}
	}
	input.close();
}
}