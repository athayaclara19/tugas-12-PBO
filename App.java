import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Masukkan nomor faktur: ");
            int noFaktur = scanner.nextInt();

            System.out.println("Masukkan nama pelanggan: ");
            String namaPelanggan = scanner.next();

            System.out.println("Masukkan nama barang: ");
            String namaBarang = scanner.next();

            System.out.println("Masukkan harga barang: ");
            double hargaBarang = scanner.nextDouble();

            if (hargaBarang == 0) {
                throw new Exception("Harga barang tidak boleh nol");
            }

            System.out.println("Masukkan jumlah barang: ");
            int jumlahBarang = scanner.nextInt();

            Pelanggan pelanggan = new Pelanggan(namaPelanggan, namaBarang, hargaBarang, jumlahBarang);
            Faktur faktur = new Faktur(noFaktur, pelanggan);
            
            faktur.totalBayar();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}