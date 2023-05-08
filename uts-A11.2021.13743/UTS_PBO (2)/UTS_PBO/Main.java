import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membaca newline setelah input angka

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            scanner.nextLine(); // Membaca newline setelah input angka

            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); // Membaca newline setelah input angka

            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.nim = nim;
            mahasiswa.nama = nama;
            mahasiswa.semester = semester;
            mahasiswa.usia = usia;

            daftarMahasiswa.add(mahasiswa);
        }

        System.out.println("\nInfo Mahasiswa:");

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.infoMahasiswa();
            System.out.println();

        }
    }
}