import java.util.Scanner;

public class Tugas1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan 5 bilangan.");
		String a = in.nextLine();
		String b = in.nextLine();
		String c = in.nextLine();
		String d = in.nextLine();
		String e = in.nextLine();
		
		String inv = "Inputan Valid.";  //String pengkondisian apabila pesan error
		int even = 0, odd = 0, pos = 0, neg = 0;
		
		try{
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			int c1 = Integer.parseInt(c);
			int d1 = Integer.parseInt(d);
			int e1 = Integer.parseInt(e);
		}catch (Exception ime){
			inv = "Inputan Tidak Valid.";
			System.out.println(inv);
		}

		if (inv.equals("Inputan Valid.")){
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			int c1 = Integer.parseInt(c);
			int d1 = Integer.parseInt(d);
			int e1 = Integer.parseInt(e);
			int ea = a1 % 2;
			int eb = b1 % 2;
			int ec = c1 % 2;
			int ed = d1 % 2;
			int ee = e1 % 2;

			if(ea == 0){
				even++;
			}else{
				odd++;
			}
			if(eb == 0){
				even++;
			}else{
				odd++;
			}
			if(ec == 0){
				even++;
			}else{
				odd++;
			}
			if(ed == 0){
				even++;
			}else{
				odd++;
			}
			if(ee == 0){
				even++;
			}else{
				odd++;
			}
			if(a1 > 0){
				pos++;
			}else if(a1 < 0){
				neg++;
			}
			if(b1 > 0){
				pos++;
			}else if(b1 < 0){
				neg++;
			}
			if(c1 > 0){
				pos++;
			}else if(c1 < 0){
				neg++;
			}
			if(d1 > 0){
				pos++;
			}else if(d1 < 0){
				neg++;
			}
			if(e1 > 0){
				pos++;
			}else if(e1 < 0){
				neg++;
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(even + " Angka Genap");
			System.out.println(odd + " Angka Ganjil");
			System.out.println(pos + " Angka Positif");
			System.out.println(neg + " Angka Negatif");
		}
	}
}