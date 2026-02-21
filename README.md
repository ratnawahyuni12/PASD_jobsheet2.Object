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