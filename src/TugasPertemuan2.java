import bangunruang.Segitiga;
import java.util.Scanner;

public class TugasPertemuan2 {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat datang di mata kuliah \" Pemrograman Berorientasi Objek \" ";
        int tahun = 2022;

        System.out.println("===========================================================================");
        System.out.println(pesan + " " + tahun);
        System.out.println("===========================================================================");
        
    //Scan inputan Keyboard
    Scanner keyboard = new Scanner(System.in);
    
    Segitiga segitiga = new Segitiga();
    System.out.println("Masukkan alas = ");
    segitiga.a = keyboard.nextInt();
    System.out.println("Masukkan tinggi = ");
    segitiga.t = keyboard.nextInt();

    //tampilkan luas segitiga siku-siku
    segitiga.tampilkanLuasSegitiga();


    keyboard.close();
    }
    
}