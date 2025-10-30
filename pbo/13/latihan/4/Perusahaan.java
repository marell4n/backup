public class Perusahaan {
    public static void main(String[] args) {
        Pegawai p1 = new Manajer("Budi");
        Pegawai p2 = new Kurir("Rudi");
        Pegawai p3 = new Pegawai("Andi");

        p1.bekerja();
        p2.bekerja();
        p3.bekerja();
    }
}