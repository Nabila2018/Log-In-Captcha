public class BarangMakanan extends BarangDasar {
    private boolean kadaluarsa;

    public BarangMakanan(String namaBarang, double hargaBarang, int jumlahBeli, boolean kadaluarsa) {
        super(namaBarang, hargaBarang, jumlahBeli);
        this.kadaluarsa = kadaluarsa;
    }

    @Override
    public void tampilDetail() {
        super.tampilDetail();
        System.out.println("Kadaluarsa: " + kadaluarsa);
    }
}
