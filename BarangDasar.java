public class BarangDasar implements Barang {
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBeli;

    public BarangDasar(String namaBarang, double hargaBarang, int jumlahBeli) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }

    @Override
    public double hitungTotal() {
        return hargaBarang * jumlahBeli;
    }

    @Override
    public void tampilDetail() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Bayar: " + hitungTotal());
    }
}
