public class Kurir extends Pegawai {
    public Kurir(String nama) {
        super(nama);
    }

    @Override
    public void bekerja() {
        super.bekerja();
        System.out.print(" sebagai kurir dan");
        System.out.println(" sedang mengirimkan paket.");
        System.out.println();
    }
}