import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    
    //String
	 	 System.out.print("masukkan nama : ");
	 	 String nama = in.nextLine();
	 	 System.out.println("nama saya adalah " + nama);
	 	
	 	//Int
	 	 System.out.print("masukkan umur :");
	   int umur = in.nextInt();
	 	 System.out.println("umur saya adalah : " + umur);
	 	
	 	//Byte
	 	 System.out.print("masukkan bulan :");
	 	 byte bulan = in.nextByte();
		 System.out.println("Bulan lahir saya adalah " + bulan);
	 	
	 	//Short
	 	 System.out.print("masukkan tanggal :");
	 	 short tanggal= in.nextShort();
	 	 System.out.println("tanggal lahir saya adalah " + tanggal);
	 	
	 	//Long
	 	 System.out.print("masukkan NO : ");
	 	 long noHandphone = in.nextLong();
	 	 System.out.println("No HP saya adalah " + noHandphone);
	 	
	 	//Float
	 	 System.out.print("masukkan BB :");
	 	 float beratBadan = in.nextFloat();
	 	 System.out.println("Berat badan saya adalah " +beratBadan);
	 	
	 	//Double
		 System.out.print("masukkan TB :");
	 	 double tinggiBadan = in.nextDouble();
	 	 System.out.println("Tinggi badan saya adalah " + tinggiBadan);
	 	
	 	//Char
	 	 System.out.print("masukkan nilai : ");
	 	 char A = in.next().charAt(0);
	 	 System.out.println("Nilai ulangan saya adalah " + A);
	 	
	 	//Boolean
	 	 System.out.print("true/false : ");
	 	 boolean mahaSiswa = in.nextBoolean();
	 	 System.out.println("Apakah saya lulus " + mahaSiswa);
      
      }
    }
