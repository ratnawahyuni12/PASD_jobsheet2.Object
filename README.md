# PASD_jobsheet2.Object

Pertanyaan Percobaan 1: Deklarasi Class, Atribut dan Method
1. Sebutkan dua karakteristik class atau object!
jawaban: class dan object merupakan dua hal yang berbeda, namun saling berkaitan sehingga tidak bisa disamakan. kaitan antara class dan object adalah setiap object pasti berawal dari sebuah rancangan/desain/template class yang prosesnya disebut dengan instansisasi. jadi, object tidak akan ada jika tidak ada class dan class tidak akan bisa digunakan  jika belum dibuat objectnya. dua karakteristik class yaitu berupa rancangan/template/desain/blueprint dan bersifat umum seperti mahasiswa, dosen, mata kuliah. dua karakteristik object yaitu berupa objek nyata yang sudah dibentuk dari suatu class dan bersifat spesifik seperti mahasiswa1, mahasiswa2, dosen A, dosen B, mata kuliah sistem operasi, dll.
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
jawaban: class Mahasiswa memiliki 4 atribut, yaitu nim, nama, kelas, dan ipk.
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
jawaban: class Mahasiswa memiliki 4 method, yaitu tampilkanInformasi(), ubahKelas(String kelasBaru), updateIPK(double ipkBaru), dan nilaiKinerja(double ipk).
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
jawaban: dalam evaluasi kinerja mahasiswa, method nilaiKinerja() bekerja dengan cara mengecek nilai ipk menggunakan kondisi if-else if-else, lalu mengembalikan String sesuai dengan rentang ipk yang terpenuhi. kriteria yang digunakan dalam menentukan nilai kinerja:
- ipk >= 3.5 || "Kinerja sangat baik"
- ipk >= 3.0 || "Kinerja baik"
- ipk >= 2.0 || "Kinerja cukup"
- ipk < 2.0  || "Kinerja kurang"
yang di-return (dikembalikan) yaitu nilai bertipe String berupa keterangan kinerja mahasiswa sesuai dengan ipk yang dimiliki.

Pertanyaan Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
jawaban: baris kode program yang digunakan untuk proses instansisasi pada class MahasiswaMain yaitu: 
Mahasiswa20 mhs1 = new Mahasiswa20();
nama object yang dihasilkan yaitu mhs1.
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
jawaban: cara mengakses atribut dan method dari suatu objek yaitu dengan menggunakan tanda titik ( . ) setelah nama objek. implementasinya pada kode program class MahasiswaMain20 yaitu:
mhs1.nama = "Muhammad Ali Farhan";
mhs1.tampilkanInformasi();
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
jawaban: karena di antara pemanggilan tampilkanInformasi() pertama dan kedua, terdapat pemanggilan method ubahKelas("SI 2K") dan updateIPK(3.60) yang mengubah nilai atribut kelas dari "SI 2J" menjadi "SI 2K" dan nilai ipk dari 3.55 menjadi 3.60. sehingga ketika tampilkanInformasi() dipanggil kedua kali, data yang ditampilkan sudah berubah.

Pertanyaan Percobaan 3: Membuat Konstruktor
1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
jawaban: baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter adalah:
public Mahasiswa20(String nm, String nim, double ipk, String kls) {
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;
}
2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
Mahasiswa20 mhs2 = new Mahasiswa20("Annisa Nabila", "2541720160", 3.25, "TI 2L"); 
jawaban: baris kode tersebut melakukan instansiasi objek bernama mhs2 dari class Mahasiswa20 menggunakan konstruktor berparameter, dengan langsung mengisi nilai atribut pada saat objek dibuat, yaitu:
- nama = "Annisa Nabila"
- nim = "2541720160"
- ipk = 3.25
- kelas = "TI 2L" 
sehingga objek mhs2 langsung memiliki data tanpa perlu mengisi atribut satu per satu seperti yang dilakukan pada objek mhs1.