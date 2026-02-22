public class Dosen20 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // konstruktor default
    public Dosen20() {
    }

    // konstruktor berparameter
    public Dosen20(String id, String nm, boolean statusAktif, int tahun, String ahli) {
        idDosen = id;
        nama = nm;
        this.statusAktif = statusAktif;
        tahunBergabung = tahun;
        bidangKeahlian = ahli;
    }

    void tampilInformasi() {
        System.out.println("Id Dosen         : " + idDosen);
        System.out.println("Nama Dosen       : " + nama);
        System.out.println("Status Penugasan : " + statusAktif);
        System.out.println("Tahun Bergabung  : " + tahunBergabung);
        System.out.println("Bidang Keahlian  : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif) {
            System.out.println(nama + " berstatus aktif.");
        } else {
            System.out.println(nama + " berstatus tidak aktif.");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}