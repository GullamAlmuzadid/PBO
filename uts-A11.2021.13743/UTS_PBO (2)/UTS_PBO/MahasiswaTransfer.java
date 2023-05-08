public class MahasiswaTransfer extends Mahasiswa {
    private String asalUniversitas;

    public boolean ikutOspek() {
        // Implementasi logika ospek untuk mahasiswa transfer
        return true;
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas: " + asalUniversitas);
    }
}