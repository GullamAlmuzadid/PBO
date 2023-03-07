public class AksiSepeda {
    public static void main(String[] args) {
        Sepeda sepedaBalap = new Sepeda(2, "Balap", "Fixie");
        sepedaBalap.gear = 1;
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah gear : " + gearSepeda);
        sepedaBalap.ngerem();

        Sepeda sepedaOnthel = new Sepeda(2, "Onthel", "Phoenix");
        sepedaOnthel.gear = 1;
        int gearSepedaOnthel = sepedaOnthel.gear;
        System.out.println("Jumlah gear : " + gearSepedaOnthel);
        sepedaOnthel.ngerem();
    }
}