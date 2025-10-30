public class Manajer extends Pegawai {
    public Manajer(String nama) {
        super(nama);
    }

    @Override
    public void bekerja() {
        super.bekerja();
        System.out.print(" sebagai manajer dan");
        System.out.println(" sedang memimpin rapat.");
        System.out.println();
    }
}