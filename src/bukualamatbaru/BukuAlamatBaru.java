package bukualamatbaru;

public class BukuAlamatBaru {

    public static void main(String[] args) {

        BukuAlamat buku = new BukuAlamat();

        // Membuat data pertama
        EntryBukuAlamat data1 = new EntryBukuAlamat(
                "Winda",
                "Jambi",
                "081234567890",
                "winda@gmail.com"
        );

        // Membuat data kedua
        EntryBukuAlamat data2 = new EntryBukuAlamat(
                "Siti",
                "Palembang",
                "082345678901",
                "siti@gmail.com"
        );

        // 1. Menambahkan data
        buku.tambahData(data1);
        buku.tambahData(data2);

        // 2. Menampilkan semua data
        System.out.println("\nDATA AWAL:");
        buku.tampilkanData();

        // 3. Update data pertama
        EntryBukuAlamat dataBaru = new EntryBukuAlamat(
                "Winda",
                "Kota Jambi",
                "081234567890",
                "winda123@gmail.com"
        );

        buku.updateData(0, dataBaru);

        System.out.println("\nSETELAH DATA DIUPDATE:");
        buku.tampilkanData();

        // 4. Menghapus data kedua
        buku.hapusData(1);

        System.out.println("\nSETELAH DATA DIHAPUS:");
        buku.tampilkanData();
    }
}