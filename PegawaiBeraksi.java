public class PegawaiBeraksi {
  public static void main(String[] args) {
    // Membuat Object
    Manager syahril = new Manager();
    Programmer aulia = new Programmer();

    /* Memberi attribute dan memberi nilai */
    syahril.setNama("Syahril Ifanda");
    syahril.setGajiPokok(5000000);
    syahril.setTunjangan(1000000);

    aulia.setNama("Aulia Rachman");
    aulia.setGajiPokok(4000000);
    aulia.setBonus(400000);

    /* Mengakses Method */
    syahril.cetakInfo();
    System.out.println();
    aulia.cetakInfo();
  }
}
