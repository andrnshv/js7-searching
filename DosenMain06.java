import java.util.Scanner;

public class DosenMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen06 data = new DataDosen06();
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Cari Dosen berdasarkan Nama (Sequential Search)");
            System.out.println("4. Cari Dosen berdasarkan Usia (Binary Search)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                if (data.idx >= 10) {
                    System.out.println("Data sudah penuh!");
                } else {
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Masukkan Usia Dosen: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen dsn = new Dosen(kode, nama, jenisKelamin, usia);
                    data.tambah(dsn);
                }
            } else if (pilih == 2) {
                System.out.println("\nData Dosen:");
                data.tampil();
            } else if (pilih == 3) {
                System.out.print("\nMasukkan nama dosen yang dicari: ");
                String namaCari = sc.nextLine();
                System.out.println("\nHasil pencarian nama:");
                int hasilNama = data.pencarianDataSequential06(namaCari);
                if (hasilNama == 0) {
                    System.out.println("Dosen dengan nama \"" + namaCari + "\" tidak ditemukan.");
                }
            } else if (pilih == 4) {
                System.out.print("\nMasukkan usia dosen yang dicari: ");
                int usiaCari = sc.nextInt();
                System.out.println("\nHasil pencarian usia:");
                int hasilUsia = data.pencarianDataBinary06(usiaCari);
                if (hasilUsia == -1) {
                    System.out.println("Dosen dengan usia " + usiaCari + " tidak ditemukan.");
                }
            } else if (pilih == 5) {
                System.out.println("Keluar dari program...");
                running = false;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
        sc.close();
    }
}
