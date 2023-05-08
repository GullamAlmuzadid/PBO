import java.util.ArrayList;

public class Mahasiswa {
    protected String nim;
    protected String nama;
    protected int semester;
    protected int usia;
    protected ArrayList<String> krs;

    public float hitungRataNilai(ArrayList<Integer> nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (float) total / nilai.size();
    }

    public void infoMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Usia: " + usia);
    }

    public void infoKrsMahasiswa() {
        System.out.println("KRS: ");
        for (String matkul : krs) {
            System.out.println(matkul);
        }
    }
}
