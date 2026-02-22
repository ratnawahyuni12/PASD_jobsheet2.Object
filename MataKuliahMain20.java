public class MataKuliahMain20 {
    public static void main(String[] args) {

        // objek 1 - konstruktor default - tampil informasi
        MataKuliah20 mk1 = new MataKuliah20();
        System.out.println("===- Mata Kuliah 1: Kewarganegaraan -===");
        mk1.kodeMK = "SIB252001";
        mk1.nama = "Kewarganegaraan";
        mk1.sks = 2;
        mk1.jumlahJam = 2;

        mk1.tampilInformasi();
        System.out.println();

        // objek 2 - konstruktor default - tampil informasi + ubah SKS
        MataKuliah20 mk2 = new MataKuliah20();
        System.out.println("===- Mata Kuliah 2: Analisis Proses Bisnis -===");
        mk2.kodeMK = "SIB252002";
        mk2.nama = "Analisis Proses Bisnis";
        mk2.sks = 2;
        mk2.jumlahJam = 4;

        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tampilInformasi();
        System.out.println();

        // objek 3 - konstruktor default - tampil informasi + ubah SKS + tambah jam
        MataKuliah20 mk3 = new MataKuliah20();
        System.out.println("===- Mata Kuliah 3: Pengenalan Sistem Informasi -===");
        mk3.kodeMK = "SIB252003";
        mk3.nama = "Pengenalan Sistem Informasi";
        mk3.sks = 2;
        mk3.jumlahJam = 4;

        mk3.tampilInformasi();
        mk3.ubahSKS(3);
        mk3.tambahJam(2);
        mk3.tampilInformasi();
        System.out.println();

        // objek 4 - konstruktor default - tampil informasi + ubah SKS + tambah jam + kurangi jam
        MataKuliah20 mk4 = new MataKuliah20();
        System.out.println("===- Mata Kuliah 4: Algoritma dan Struktur Data -===");
        mk4.kodeMK = "SIB252004";
        mk4.nama = "Algoritma dan Struktur Data";
        mk4.sks = 2;
        mk4.jumlahJam = 4;

        mk4.tampilInformasi();
        mk4.ubahSKS(3);
        mk4.tambahJam(2);
        mk4.kurangiJam(4);
        mk4.tampilInformasi();
        System.out.println();

        // objek 5 - konstruktor berparameter - tampil informasi
        System.out.println("===- Mata Kuliah 5: Praktikum Algoritma dan Struktur Data -===");
        MataKuliah20 mk5 = new MataKuliah20("SIB252005", "Praktikum Algoritma dan Struktur Data", 2, 6);
        mk5.tampilInformasi();
        System.out.println();

        // objek 6 - konstruktor berparameter - tampil informasi + ubah SKS
        System.out.println("===- Mata Kuliah 6: Basis Data -===");
        MataKuliah20 mk6 = new MataKuliah20("SIB252006", "Basis Data", 2, 4);
        mk6.tampilInformasi();
        mk6.ubahSKS(3);
        mk6.tampilInformasi();
        System.out.println();

        // objek 7 - konstruktor berparameter - tampil informasi + ubah SKS + tambah jam
        System.out.println("===- Mata Kuliah 7: Praktikum Basis Data -===");
        MataKuliah20 mk7 = new MataKuliah20("SIB252007", "Praktikum Basis Data", 2, 6);
        mk7.tampilInformasi();
        mk7.ubahSKS(3);
        mk7.tambahJam(2);
        mk7.tampilInformasi();
        System.out.println();

        // objek 8 - konstruktor berparameter - tampil informasi + ubah SKS + tambah jam + kurangi jam
        System.out.println("===- Mata Kuliah 8: Matematika Lanjut -===");
        MataKuliah20 mk8 = new MataKuliah20("SIB252008", "Matematika Lanjut", 2, 4);
        mk8.tampilInformasi();
        mk8.ubahSKS(3);
        mk8.tambahJam(2);
        mk8.kurangiJam(4);
        mk8.tampilInformasi();
        System.out.println();

        // objek 9 - konstruktor berparameter - tampil informasi + kurangi jam
        System.out.println("===- Mata Kuliah 9: Sistem Informasi -===");
        MataKuliah20 mk9 = new MataKuliah20("SIB252009", "Sistem Informasi", 2, 4);
        mk9.tampilInformasi();
        mk9.kurangiJam(6);
        mk9.tampilInformasi();
        System.out.println();
    }
}