public class MataKuliah05 {

    String kodeMK;
    String nama;
    int sks;
    int jumJam;

    public MataKuliah05() {

    }

    public MataKuliah05(String kodeMK, String nama, int sks, int jumJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumJam = jumJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
        System.out.println();
    }

    void tambahJam(int jam) {
        jumJam += jam;
        System.out.println("Jumlah jam berhasil ditambah. Total jam: " + jumJam);
        System.out.println();
    }

    void kurangJam(int jam) {
        if (jumJam >= jam) {
            jumJam -= jam;
            System.out.println("Jumlah jam berhasil dikurang. Total jam: " + jumJam);
        } else {
            System.out.println("Pengurangan gagal. Jumlah jam tidak mencukupi.");
        }
        System.out.println();
    }
}