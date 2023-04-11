import Transportasi.*;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Kijang", "Biru", 100);
        Bicycle sepeda = new Bicycle("Onthel", "Coklat", 25);

        mobil.maju();
        sepeda.maju();
    }
}
