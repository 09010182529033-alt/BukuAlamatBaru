package bukualamatbaru;

public class BukuAlamat {

    private EntryBukuAlamat[] data;
    private int jumlahData;

    public BukuAlamat() {
        data = new EntryBukuAlamat[100];
        jumlahData = 0;
    }

    public void tambahData(EntryBukuAlamat entry) {
        if (jumlahData < 100) {
            data[jumlahData] = entry;
            jumlahData++;

            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Buku alamat sudah penuh.");
        }
    }

    public void hapusData(int index) {
        if (index >= 0 && index < jumlahData) {

            for (int i = index; i < jumlahData - 1; i++) {
                data[i] = data[i + 1];
            }

            data[jumlahData - 1] = null;
            jumlahData--;

            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public void tampilkanData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        System.out.println("===== DAFTAR BUKU ALAMAT =====");

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nama          : " + data[i].getNama());
            System.out.println("Alamat        : " + data[i].getAlamat());
            System.out.println("Nomor Telepon : " + data[i].getNomorTelepon());
            System.out.println("Email         : " + data[i].getEmail());
            System.out.println("------------------------------");
        }
    }

    public void updateData(int index, EntryBukuAlamat entryBaru) {
        if (index >= 0 && index < jumlahData) {
            data[index] = entryBaru;

            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}