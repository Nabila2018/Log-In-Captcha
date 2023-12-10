import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class SupermarketProgram {
    private String namaSupermarket;
    private Date tanggal;
    private String waktu;
    private String namaPelanggan;
    private String nomorHP;
    private String alamat;
    private String kodeBarang;
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBeli;
    private double totalBayar;
    private String namaKasir;

    // Constructor
    public SupermarketProgram(String namaSupermarket, Date tanggal, String waktu,
                              String namaPelanggan, String nomorHP, String alamat,
                              String kodeBarang, String namaBarang, double hargaBarang,
                              int jumlahBeli, double totalBayar, String namaKasir) {
        this.namaSupermarket = namaSupermarket;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.namaPelanggan = namaPelanggan;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
        this.totalBayar = totalBayar;
        this.namaKasir = namaKasir;
    }

    // Getter methods
    public String getNamaSupermarket() {
        return namaSupermarket;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    // Method to format date as a string
    public String formatDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");
        return dateFormat.format(tanggal);
    }

    // Method to format time as a string
    public String formatTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
        return timeFormat.format(tanggal);
    }

    // Method to display all data
    public void displayData() {
        System.out.println("      Billy's MiniMart\t\t     ");

        System.out.println("Tanggal : " + formatDate());
        System.out.println("Waktu   :  " + waktu);
        System.out.println("===============================");
        System.out.println("       DATA PELANGGAN\t\t      ");
        System.out.println("-------------------------------");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("No. HP         : " + nomorHP);
        System.out.println("Alamat         : " + alamat);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("    DATA PEMBELIAN BARANG\t\t   ");
        System.out.println("-------------------------------");
        System.out.println("Kode Barang       : " + kodeBarang);
        System.out.println("Nama Barang       : " + namaBarang);
        System.out.println("Harga Barang      : " + hargaBarang);
        System.out.println("Jumlah Beli       : " + jumlahBeli);
        System.out.println("TOTAL BAYAR       : " + totalBayar);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Kasir    : " + namaKasir);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Proses Login
        System.out.println("=== Selamat Datang di Billy's MiniMart ===");
        System.out.print("Masukkan Username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String enteredPassword = scanner.nextLine();

        // Buat objek LogInDanCaptcha
        LogInDanCaptcha loginManager = new LogInDanCaptcha("Billy", "2018");

        // Menampilkan captcha
        System.out.println("Captcha: " + loginManager.getCaptcha());

        // Input captcha
        System.out.print("Masukkan Captcha: ");
        String enteredCaptcha = scanner.nextLine();

        // Mengecek login
        if (loginManager.checkLogin(enteredUsername, enteredPassword, enteredCaptcha)) {
            // Jika login berhasil, tampilkan pesan selamat datang
            System.out.println("Login berhasil!");

            // Input data transaksi
            System.out.print("Masukkan Nama Supermarket/Mini Market: ");
            String namaSupermarket = scanner.nextLine();

            // ... (lanjutkan dengan input data transaksi sesuai kebutuhan)

            // Melanjutkan dengan input data transaksi dan proses transaksi
            // Input data transaksi
            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("Masukkan No. HP         : ");
            String nomorHP = scanner.nextLine();
            System.out.print("Masukkan Alamat         : ");
            String alamat = scanner.nextLine();

            System.out.print("Masukkan Kode Barang    : ");
            String kodeBarang = scanner.nextLine();
            System.out.print("Masukkan Nama Barang    : ");
            String namaBarang = scanner.nextLine();
            System.out.print("Masukkan Harga Barang   : ");
            double hargaBarang = scanner.nextDouble();
            System.out.print("Masukkan Jumlah Beli    : ");
            int jumlahBeli = scanner.nextInt();

            // Hitung total bayar
            double totalBayar = hargaBarang * jumlahBeli;

            scanner.nextLine();  // Membersihkan newline di buffer
            System.out.print("Masukkan Nama Kasir     : ");
            String namaKasir = scanner.nextLine();

            // Buat objek SupermarketProgram
            SupermarketProgram transaksi = new SupermarketProgram(
                    namaSupermarket, new Date(), loginManager.formatTime(),
                    namaPelanggan, nomorHP, alamat,
                    kodeBarang, namaBarang, hargaBarang,
                    jumlahBeli, totalBayar, namaKasir
            );

            // Tampilkan data transaksi
            transaksi.displayData();
        } else {
            // Jika login gagal, tampilkan pesan error
            System.out.println("Login gagal. Username, password, atau captcha salah.");
        }

        scanner.close();
    }
}
