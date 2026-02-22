public class MataKuliah20 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // konstruktor default
    public MataKuliah20() {
    }

    // konstruktor berparameter
    public MataKuliah20(String kdMK, String nm, int sks, int jmlJam) {
        kodeMK = kdMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah berubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi!");
        } else {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        }
    }
}