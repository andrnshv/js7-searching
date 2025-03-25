import java.util.Scanner;

public class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    public void tampil() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia        : " + usia);
        System.out.println("---------------------------");
    }
}
