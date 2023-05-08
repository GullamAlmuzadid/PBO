public class MahasiswaBaru extends Mahasiswa {
    private String asalSekolah;

    public boolean ikutOspek() {
        // Implementasi logika ospek
        return true;
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah: " + asalSekolah);
    }
}