public class DataDosen06 {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    public void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    int pencarianDataSequential06(String nama) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu hasil untuk nama \"" + nama + "\".");
        }
        return count;
    }

    int pencarianDataBinary06(int cari) {
        int left = 0, right = idx - 1, mid;
        int count = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (dataDosen[mid].usia == cari) {
                for (int i = mid; i >= 0 && dataDosen[i].usia == cari; i--) {
                    dataDosen[i].tampil();
                    count++;
                }
                for (int i = mid + 1; i < idx && dataDosen[i].usia == cari; i++) {
                    dataDosen[i].tampil();
                    count++;
                }
                if (count > 1) {
                    System.out.println("Peringatan: Ditemukan lebih dari satu hasil untuk usia " + cari);
                }
                return count;
            } else if (dataDosen[mid].usia > cari) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Data tidak ditemukan.");
        return -1;
    }
}
