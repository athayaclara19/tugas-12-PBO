public class Pelanggan extends Produk {     //Inheritance
    private String namaPelanggan;

    public Pelanggan(String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBarang) {
        super(namaBarang, hargaBarang, jumlahBarang);
        this.namaPelanggan = namaPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    @Override
    public void totalBayar() {
        super.totalBayar();
        System.out.println("Nama Pelanggan: " + getNamaPelanggan());
    }
}