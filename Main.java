import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 // Membuat objek Scanner untuk menerima input dari keyboard
 Scanner scanner = new Scanner(System.in);
 // Meminta pengguna memasukkan nama
 System.out.print("Masukkan nama Anda: ");
 String nama = scanner.nextLine();
 // Menampilkan pesan sambutan yang dipersonalisasi
 System.out.println("Selamat Datang di Java, " + nama + "!");
 // Menutup objek scanner
 // test
 scanner.close();
 }
 }
