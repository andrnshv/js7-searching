import java.util.Scanner;

public class MahasiswaDemo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06();
        System.out.print("Masukkan jumlah mahasiswa (max 50): ");
        int jumMhs = input.nextInt();
        input.nextLine();

        if (jumMhs > 50) {
            System.out.println("Maksimal hanya bisa memasukkan 50 mahasiswa.");
            return;
        }

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
            /* //melakukan pencarian data sequential
            list.tampil();
            System.out.println("-------------------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("-------------------------------------------------");
            System.out.println("masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = input.nextDouble();=
            System.out.println("menggunakan sequential searching");
            double posisi = list.sequentialSearching(cari);
            int pss = (int)posisi;
            list.tampilPosisi(cari, pss);
            list.tampilDataSearch(cari, pss); */

            //melakukan pencarian data Binary
            System.out.println("------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("------------------------------------");
            System.out.println("masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            double cari = input.nextDouble();
            System.out.println("menggunakan binary search");
            double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
            int pss2 = (int)posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);
    }
}