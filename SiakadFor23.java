import java.util.Scanner;

public class SiakadFor23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        int batasKelulusan = 60;


        // struktur perulangan for
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // menentukan nilai tertinggi dan terendah 
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // menghitung jumlah mahasiswa lulus dan tidak lulus 
            if (nilai >= batasKelulusan) {
                jumlahLulus++;
            } else {
                jumlahLulus++;
            }
        }
        System.out.println("Nilai Tertinggi :" + tertinggi);
        System.out.println("Nilai Terendah :" + terendah);
        System.out.println("Jumlah Mahasiswa Lulus :" + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus :" + jumlahTidakLulus);
    }

}