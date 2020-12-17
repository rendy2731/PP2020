import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class TP7_Nomor1 {
    public static List<String> judul = new ArrayList<String>();
    public static List<String> rilis = new ArrayList<String>();
    public static List<String> durasi = new ArrayList<String>();
    public static List<String> genre = new ArrayList<String>();
    public static List<String> sinopsis = new ArrayList<String>();
    public static List<String> cast = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        judul.add("Avengers : End Game");
        rilis.add("tanggal");
        genre.add("genre");
        sinopsis.add("ini adalah sinopsis");
        durasi.add("jam");
        cast.add("orang");
        judul.add("Spiderman : far from home");
        rilis.add("tanggal");
        genre.add("genre");
        sinopsis.add("ini adalah sinopsis");
        durasi.add("jam");
        cast.add("orang");
        judul.add("Venom");
        rilis.add("tanggal");
        genre.add("genre");
        sinopsis.add("ini adalah sinopsis");
        durasi.add("jam");
        cast.add("orang");
        judul.add("Thor : Ragnarok");
        rilis.add("tanggal");
        genre.add("genre");
        sinopsis.add("ini adalah sinopsis");
        durasi.add("jam");
        cast.add("orang");
        show();
            while (obj.hasNext()){
        char select = obj.next().charAt(0);
        switch (select) {
            case 'd':
                int number = obj.nextInt();
                detail(number);
                break;
            case 'r':
                int x = obj.nextInt();
                remove(x);
                show();
                break;
            case 'a':
                System.out.print("judul\t :");
                tambah();
                break;
             case 's' :
             String nama = obj.next();
             search(nama);
        }
    }
    }

    public static void detail(int i) {
        i-=1;
        System.out.println("judul    : " + judul.get(i));
        System.out.println("rilis    : " + rilis.get(i));
        System.out.println("genre    : " + genre.get(i));
        System.out.println("durasi   : " + durasi.get(i));
        System.out.println("sinopsis : " + sinopsis.get(i));
        System.out.println("cast     : " + cast.get(i));
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t");
    }

    public static void remove(int i) {
        judul.remove(i - 1);
        for (int x = 0; x < judul.size(); x++)
            System.out.println(judul.get(x));
            System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t");
    }

    public static void tambah() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" ");
        judul.add(scan.nextLine());
        System.out.print("rilis\t :");
        rilis.add(scan.nextLine());
        System.out.print("durasi\t :");
        durasi.add(scan.nextLine());
        System.out.print("genre\t :");
        genre.add(scan.nextLine());
        System.out.print("sinopsis :");
        sinopsis.add(scan.nextLine());
        System.out.print("cast\t :");
        cast.add(scan.nextLine());
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t");
    }
    public static void search(String nama) {
        for (int x = 0; x < judul.size(); x++) {
            if  (judul.get(x).contains(nama)) {
                System.out.println(x + 1+". "+judul.get(x));
            }
        }
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t"); 
    }
    public static void show(){
        for(int x=0; x<judul.size();x++){
            System.out.println(x+1+". "+judul.get(x));
        }
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t");
    } 
}