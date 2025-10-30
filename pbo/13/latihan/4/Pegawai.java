public class Pegawai {
    protected String nama;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void bekerja() {
        System.out.print(nama + " bekerja di kantor");
        System.out.println();
    }
}