import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();

        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input.nextLine();
            System.out.print("Nama  : ");
            String nama = input.nextLine();
            System.out.print("Kelas : ");
            String kelas = input.nextLine();
            System.out.print("IPK   : ");
            double ipk = input.nextDouble();
            input.nextLine();

            Mahasiswa06 m = new Mahasiswa06(nim, nama, kelas, ipk);
            list.tambah(m);
        }

            list.tampil();
            //melakukan pencarian data sequential
            list.tampil();
            System.out.println("-------------------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("-------------------------------------------------");
            System.out.println("masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = input.nextDouble();

            System.out.println("menggunakan sequential searching");
            double posisi = list.sequentialSearching(cari);
            int pss = (int)posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss);

            /* input.nextLine(); */
            /* if (jumlah > 50) {
            System.out.println("Maksimal hanya bisa memasukkan 50 mahasiswa.");
            return;
            } */

            /* System.out.print("Masukkan jumlah mahasiswa (max 50): ");
            int jumlah = input.nextInt(); */

            /* System.out.println("\nData Mahasiswa Sebelum Sorting:"); */

            /*  list.bubbleSort();
            System.out.println("\nData Mahasiswa Setelah Sorting Berdasarkan IPK (DESC):");
            list.tampil(); */

            /* System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC):");
            list.selectionSort();
            list.tampil();

            System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC):");
            list.InsertionSort();
            list.tampil(); */
    }
}