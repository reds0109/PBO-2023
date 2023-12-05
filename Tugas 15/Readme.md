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

# TABEL buku

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

# TABEL skripsi



# TABEL peminjaman_buku

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


# TABEL peminjaman_skripsi

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

# MENU DASHBOARD

# MENU DATA BUKU

# MENU DATA SKRIPSI

# MENU LAPORAN DATA BUKU

# MENU LAPORAN DATA SKRIPSI

# MENU PEMINJAMAN BUKU

# MENU PEMINJAMAN SKRIPSI

# MENU LAPORAN PEMINJAMAN BUKU

# MENU LAPORAN PEMINJAMAN SKRIPSI
