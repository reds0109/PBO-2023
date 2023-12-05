# MY LIBRARY
MY LIBRARY merupakan aplikasi yang mengelola penyimpanan buku dan skripsi para mahasiswa yang lulus. Aplikasi ini memudahkan untuk menyimpan data buku dan skripsi. Selain itu, pada aplikasi ini para mahasiswa aktif bisa meminjam buku dan skripsi yang terdapat pada aplikasi MY LIBRARY ini.

# FEATURES 
1. Fitur login 
2. Dapat menambahkan data buku dan skripsi
3. Dapat melakukan transaksi peminjaman buku dan skripsi
4. Koneksi database menggunakan persistence

# DDL & DML
1. Buat database pada pgAdmin dengan nama "PBO_UAS", lalu buat juga 4 tabel dengan nama "buku", "skripsi", "peminjaman_buku", "peminjaman_skripsi" dengan field masing-masing tabel.

CREATE DATABASE PBO_UAS;

CREATE TABLE Buku (
"isbn" char(5),
"judul" varchar(255),
"kategori" varchar(40),
"pengarang" varchar(50),
"penerbit" varchar(30),
"tahun_terbit" char(4),
"jumlah_halaman" varchar(5),
primary key ("isbn")
);

CREATE TABLE Skripsi (
"id_skripsi" char(5),
"judul" varchar(200),
"pengarang" varchar(50),
"tahun" char(4),
"jumlah_halaman" varchar(5),
primary key ("id_skripsi")
);

CREATE TABLE peminjaman_buku (
"id" char(3),
"nama" varchar(50),
"program_studi" varchar(30),
"angkatan" char(4),
"jumlah_buku" varchar(2),
"kategori" varchar(40),
"tanggal_peminjaman" varchar(20),
"tanggal_pengembalian" varchar(20),
primary key ("id")
);

CREATE TABLE peminjaman_skripsi (
"id" char(3),
"nama" varchar(50),
"program_studi" varchar(30),
"angkatan" char(4),
"jumlah_skripsi" varchar(2),
"tanggal_peminjaman" varchar(20),
"tanggal_pengembalian" varchar(20),
primary key ("id")
);

2. Lalu masukkan data ke dalam masing-masing tabel.

==============================================================

TABEL buku

==============================================================

INSERT INTO buku VALUES (12300,Bahasa Java,Teknologi,Miftha,Gramedia,2015,210);

INSERT INTO buku VALUES (12301,Bahasa Python,Teknologi,Merliana,Airlangga,2014,243);

INSERT INTO buku VALUES (12302,Bahasa PHP,Teknologi,Laily,Gramedia,2016,254);

INSERT INTO buku VALUES (12303,Bahasa c++,Teknologi,Jingga,Bukunesia,2013,234);

INSERT INTO buku VALUES (12304,Pemrograman Dasar,Teknologi,Kartika,Airlangga,2019,210);

INSERT INTO buku VALUES (12305,Pemrograman Lanjutan,Teknologi,Dhamar,Bukunesia,2017,246);

INSERT INTO buku VALUES (12306,Rekayasa Perangkat Lunak,Teknologi,Devira,Airlangga,2018,257);

INSERT INTO buku VALUES (12307,Basis Data,Teknologi,Devina,Gramedia,2014,289);

INSERT INTO buku VALUES (12308,Basis Data Lanjut,Teknologi,Cut,Gramedia,2016,278);

INSERT INTO buku VALUES (12309,Matematika Dasar,Sains,Chanda,Bukunesia,2015,215);

INSERT INTO buku VALUES (12310,Sistem Organ Manusia,Sains,Isnainia,Airlangga,2018,200);

INSERT INTO buku VALUES (12311,Mengenal Bahasa Jerman,Bahasa,Arifia,Airlangga,2020,210);

INSERT INTO buku VALUES (12312,Bahasa Korea Dasar,Bahasa,Andy,Bukunesia,2020,210);

INSERT INTO buku VALUES (12313,Seputar Bahasa Jepang,Bahasa,Alif,Gramedia,2022,220);

INSERT INTO buku VALUES (12314,Bahasa Inggris Bahasa Internasional,Bahasa,Alfi,Airlangga,2018,200);

INSERT INTO buku VALUES (12315,Menggali Bahasa Arab,Bahasa,Aisyah,Gramedia,2021,200);

INSERT INTO buku VALUES (12316,Memahami Bahasa Mandarin,Bahasa,Ica,Airlangga,2015,210);

INSERT INTO buku VALUES (12317,Ilmu Sosial Manusia,Ilmu Sosial,Agung,Bukunesia,2017,220);

INSERT INTO buku VALUES (12318,Arsitektur Dasar,Arsitektur,Syarifuddin,Bukunesia,2018,230);

INSERT INTO buku VALUES (12319,Anatomi Tubuh Manusia,Sains,Tanty,Gramedia,2019,210);

INSERT INTO buku VALUES (12320,Tumbuh Kembang Makhluk Hidup,Sains,Arimbie,Bukunesia,2021,268);

INSERT INTO buku VALUES (12321,Sistem Kerja Paru-Paru,Sains,Syahrul,Airlangga,2022,245);

INSERT INTO buku VALUES (12322,Sistem Kerja Jantung,Sains,Rara,Gramedia,2020,312);

INSERT INTO buku VALUES (12323,Sistem Kerja Otak,Sains,Ilham,Airlangga,2018,297);

INSERT INTO buku VALUES (12324,Sistem Ekskresi,Sains,Rifky,Airlangga,2016,267);

INSERT INTO buku VALUES (12325,Sistem Peredaran Darah,Sains,Yayuk,Bukunesia,2016,234);

INSERT INTO buku VALUES (12326,Sistem Gerak,Sains,Endang,Gramedia,2013,244);

INSERT INTO buku VALUES (12327,Sistem Imun,Sains,Delfi,Bukunesia,2019,224);

INSERT INTO buku VALUES (12328,Sistem Saraf,Sains,Henni,Airlangga,2020,235);

INSERT INTO buku VALUES (12329,Sistem Pencernaan,Sains,Arif,Bukunesia,2022,230);

INSERT INTO buku VALUES (12330,Sistem Pernapasan,Sains,Fadilatin,Airlangga,2015,250);

INSERT INTO buku VALUES (12331,Sistem Informasi Manajemen,Teknologi,Martin,Gramedia,2021,295);

INSERT INTO buku VALUES (12332,Sistem Informasi Akuntansi,Teknologi,Firza,Bukunesia,2016,199);

INSERT INTO buku VALUES (12333,Sistem Informasi Kepegawaian,Teknologi,Dzulkifli,Gramedia,2019,200);

INSERT INTO buku VALUES (12334,Manajemen dan Organisasi,Teknologi,Kiki,Bukunesia,2017,210);

INSERT INTO buku VALUES (12335,Manajemen Sistem Informasi,Teknologi,Faiz,Gramedia,2015,220);

INSERT INTO buku VALUES (12336,Dasar-Dasar Sistem Informasi,Teknologi,Kaka,Gramedia,2014,230);

INSERT INTO buku VALUES (12337,Memanfaatkan Teknologi Informasi dalam Bisnis,Teknologi,Yoga,Airlangga,2019,240);

INSERT INTO buku VALUES (12338,Analisis dan Perancangan Sistem Informasi,Teknologi,Firman,Airlangga,2018,260);

INSERT INTO buku VALUES (12339,Implementasi Sistem Informasi,Teknologi,Ratna,Gramedia,2017,280);

INSERT INTO buku VALUES (12340,Sistem Informasi Manajemen: Teori dan Praktek di Era Digital,Teknologi,Rizma,Bukunesia,2014,250);

INSERT INTO buku VALUES (12341,Sistem Pendukung Keputusan,Teknologi,Bella,Gramedia,2021,295);

INSERT INTO buku VALUES (12342,Manajemen Strategis Teknologi Informasi,Teknologi,Salsa,Bukunesia,2016,249);

INSERT INTO buku VALUES (12343,Pemrograman Basis Data dengan SQL Server,Teknologi,Sabrina,Gramedia,2019,200);

INSERT INTO buku VALUES (12344,Strategi Bisnis Digital: Cara Menggunakan Teknologi Informasi untuk Mencapai Keunggulan Bersaing,Teknologi,Ayu,Bukunesia,2017,210);

INSERT INTO buku VALUES (12345,Information Systems Management in Practice,Teknologi,Tsabitah,Gramedia,2015,220);

INSERT INTO buku VALUES (12346,Analisis dan Perancangan Sistem Informasi,Teknologi,Eka,Gramedia,2014,230);

INSERT INTO buku VALUES (12347,Pengantar Sistem Informasi: Pendekatan Bisnis dan Manajemen,Teknologi,Yudha,Airlangga,2019,240);

INSERT INTO buku VALUES (12348,Sistem Informasi Manajemen: Teori dan Aplikasi Bisnis,Teknologi,Feni,Airlangga,2018,260);

INSERT INTO buku VALUES (12349,Perancangan Basis Data,Teknologi,Fitriya,Gramedia,2017,280);

INSERT INTO buku VALUES (12350,Rekayasa Perangkat Lunak: Pendekatan Praktis,Teknologi,Egty,Bukunesia,2014,250);

INSERT INTO buku VALUES (12351,Teknologi Virtual Reality,Teknologi,Adhinata,Gramedia,2021,295);

INSERT INTO buku VALUES (12352,Digital Creative,Teknologi,Ivan,Bukunesia,2016,199);

INSERT INTO buku VALUES (12353,E Goverment,Teknologi,Dhiksa,Gramedia,2019,200);

INSERT INTO buku VALUES (12354,Socio Informatics,Teknologi,Anggun,Bukunesia,2017,210);

INSERT INTO buku VALUES (12355,Deep Learning,Teknologi,Tiara,Gramedia,2015,220);

INSERT INTO buku VALUES (12356,Sistem Temu Kembali Informasi,Teknologi,Audrey,Gramedia,2014,230);

INSERT INTO buku VALUES (12357,Data Mining,Teknologi,Chandra,Airlangga,2019,240);

INSERT INTO buku VALUES (12358,Digital Forensik,Teknologi,Billy,Airlangga,2018,260);

INSERT INTO buku VALUES (12359,Business Intelligent,Teknologi,Ellis,Gramedia,2017,280);

INSERT INTO buku VALUES (12361,Teknologi Informasi dan Sistem Informasi: Pengenalan Dasar,Teknologi,Agus,Gramedia,2021,295);

INSERT INTO buku VALUES (12362,Pemodelan dan Desain Sistem Berorientasi Objek,Teknologi,Defi,Bukunesia,2016,199);

INSERT INTO buku VALUES (12363,Keamanan Komputer: Teknik dan Aplikasinya,Teknologi,Agustina,Gramedia,2019,200);

INSERT INTO buku VALUES (12364,Hacking,Teknologi,Aulia,Bukunesia,2017,210);

INSERT INTO buku VALUES (12365,Keamanan Komputer,Teknologi,Oryza,Gramedia,2015,220);

INSERT INTO buku VALUES (12366,Manajemen Keamanan Informasi,Teknologi,Arel,Gramedia,2014,230);

INSERT INTO buku VALUES (12367,Manajemen Teknologi Informasi,Teknologi,Ailsa,Airlangga,2019,240);

INSERT INTO buku VALUES (12368,IT Governance: Mengelola Sistem Informasi untuk Mencapai Strategi Bisnis,Teknologi,Caca,Airlangga,2018,260);

INSERT INTO buku VALUES (12369,Strategi Bisnis Teknologi Informasi,Teknologi,Faizah,Gramedia,2017,280);

INSERT INTO buku VALUES (12370,E-Business: Strategi Bisnis untuk Perdagangan Elektronik,Teknologi,Endah,Bukunesia,2014,250);

INSERT INTO buku VALUES (12371,Strategi Digital: Transformasi Bisnis dalam Era Digital,Teknologi,Dhita,Gramedia,2021,295);

INSERT INTO buku VALUES (12372,Transformasi Digital: Menata Bisnis di Era Teknologi,Teknologi,Alifia,Bukunesia,2016,199);

INSERT INTO buku VALUES (12373,Big Data: Panduan Lengkap untuk Membangun Dunia dengan Data,Teknologi,Affandah,Gramedia,2019,200);

INSERT INTO buku VALUES (12374,Data Science untuk Pemula,Teknologi,Rozan,Bukunesia,2017,210);

INSERT INTO buku VALUES (12375,Analisis Data Bisnis: Pendekatan Praktis,Teknologi,Fauzan,Gramedia,2015,220);

INSERT INTO buku VALUES (12376,Internet of Things (IoT): Masa Depan yang Terhubung,Teknologi,Bagas,Gramedia,Airlangga,2014,230);

INSERT INTO buku VALUES (12377,Pengantar Keamanan Sistem Informasi,Teknologi,Ananta,Airlangga,2019,240);

INSERT INTO buku VALUES (12378,Sistem Pendukung Keputusan dan Kecerdasan Bisnis,Teknologi,Lina,Airlangga,2018,260);

INSERT INTO buku VALUES (12379,Management Information Systems: Managing the Digital Firm,Teknologi,Putra,Gramedia,2017,280);

INSERT INTO buku VALUES (12380,Information Systems: A Manager's Guide to Harnessing Technology,Teknologi,Dewa,Bukunesia,2014,250);

INSERT INTO buku VALUES (12381,Essentials of MIS,Teknologi,Dewi,Gramedia,2021,295);

INSERT INTO buku VALUES (12382,Information Technology for Management: Digital Strategies for Insight,Teknologi,Andrea,Bukunesia,2016,199);

INSERT INTO buku VALUES (12383,Introduction to Information Systems: Supporting and Transforming Business,Teknologi,Ummul,Gramedia,2019,200);

INSERT INTO buku VALUES (12384,Manajemen Proses Bisnis,Teknologi,Eva,Bukunesia,2017,210);

INSERT INTO buku VALUES (12385,Mobile Programming,Teknologi,Rahma,Gramedia,2015,220);

INSERT INTO buku VALUES (12386,Web Programming,Teknologi,Belva,Gramedia,2014,230);

INSERT INTO buku VALUES (12387,Artificial Intelligent,Teknologi,Graeta,Airlangga,2019,240);

INSERT INTO buku VALUES (12388,Visualisasi Data,Teknologi,Naufal,Airlangga,2018,260);

INSERT INTO buku VALUES (12389,e-Business,Teknologi,Bima,Gramedia,2017,280);

INSERT INTO buku VALUES (12390,Tata Kelola IT,Teknologi,Yudhistira,Bukunesia,2014,250);

INSERT INTO buku VALUES (12391,Software Quality Assurance,Teknologi,Arjuna,Gramedia,2021,295);

INSERT INTO buku VALUES (12392,Enterprise Architect,Teknologi,Nakula,Bukunesia,2016,199);

INSERT INTO buku VALUES (12393,Metodologi Penelitian,Teknologi,Sadewa,Gramedia,2019,200);

INSERT INTO buku VALUES (12394,Manajemen Resiko,Teknologi,Jessica,Bukunesia,2017,210);

INSERT INTO buku VALUES (12395,Big Data Analytics,Teknologi,Sarah,Gramedia,2015,220);

INSERT INTO buku VALUES (12396,Manajemen Layanan IT,Teknologi,Emma,Gramedia,2014,230);

INSERT INTO buku VALUES (12397,Manajemen Proyek,Teknologi,Syakila,Airlangga,2019,240);

INSERT INTO buku VALUES (12398,Knowledge Management,Teknologi,Rico,Airlangga,2018,260);

INSERT INTO buku VALUES (12399,System Analysis and Design,Teknologi,Mirza,Gramedia,2017,280);

INSERT INTO buku VALUES (12400,Sociopreneurship,Teknologi,Febri,Bukunesia,2014,250);

INSERT INTO buku VALUES (12401,Cloud Computing,Teknologi,Azka,Bukunesia,2014,250);

==============================================================

TABEL skripsi

==============================================================

INSERT INTO skripsi VALUES (09010,Implementasi Teknologi Blockchain dalam Sistem Manajemen Hak Cipta,Fitriya,2016,20);

INSERT INTO skripsi VALUES (09011,Pengembangan Aplikasi Sistem Informasi Manajemen Risiko pada Perusahaan Asuransi,Aulia,2016,19);

INSERT INTO skripsi VALUES (09012,Analisis Kinerja Sistem Informasi Keuangan pada Lembaga Keuangan Mikro dengan Pendekatan Balanced Scorecard,Agustina,2016,22);

INSERT INTO skripsi VALUES (09013,Analisis Kinerja Sistem Informasi Manajemen Pergudangan dengan Pendekatan Big Data Analytics,Burhan,2017,25);

INSERT INTO skripsi VALUES (09014,Pengembangan Aplikasi Mobile untuk Meningkatkan Efisiensi Proses Inventarisasi Barang pada Perusahaan Retail,Rudiawan,2017,26);

INSERT INTO skripsi VALUES (09015,Perancangan Sistem Informasi Penjadwalan Otomatis Berbasis AI (Artificial Intelligence),Miftakhul J,2019,30);

INSERT INTO skripsi VALUES (09016,Perancangan Sistem Informasi Manajemen Logistik pada Perusahaan Distribusi Barang,Tri Ayu Dhea,2019,31);

INSERT INTO skripsi VALUES (09017,Pengembangan Aplikasi Mobile untuk Pemesanan dan Pengiriman Makanan Berbasis Lokasi,Jihan Dzakira,2020,35);

INSERT INTO skripsi VALUES (09018,Perancangan Sistem Informasi Pengelolaan Parkir Berbasis IoT (Internet of Things),Widyasari,2018,25);

INSERT INTO skripsi VALUES (09019,Pengembangan Aplikasi Pemesanan Tiket Online Berbasis Pintar Menggunakan Algoritma Machine Learning,Citra,2018,23);

INSERT INTO skripsi VALUES (09020,Perancangan Sistem Informasi Penerimaan dan Pendistribusian Donasi pada Organisasi Kemanusiaan,Meidina,2019,27);

INSERT INTO skripsi VALUES (09021,Implementasi Sistem Informasi Geografis dalam Pemetaan Potensi Wisata Daerah,Budiman,2019,22);

INSERT INTO skripsi VALUES (09022,Analisis Penggunaan Teknologi Cloud Computing dalam Pengelolaan Data Pasien di Rumah Sakit,Roni,2020,25);

INSERT INTO skripsi VALUES (09023,Pengembangan Aplikasi E-learning dengan Integrasi Sistem Video Conference untuk Proses Pembelajaran Jarak Jauh,Sandi S,2017,26);

INSERT INTO skripsi VALUES (09024,Analisis Penggunaan Teknologi Blockchain dalam Sistem Keuangan dan Perbankan,Reva,2020,21);

INSERT INTO skripsi VALUES (09025,Perancangan Sistem Informasi Manajemen Persediaan Barang dengan Metode Just-in-Time (JIT),Jooan,2021,22);

INSERT INTO skripsi VALUES (09026,Pengembangan Aplikasi Sistem Pendukung Keputusan untuk Analisis Sentimen Pelanggan pada Media Sosial,Cein,2021,28);

INSERT INTO skripsi VALUES (09027,Analisis Kinerja Sistem Informasi Manajemen Kepegawaian dengan Pendekatan Data Mining,Danis,2022,25);

INSERT INTO skripsi VALUES (09028,Perancangan Sistem Informasi Pemesanan dan Pengelolaan Bahan Baku pada Industri Makanan dan Minuman,Haru,2021,23);

INSERT INTO skripsi VALUES (09029,Implementasi Teknologi IoT dalam Monitoring dan Kontrol Kualitas Udara di Perkotaan,Hwan,2021,24);

INSERT INTO skripsi VALUES (09030,Pengembangan Aplikasi Mobile untuk Pemesanan dan Pembayaran Tiket Transportasi Umum Berbasis NFC (Near Field Communication),JK,2022,25);

INSERT INTO skripsi VALUES (09031,Analisis Penggunaan Teknologi Big Data dalam Peningkatan Keamanan Data Perusahaan,Heri,2018,23);

INSERT INTO skripsi VALUES (09032,Perancangan Sistem Informasi Manajemen Proyek Konstruksi dengan Metode Agile,Rani,2021,25);

INSERT INTO skripsi VALUES (09033,Pengembangan Aplikasi Sistem Informasi Kesehatan untuk Deteksi Dini Penyakit Berbasis Data Pasien,Widi,2019,26);

INSERT INTO skripsi VALUES (09034,Analisis Kinerja Sistem Informasi Akademik pada Perguruan Tinggi dengan Pendekatan Data Envelopment Analysis,Diva,2022,21);

INSERT INTO skripsi VALUES (09035,Perancangan Sistem Informasi Manajemen Logistik pada Perusahaan Distribusi Barang,Yichan,2022,22);

INSERT INTO skripsi VALUES (09036,Analisis Penggunaan Teknologi Augmented Reality dalam Pembelajaran Interaktif,Eungyeol,2020,28);

INSERT INTO skripsi VALUES (09037,Perancangan Sistem Informasi Penjualan dan Analisis Permintaan Pelanggan pada Industri Ritel,Eunyu,2018,25);

INSERT INTO skripsi VALUES (09038,Implementasi Teknologi Blockchain dalam Sistem Manajemen Hak Cipta,Cheonga,2019,23);

INSERT INTO skripsi VALUES (09039,Pengembangan Aplikasi Sistem Informasi Manajemen Risiko pada Perusahaan Asuransi,Santi,2022,24);

INSERT INTO skripsi VALUES (09040,Analisis Kinerja Sistem Informasi Keuangan pada Lembaga Keuangan Mikro dengan Pendekatan Balanced Scorecard,Aspiah,2021,25);

INSERT INTO skripsi VALUES (09041,Perancangan Sistem Informasi Pengelolaan Data Alumni pada Perguruan Tinggi,Zeha,2020,23);

INSERT INTO skripsi VALUES (09042,Pengembangan Aplikasi Mobile untuk Monitoring dan Kontrol Konsumsi Energi Listrik di Rumah Tangga,Hosu,2016,28);

INSERT INTO skripsi VALUES (09043,Analisis Penggunaan Teknologi Internet of Things dalam Sistem Monitoring Lingkungan Hidup,Dogeon,2017,24);

INSERT INTO skripsi VALUES (09044,Perancangan Sistem Informasi Manajemen Penjualan pada Industri E-commerce,Changjun,2020,27);

INSERT INTO skripsi VALUES (09045,Pengembangan Aplikasi Sistem Informasi Kesehatan untuk Deteksi Dini Penyakit Menular,V,2022,22);

INSERT INTO skripsi VALUES (09046,Analisis Kinerja Sistem Informasi Manajemen Persediaan dengan Metode ABC (Activity-Based Costing),Icha,2018,23);

INSERT INTO skripsi VALUES (09047,Perancangan Sistem Informasi Penjadwalan dan Manajemen Transportasi pada Perusahaan Logistik,Hana,2021,25);

INSERT INTO skripsi VALUES (09048,Implementasi Teknologi Artificial Intelligence dalam Deteksi Penipuan Kartu Kredit,Windy,2019,26);

INSERT INTO skripsi VALUES (09049,Pengembangan Aplikasi Mobile untuk Monitoring dan Kontrol Suhu Ruangan Berbasis IoT,Chaelies,2022,21);

INSERT INTO skripsi VALUES (09050,Analisis Penggunaan Teknologi Big Data dalam Sistem Informasi Pemasaran,Swita,2022,22);

INSERT INTO skripsi VALUES (09051,Perancangan Sistem Informasi Manajemen Penyimpanan Data pada Cloud Computing,Putri,2020,28);

INSERT INTO skripsi VALUES (09052,Pengembangan Aplikasi Sistem Informasi Keuangan untuk Manajemen Keuangan Pribadi,Kharisma,2018,25);

INSERT INTO skripsi VALUES (09053,Analisis Kinerja Sistem Informasi Manajemen Pelanggan pada Perusahaan Telekomunikasi dengan Pendekatan CRM (Customer Relationship Management),Bahrul,2019,23);

INSERT INTO skripsi VALUES (09054,Perancangan Sistem Informasi Penyewaan Kendaraan pada Perusahaan Rental Mobil,Sandi,2022,24);

INSERT INTO skripsi VALUES (09055,Pengembangan Aplikasi Mobile untuk Pemesanan dan Pembayaran Tiket Acara Musik Berbasis QR Code,Galang,2021,25);

INSERT INTO skripsi VALUES (09056,Analisis Penggunaan Teknologi Augmented Reality dalam Pemasaran Produk,Daniel,2020,23);

INSERT INTO skripsi VALUES (09057,Perancangan Sistem Informasi Manajemen Proses Produksi pada Industri Manufaktur,Ari,2016,28);

INSERT INTO skripsi VALUES (09058,Implementasi Teknologi Blockchain dalam Sistem Keamanan Dokumen Digital,Amirul,2017,24);

INSERT INTO skripsi VALUES (09059,Pengembangan Aplikasi Sistem Informasi Kesehatan untuk Monitoring dan Analisis Kondisi Kesehatan Pasien Jantung,Safira,2020,27);

INSERT INTO skripsi VALUES (09060,Analisis Kinerja Sistem Informasi Manajemen Keuangan pada Organisasi Nirlaba dengan Pendekatan ROI (Return on Investment),Dani,2022,22);

INSERT INTO skripsi VALUES (09061,Perancangan Sistem Informasi Pengelolaan Dana Investasi pada Perusahaan Keuangan,Arya,2021,25);

INSERT INTO skripsi VALUES (09062,Pengembangan Aplikasi Mobile untuk Manajemen Jadwal dan Catatan Pribadi,Rio,2019,26);

INSERT INTO skripsi VALUES (09063,Analisis Perbandingan Basis Data SQL dan NoSQL dalam Penyimpanan Data Big Data,Ilham,2018,23);

INSERT INTO skripsi VALUES (09064,Penggunaan Teknologi Big Data untuk Analisis Prediksi Bisnis,Vera,2021,25);

INSERT INTO skripsi VALUES (09065,Manajemen Data Real-Time untuk Aplikasi Internet of Things (IoT),Fitri,2019,26);

INSERT INTO skripsi VALUES (09066,Pengembangan Basis Data Terdistribusi untuk Aplikasi Cloud Computing,Dufan,2022,21);

INSERT INTO skripsi VALUES (09067,Optimasi Kinerja Basis Data dengan Indeks Terdistribusi,Andre,2022,22);

INSERT INTO skripsi VALUES (09068,Integrasi Basis Data SQL dan NoSQL dalam Lingkungan Big Data,Rama,2020,28);

INSERT INTO skripsi VALUES (09069,Analisis Sentimen dalam Data Big Data: Studi Kasus pada Media Sosial,Yahya,2018,25);

INSERT INTO skripsi VALUES (09070,Manajemen Basis Data Terdistribusi untuk Aplikasi Mobile,Handi,2019,23);

INSERT INTO skripsi VALUES (09071,Perancangan dan Implementasi Basis Data Multimodel,Aldi,2022,24);

INSERT INTO skripsi VALUES (09072,Penggunaan Teknologi NoSQL dalam Aplikasi Manajemen Stok,Farhan,2021,25);

INSERT INTO skripsi VALUES (09073,Integrasi Sistem Informasi Bisnis dengan Teknologi Machine Learning,Rendi,2020,23);

INSERT INTO skripsi VALUES (09074,Sistem Informasi E-Commerce: Studi Kasus pada Toko Online,Rizky,2016,28);

INSERT INTO skripsi VALUES (09075,Perancangan dan Pengembangan Dashboard Kinerja Bisnis,Ikmal,2017,24);

INSERT INTO skripsi VALUES (09076,Penggunaan Sistem Informasi Geografis (SIG) dalam Analisis Pasar,Isma,2020,27);

INSERT INTO skripsi VALUES (09077,Sistem Informasi Manajemen Persediaan: Studi Kasus pada Perusahaan Ritel,Nisak,2022,22);

INSERT INTO skripsi VALUES (09078,Analisis Big Data dalam Pengambilan Keputusan Bisnis,Nanda,2021,25);

INSERT INTO skripsi VALUES (09079,Implementasi Sistem Informasi Customer Relationship Management (CRM),Dea,2020,21);

INSERT INTO skripsi VALUES (09080,Perancangan Sistem Informasi untuk Manajemen Proyek,Febrianti,2019,23);

INSERT INTO skripsi VALUES (09081,Sistem Informasi untuk Analisis Rantai Pasokan,Enik,2022,24);

INSERT INTO skripsi VALUES (09082,Pengembangan Sistem Informasi Manajemen untuk Analisis Keuangan Perusahaan,Yesa,2021,25);

INSERT INTO skripsi VALUES (09083,Analisis Kerentanan Aplikasi Web dan Upaya Penetrasi,Adit,2020,23);

INSERT INTO skripsi VALUES (09084,Pengembangan Sistem Keamanan Biometrik,Rhandy,2016,28);

INSERT INTO skripsi VALUES (09085,Manajemen Identitas dan Akses dalam Keamanan Sistem Informasi,Ajeng,2017,24);

INSERT INTO skripsi VALUES (09086,Analisis Forensik Digital dalam Investigasi Keamanan Cyber,Aldy,2020,27);

INSERT INTO skripsi VALUES (09087,Keamanan Cloud Computing: Tantangan dan Solusi,Yolanda,2022,22);

INSERT INTO skripsi VALUES (09088,Implementasi Sistem Keamanan untuk Internet of Things (IoT),Audi,2021,25);

INSERT INTO skripsi VALUES (09089,Analisis Risiko dan Manajemen Keamanan Sistem Informasi,Bion,2020,21);

INSERT INTO skripsi VALUES (09090,Keamanan Data dan Enkripsi dalam Penyimpanan Cloud,Cella,2019,23);

INSERT INTO skripsi VALUES (09091,Studi Kasus tentang Serangan Phishing dan Pencegahannya,Chanin,2022,24);

INSERT INTO skripsi VALUES (09092,Evaluasi dan Peningkatan Keamanan Jaringan Komputer,Chelsy,2021,25);

INSERT INTO skripsi VALUES (09093,Manajemen Data Pasien dalam Sistem Informasi Kesehatan Terintegrasi,Deni,2020,23);

INSERT INTO skripsi VALUES (09094,Analisis Data Kesehatan untuk Prediksi Penyakit,Devina,2016,28);

INSERT INTO skripsi VALUES (09095,Keamanan Data Kesehatan dalam Aplikasi Mobile Health (mHealth),Diajeng,2017,24);

INSERT INTO skripsi VALUES (09096,Implementasi Sistem Informasi Elektronik Kesehatan (EHR),Dimas,2020,27);

INSERT INTO skripsi VALUES (09097,Studi Kasus tentang Sistem Informasi Kesehatan pada Pusat Kesehatan Masyarakat,Evanka,2022,22);

INSERT INTO skripsi VALUES (09098,Penggunaan Teknologi Blockchain dalam Sistem Informasi Kesehatan,Haidar,2021,25);

INSERT INTO skripsi VALUES (09099,Analisis Big Data dalam Riset Kesehatan,Panji,2020,21);

INSERT INTO skripsi VALUES (09100,Pengembangan Aplikasi Telemedicine dan Konsultasi Online,Wildan,2019,23);

INSERT INTO skripsi VALUES (09101,Evaluasi Aplikasi Wearable Health Monitoring,Fahmi,2022,24);

INSERT INTO skripsi VALUES (09102,Pengembangan Aplikasi Sistem Informasi Rumah Sakit,Rangga,2021,25);

INSERT INTO skripsi VALUES (09103,Analisis Data dalam Peningkatan Kualitas Pembelajaran,Nadya,2020,23);

INSERT INTO skripsi VALUES (09104,Integrasi Teknologi dalam Sistem Informasi Pendidikan,Niken,2016,28);

INSERT INTO skripsi VALUES (09105,Implementasi Sistem Informasi Penerimaan Mahasiswa,Nia,2017,24);

INSERT INTO skripsi VALUES (09106,Analisis Penggunaan E-Learning dalam Pendidikan Tinggi,Ima,2020,27);

INSERT INTO skripsi VALUES (09107,Sistem Informasi Evaluasi Kinerja Guru,Lia,2022,22);

INSERT INTO skripsi VALUES (09108,Perancangan Sistem Informasi Perpustakaan Sekolah,Mitha,2021,25);

INSERT INTO skripsi VALUES (09109,Penggunaan Sistem Informasi dalam Manajemen Kurikulum,Rafi,2020,21);

INSERT INTO skripsi VALUES (09110,Sistem Informasi Manajemen Data Mahasiswa,Rafli,2020,21);

==============================================================

TABEL peminjaman_buku

==============================================================

INSERT INTO peminjaman_buku VALUES (001,Bejo,Sistem informasi,2020,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (002,Icha,Arsitektur,2020,1,Arsitektur,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (003,Hana,Sistem informasi,2021,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (004,Rama,Biologi,2022,2,Sains,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (005,Achmad,Biologi,2021,3,Sains,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (006,Alfa,Arsitektur,2020,2,Arsitektur,20 November 2023,24 November 2023);

INSERT INTO peminjaman_buku VALUES (007,Wahyu,Sistem informasi,2021,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (008,Fitri,Biologi,2022,1,Sains,6 November 2023,8 November 2023);

INSERT INTO peminjaman_buku VALUES (009,Raihan,Sastra Jerman,2020,2,Bahasa,6 November 2023,10 November 2023);

INSERT INTO peminjaman_buku VALUES (010,Nur,Sistem informasi,2021,3,Teknologi,6 November 2023,13 November 2023);

INSERT INTO peminjaman_buku VALUES (011,Azizah,Pendidikan Bahasa Inggris,2022,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (012,Siti,Arsitektur,2020,2,Arsitektur,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (013,Nisak,Biologi,2020,2,Sains,6 November 2023,10 November 2023);

INSERT INTO peminjaman_buku VALUES (014,Isma,Sistem informasi,2021,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (015,Chaelies,Pendidikan Bahasa Inggris,2021,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (016,Latifa,Arsitektur,2022,3,Arsitektur,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (017,Azzahra,Sistem informasi,2020,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (018,Dewi,Sistem informasi,2022,1,Teknologi,14 November 2023,16 November 2023);

INSERT INTO peminjaman_buku VALUES (019,Yesa,Arsitektur,2022,2,Arsitektur,6 November 2023,10 November 2023);

INSERT INTO peminjaman_buku VALUES (020,Titan,Sastra Jerman,2022,3,Bahasa,7 November 2023,14 November 2023);

INSERT INTO peminjaman_buku VALUES (021,Wati,Sistem informasi,2021,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (022,Lina,Biologi,2020,2,Sains,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (023,Swita,Sistem informasi,2021,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (024,Windy,Pendidikan Bahasa Inggris,2021,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (025,Rahma,Biologi,2020,2,Sains,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (026,Septi,Sistem informasi,2020,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (027,Putri,Arsitektur,2022,1,Arsitektur,6 November 2023,8 November 2023);

INSERT INTO peminjaman_buku VALUES (028,Kharisma,Sistem informasi,2022,2,Teknologi,20 November 2023,24 November 2023);

INSERT INTO peminjaman_buku VALUES (029,Enik,Biologi,2023,3,Sains,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (030,Rifky,Sistem informasi,2021,2,Teknologi,20 November 2023,24 November 2023);

INSERT INTO peminjaman_buku VALUES (031,Rizky,Arsitektur,2020,1,Arsitektur,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (032,Yahya,Sistem informasi,2022,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (033,Fauzi,Sistem informasi,2023,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (034,Najwa,Biologi,2020,2,Sains,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (035,Safira,Sistem informasi,2023,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (036,Bilqis,Arsitektur,2023,2,Arsitektur,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (037,Ari,Sistem informasi,2022,3,Teknologi,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (038,Maulana,Sistem informasi,2020,2,Teknologi,20 November 2023,24 November 2023);

INSERT INTO peminjaman_buku VALUES (039,Malik,Biologi,2021,2,Sains,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (040,Ibrahim,Arsitektur,2020,2,Arsitektur,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (041,Amirul,Sistem informasi,2023,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (042,Dhany,Pendidikan Bahasa Inggris,2021,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (043,Rio,Sistem informasi,2022,2,Teknologi,20 November 2023,24 November 2023);

INSERT INTO peminjaman_buku VALUES (044,Putra,Biologi,2023,1,Sains,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (045,Ilham,Biologi,2020,2,Sains,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (046,Arya,Sistem informasi,2021,3,Teknologi,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (047,Dani,Arsitektur,2021,2,Arsitektur,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (048,Riska,Sistem informasi,2022,3,Teknologi,20 November 2023,27 November 2023);

INSERT INTO peminjaman_buku VALUES (049,Widya,Sistem informasi,2022,2,Teknologi,20 November 2023,24 November 2023);

INSERT INTO peminjaman_buku VALUES (050,Sari,Biologi,2023,1,Sains,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (051,Revalina,Sistem informasi,2023,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (052,Dea,Pendidikan Bahasa Inggris,2020,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (053,Vivi,Biologi,2020,2,Sains,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (054,Daniel,Sistem informasi,2021,3,Teknologi,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (055,Sandi,Pendidikan Bahasa Inggris,2022,2,Bahasa,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (056,Galang,Sistem informasi,2023,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (057,Andre,Biologi,2023,2,Sains,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (058,Farhan,Sistem informasi,2022,2,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (059,Handi,Pendidikan Bahasa Inggris,2021,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (060,Vera,Sistem informasi,2020,2,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (061,Silvi,Sistem informasi,2022,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (062,Danis,Sistem informasi,2020,2,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (063,Sahira,Biologi,2022,2,Sains,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (064,Adit,Sistem informasi,2021,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (065,Rhandy,Sistem informasi,2021,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (066,Ajeng,Pendidikan Bahasa Inggris,2022,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (067,Aldy,Sistem informasi,2023,3,Teknologi,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (068,Yolanda,Biologi,2021,2,Sains,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (069,Audi,Sistem informasi,2022,2,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (070,Bion,Sistem informasi,2022,1,Teknologi,6 November 2023,10 November 2023);

INSERT INTO peminjaman_buku VALUES (071,Cella,Pendidikan Bahasa Inggris,2020,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (072,Chanin,Sistem informasi,2023,2,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (073,Chelsy,Sistem informasi,2020,2,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (074,Deni,Sistem informasi,2022,3,Teknologi,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (075,Devina,Biologi,2021,2,Sains,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (076,Diajeng,Sistem informasi,2023,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (077,Dimas,Pendidikan Bahasa Inggris,2022,1,Bahasa,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (078,Evanka,Sistem informasi,2021,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (079,Haidar,Sistem informasi,2022,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (080,Ima,Sistem informasi,2021,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (081,Adjie,Pendidikan Bahasa Inggris,2021,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (082,Habib,Sastra Jerman,2022,2,Bahasa,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (083,Wildan,Sistem informasi,2020,2,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (084,Rangga,Sastra Jerman,2021,3,Bahasa,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (085,Fahmi,Sistem informasi,2023,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (086,Nadya,Sastra Jerman,2020,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (087,Niken,Sistem informasi,2021,2,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (088,Nia,Sistem informasi,2022,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (089,Isnaini,Sistem informasi,2023,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (090,Amalia,Sastra Jerman,2020,2,Bahasa,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (091,Mitha,Sistem informasi,2022,3,Teknologi,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (092,Rafi,Sastra Jerman,2021,2,Bahasa,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (093,Rafli,Sistem informasi,2020,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (094,Reza,Sistem informasi,2022,1,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (095,Rara,Sastra Jerman,2023,2,Bahasa,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (096,Salma,Sistem informasi,2022,2,Teknologi,13 November 2023,17 November 2023);

INSERT INTO peminjaman_buku VALUES (097,Nadhira,Sastra Jerman,2021,2,Bahasa,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (098,Syahrul,Sistem informasi,2023,2,Teknologi,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_buku VALUES (099,Tanty,Sastra Jerman,2020,3,Bahasa,13 November 2023,20 November 2023);

INSERT INTO peminjaman_buku VALUES (100,Arimbie,Sistem informasi,2021,1,Teknologi,13 November 2023,15 November 2023);

INSERT INTO peminjaman_buku VALUES (101,Emmy,Sistem informasi,2022,2,Teknologi,13 November 2023,17 November 2023);

==============================================================

TABEL peminjaman_skripsi

==============================================================

INSERT INTO peminjaman_skripsi VALUES (001,Bejo,Sistem informasi,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (002,Icha,Arsitektur,2020,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (003,Hana,Sistem informasi,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (004,Rama,Biologi,2022,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (005,Achmad,Biologi,2021,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (006,Alfa,Arsitektur,2020,2,20 November 2023,24 November 2023);

INSERT INTO peminjaman_skripsi VALUES (007,Wahyu,Sistem informasi,2021,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (008,Fitri,Biologi,2022,1,6 November 2023,8 November 2023);

INSERT INTO peminjaman_skripsi VALUES (009,Raihan,Sastra Jerman,2020,2,6 November 2023,10 November 2023);

INSERT INTO peminjaman_skripsi VALUES (010,Nur,Sistem informasi,2021,3,6 November 2023,13 November 2023);

INSERT INTO peminjaman_skripsi VALUES (011,Azizah,Pendidikan Bahasa Inggris,2022,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (012,Siti,Arsitektur,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (013,Nisak,Biologi,2020,2,6 November 2023,10 November 2023);

INSERT INTO peminjaman_skripsi VALUES (014,Isma,Sistem informasi,2021,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (015,Chaelies,Pendidikan Bahasa Inggris,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (016,Latifa,Arsitektur,2022,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (017,Azzahra,Sistem informasi,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (018,Dewi,Sistem informasi,2022,1,14 November 2023,16 November 2023);

INSERT INTO peminjaman_skripsi VALUES (019,Yesa,Arsitektur,2022,2,6 November 2023,10 November 2023);

INSERT INTO peminjaman_skripsi VALUES (020,Titan,Sastra Jerman,2022,3,7 November 2023,14 November 2023);

INSERT INTO peminjaman_skripsi VALUES (021,Wati,Sistem informasi,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (022,Lina,Biologi,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (023,Swita,Sistem informasi,2021,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (024,Windy,Pendidikan Bahasa Inggris,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (025,Rahma,Biologi,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (026,Septi,Sistem informasi,2020,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (027,Putri,Arsitektur,2022,1,6 November 2023,8 November 2023);

INSERT INTO peminjaman_skripsi VALUES (028,Kharisma,Sistem informasi,2022,2,20 November 2023,24 November 2023);

INSERT INTO peminjaman_skripsi VALUES (029,Enik,Biologi,2023,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (030,Rifky,Sistem informasi,2021,2,20 November 2023,24 November 2023);

INSERT INTO peminjaman_skripsi VALUES (031,Rizky,Arsitektur,2020,1,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (032,Yahya,Sistem informasi,2022,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (033,Fauzi,Sistem informasi,2023,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (034,Najwa,Biologi,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (035,Safira,Sistem informasi,2023,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (036,Bilqis,Arsitektur,2023,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (037,Ari,Sistem informasi,2022,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (038,Maulana,Sistem informasi,2020,2,20 November 2023,24 November 2023);

INSERT INTO peminjaman_skripsi VALUES (039,Malik,Biologi,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (040,Ibrahim,Arsitektur,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (041,Amirul,Sistem informasi,2023,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (042,Dhany,Pendidikan Bahasa Inggris,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (043,Rio,Sistem informasi,2022,2,20 November 2023,24 November 2023);

INSERT INTO peminjaman_skripsi VALUES (044,Putra,Biologi,2023,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (045,Ilham,Biologi,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (046,Arya,Sistem informasi,2021,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (047,Dani,Arsitektur,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (048,Riska,Sistem informasi,2022,3,20 November 2023,27 November 2023);

INSERT INTO peminjaman_skripsi VALUES (049,Widya,Sistem informasi,2022,2,20 November 2023,24 November 2023);

INSERT INTO peminjaman_skripsi VALUES (050,Sari,Biologi,2023,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (051,Revalina,Sistem informasi,2023,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (052,Dea,Pendidikan Bahasa Inggris,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (053,Vivi,Biologi,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (054,Daniel,Sistem informasi,2021,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (055,Sandi,Pendidikan Bahasa Inggris,2022,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (056,Galang,Sistem informasi,2023,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (057,Andre,Biologi,2023,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (058,Farhan,Sistem informasi,2022,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (059,Handi,Pendidikan Bahasa Inggris,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (060,Vera,Sistem informasi,2020,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (061,Silvi,Sistem informasi,2022,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (062,Danis,Sistem informasi,2020,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (063,Sahira,Biologi,2022,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (064,Adit,Sistem informasi,2021,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (065,Rhandy,Sistem informasi,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (066,Ajeng,Pendidikan Bahasa Inggris,2022,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (067,Aldy,Sistem informasi,2023,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (068,Yolanda,Biologi,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (069,Audi,Sistem informasi,2022,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (070,Bion,Sistem informasi,2022,1,6 November 2023,10 November 2023);

INSERT INTO peminjaman_skripsi VALUES (071,Cella,Pendidikan Bahasa Inggris,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (072,Chanin,Sistem informasi,2023,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (073,Chelsy,Sistem informasi,2020,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (074,Deni,Sistem informasi,2022,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (075,Devina,Biologi,2021,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (076,Diajeng,Sistem informasi,2023,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (077,Dimas,Pendidikan Bahasa Inggris,2022,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (078,Evanka,Sistem informasi,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (079,Haidar,Sistem informasi,2022,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (080,Ima,Sistem informasi,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (081,Adjie,Pendidikan Bahasa Inggris,2021,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (082,Habib,Sastra Jerman,2022,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (083,Wildan,Sistem informasi,2020,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (084,Rangga,Sastra Jerman,2021,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (085,Fahmi,Sistem informasi,2023,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (086,Nadya,Sastra Jerman,2020,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (087,Niken,Sistem informasi,2021,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (088,Nia,Sistem informasi,2022,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (089,Isnaini,Sistem informasi,2023,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (090,Amalia,Sastra Jerman,2020,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (091,Mitha,Sistem informasi,2022,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (092,Rafi,Sastra Jerman,2021,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (093,Rafli,Sistem informasi,2020,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (094,Reza,Sistem informasi,2022,1,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (095,Rara,Sastra Jerman,2023,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (096,Salma,Sistem informasi,2022,2,13 November 2023,17 November 2023);

INSERT INTO peminjaman_skripsi VALUES (097,Nadhira,Sastra Jerman,2021,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (098,Syahrul,Sistem informasi,2023,2,9 Oktober 2023,13 Oktober 2023);

INSERT INTO peminjaman_skripsi VALUES (099,Tanty,Sastra Jerman,2020,3,13 November 2023,20 November 2023);

INSERT INTO peminjaman_skripsi VALUES (100,Arimbie,Sistem informasi,2021,1,13 November 2023,15 November 2023);

INSERT INTO peminjaman_skripsi VALUES (101,Emmy,Sistem informasi,2022,2,13 November 2023,17 November 2023);

# PREVIEW

# MENU LOGIN
![Screenshot 2023-11-19 215526](https://github.com/reds0109/PBO-2023/assets/148847358/7db27a0a-6499-411b-8996-d194baf1aaa8)

# MENU DASHBOARD
![Screenshot 2023-11-27 012233](https://github.com/reds0109/PBO-2023/assets/148847358/5da9e775-f5b1-452c-91e2-3febe3050af0)

# MENU DATA BUKU
![Screenshot 2023-12-04 073546](https://github.com/reds0109/PBO-2023/assets/148847358/cb1d407e-16d6-4e13-a4cb-f79a504f28e0)

# MENU DATA SKRIPSI
![Screenshot 2023-12-04 073819](https://github.com/reds0109/PBO-2023/assets/148847358/db57810b-81fa-4b2a-aded-efc997dfd698)

# MENU LAPORAN DATA BUKU
![Screenshot 2023-12-04 073905](https://github.com/reds0109/PBO-2023/assets/148847358/7dfca469-35c7-4f53-a1de-d01c9c0a0f60)

![Screenshot 2023-12-04 075208](https://github.com/reds0109/PBO-2023/assets/148847358/f071f76b-c400-4a24-ba11-9a2b04b36dd0)

# MENU LAPORAN DATA SKRIPSI
![Screenshot 2023-12-04 074230](https://github.com/reds0109/PBO-2023/assets/148847358/29721b59-cee3-4d14-815a-6859da574cfe)

![Screenshot 2023-12-04 075403](https://github.com/reds0109/PBO-2023/assets/148847358/71f39d84-ee9e-49f7-b561-59f56c4f64a9)

# MENU PEMINJAMAN BUKU
![Screenshot 2023-12-04 074343](https://github.com/reds0109/PBO-2023/assets/148847358/b93c5633-87aa-42e1-89a2-c752c51386f5)

# MENU PEMINJAMAN SKRIPSI
![Screenshot 2023-12-04 074559](https://github.com/reds0109/PBO-2023/assets/148847358/f3bb070f-9c0d-49a5-a1cc-371334dfd505)

# MENU LAPORAN PEMINJAMAN BUKU
![Screenshot 2023-12-04 074649](https://github.com/reds0109/PBO-2023/assets/148847358/e66c14ae-57dd-4a74-9205-833f4829ced4)

![Screenshot 2023-12-04 075550](https://github.com/reds0109/PBO-2023/assets/148847358/3f9d6757-5f2e-4f68-8e72-34ea7e7f1b22)

# MENU LAPORAN PEMINJAMAN SKRIPSI
![Screenshot 2023-12-04 074728](https://github.com/reds0109/PBO-2023/assets/148847358/cdbd16f8-5adf-4ba6-b494-3e4756454b95)

![Screenshot 2023-12-04 075645](https://github.com/reds0109/PBO-2023/assets/148847358/81e3a3fa-9c28-4efd-9ce9-d23153bfda57)
