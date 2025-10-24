import java.util.Scanner;

public class PenjualanTiketBioskop23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000; // harga tiket per lembar
        int totalTiket = 0;
        double totalPendapatan = 0;
        
        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        int jumlahPelanggan = sc.nextInt();
        
        int i = 1;
        while (i <= jumlahPelanggan) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
            int jumlahTiket = sc.nextInt();
            
            // Validasi input
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan ulang.");
                continue; // lewati iterasi ini dan minta input ulang
            }
            
            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;
            
            // Hitung diskon
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            
            totalHarga -= totalHarga * diskon; // potong diskon
            totalPendapatan += totalHarga;
            totalTiket += jumlahTiket;
            
            System.out.println("Total harga untuk pelanggan ke-" + i + ": Rp " + totalHarga);
            i++; // lanjut ke pelanggan berikutnya
        }

        System.out.println("\n=========== LAPORAN PENJUALAN HARI INI ===========");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total pendapatan    : Rp " + totalPendapatan);
        
        sc.close();
    }
}
