public class DosenMain05 {
    public static void main(String[] args) {

        Dosen05 dsn1 = new Dosen05();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Algoritma";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Struktur Data");
        dsn1.tampilInformasi();

        Dosen05 dsn2 = new Dosen05(
            "D002",
            "Siti Aminah",
            true,
            2018,
            "Basis Data"
        );

        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.ubahKeahlian("Data Science");
        dsn2.tampilInformasi();
    }
}