/*sofia amanda*/
/*13020210152*/

// import scanner
import java.util.Scanner;

class Hitung40152 {
 public static void main(String[] args) {
  
  try{
   // buat objek Scanner
   Scanner masukan = new Scanner(System.in);
   
   // nilai tukar mata uang
   int rupiah = 9589;

   System.out.println("=============================================");
   System.out.println("Title   : Sistem Konversi Mata Uang Otomatis");
   System.out.println("Coder   : Virgiawan Listanto");
   System.out.println("Website : www.id-webmaster.com");
   System.out.println("============================================= \n");

   // Tampilkan Pilihan
   System.out.println("1. Dollar -> Rupiah");
   System.out.println("2. Rupiah -> Dollar");

   System.out.print("\n> Pilih Nomor Untuk Mengkonversi Mata Uang: ");

   // Dilaog 1 untuk pilihan
   int pilihan = masukan.nextInt();

   // pernyataan menggunakan switch
   switch(pilihan){

    // Dollar Ke Rupiah
    case 1:
     System.out.println("\n> Anda Memilih: 1. Dollar -> Rupiah\n");
     System.out.print("> Masukan Nilai Dollar Anda: $");

     int dollarToRupiah = masukan.nextInt();
     int konversi_dollar_ke_rupiah = dollarToRupiah * rupiah;

     System.out.println("\n> Hasil: $"+dollarToRupiah+" = Rp."+
konversi_dollar_ke_rupiah+"\n");
    break;

    // Rupiah Ke Dollar
    case 2:
     System.out.println("\n> Anda Memilih: 2. Rupiah -> Dollar\n");
     System.out.print("> Masukan Nilai Rupiah Anda: Rp.");

     int rupiahToDollar = masukan.nextInt();
     int konversi_rupiah_ke_dollar = rupiahToDollar / rupiah;

     System.out.println("\n> Hasil: Rp."+rupiahToDollar+" = $"+
konversi_rupiah_ke_dollar+"\n");
    break;

    // Default
    default:
     System.out.println("\n> Silahkan Pilih Nomor 1 atau 2\n");
   }

  }
  catch (Exception e){
   System.out.println("System Error");
   System.out.println("");
  }
  
 }
}