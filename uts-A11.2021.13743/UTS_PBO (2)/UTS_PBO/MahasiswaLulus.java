public class MahasiswaLulus extends Mahasiswa {
    private int tahunWisuda;
    private float ipk;

    public boolean ikutWisuda() {
        // Implementasi logika ikut wisuda
        return true;
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda: " + tahunWisuda);
        System.out.println("IPK: " + ipk);
    }
}