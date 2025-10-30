// Main.java
class Bayaran {
    public int hitungBayaran(Pegawai peg) {
        int uang = peg.infoGaji();
        if (peg instanceof Manager) {
            uang += ((Manager) peg).infoTunjangan();
        } else if (peg instanceof Programmer) {
            uang += ((Programmer) peg).infoBonus();
        }
        return uang;
    }

    public static void main(String args[]) {
        Manager man = new Manager("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 500, 30);
        Bayaran hr = new Bayaran();

        // Hitung bayaran untuk Manager
        System.out.println("Bayaran untuk Manager : " + hr.hitungBayaran(man));

        // Hitung bayaran untuk Programmer
        System.out.println("Bayaran untuk Programmer : " + hr.hitungBayaran(prog));
    }
}