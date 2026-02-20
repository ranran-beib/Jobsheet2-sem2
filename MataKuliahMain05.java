public class MataKuliahMain05 {
    public static void main(String[] args) {
        
        MataKuliah05 mk1 = new MataKuliah05();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumJam = 6;
        
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangJam(3);
        mk1.tampilInformasi();

        MataKuliah05 mk2 = new MataKuliah05(
            "IF202",
            "Basis Data",
            3,
            5
        );

        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangJam(10);
        mk2.tampilInformasi();
    }
}