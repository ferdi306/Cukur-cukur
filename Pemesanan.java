import java.util.Scanner;

class Pelanggan {
    private String nama;
    private String tanggal;
    private String jenisCukur;

    public Pelanggan(String nama, String tanggal, String jenisCukur) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.jenisCukur = jenisCukur;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getJenisCukur() {
        return jenisCukur;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nTanggal: " + tanggal + "\nJenis Cukur: " + jenisCukur;
    }
}



public class Pemesanan {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean inginMemesanLagi;

            do {
                System.out.println("Selamat datang di Aplikasi Pemesanan Cukur Rambut");

                // Memasukkan informasi pelanggan
                System.out.print("Masukkan nama Anda: ");
                String nama = scanner.nextLine();

                System.out.print("Masukkan tanggal pemesanan (DD/MM/YYYY): ");
                String tanggal = scanner.nextLine();

                System.out.print("Pilih jenis cukur (Contoh: Potong Rambut, Warnai Rambut, dll.): ");
                String jenisCukur = scanner.nextLine();

                // Membuat objek Pelanggan
                Pelanggan pelanggan = new Pelanggan(nama, tanggal, jenisCukur);

                // Menampilkan informasi pemesanan
                System.out.println("\nTerima kasih! Berikut detail pemesanan Anda:");
                System.out.println(pelanggan);

                // Menampilkan pesan terima kasih
                System.out.println("\nTerima kasih telah menggunakan Aplikasi Pemesanan Cukur Rambut!");

                // Menanyakan apakah pelanggan ingin memesan lagi
                System.out.print("\nApakah Anda ingin memesan lagi? (ya/tidak): ");
                String jawaban = scanner.nextLine().toLowerCase();

                // Menentukan apakah loop akan dilanjutkan
                inginMemesanLagi = jawaban.equals("ya");

            } while (inginMemesanLagi);

            // Pesan penutup setelah keluar dari loop
            System.out.println("\nTerima kasih atas kunjungan Anda!");

            // Menutup scanner
            scanner.close();
        }
    }


