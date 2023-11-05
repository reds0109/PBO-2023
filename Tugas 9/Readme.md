# Persistence
Dalam pemrograman berorientasi objek (OOP), "persistence" merujuk pada kemampuan objek untuk mempertahankan keadaan 
atau data mereka melalui berbagai siklus hidup program, termasuk saat program dimatikan atau direstart. 

# Tahapan-tahapan
1. Pertama, kita buka aplikasi pgAdmin. Setelah itu, buat database baru dengan 
nama “PBO_Pertemuan9”. Lalu buat table dengan nama “buku” yang 
memiliki field diantaranya yaitu ISBN, Judul Buku, Tahun Terbit, dan 
Penerbit.
2. Buka aplikasi netbeans, pada services, pilih driver. Lalu, klik kanan pada 
PostgreSQL dan pilih Connect Using. Ubah port sesuai port masing-masing. 
Lalu ubah database sesuai nama database yang sebelumnya telah dibuat. Maka 
database sudah terhubung seperti gambar dibawah ini.
3. Lalu buat project baru dengan nama “PBO_Pertemuan9”. Lalu buat class 
dengan nama “BukuPOJO”. Lalu pada class “BukuPOJO”, beri atribut sesuai 
nama field pada table Buku yang telah kita buat sebelumnya. Atribut ini kita 
encapsulate field.
4. Lalu buat JFrame form dengan nama “TampilanGUI”. Buat seperti gambar 
dibawah ini.
5. Lalu buat new Entity Class from Database pada package “pbo_pertemuan9”.
6. Lalu pada Database Connection pilih nama database yang telah dibuat. Maka 
akan muncul tabel yang telah dibuat.
7. Setelahnya akan muncul seperti gambar dibawah ini. Maka nama 
persistencenya adalah “PBO_Pertemuan9PU”. Nama persistence ini akan 
digunakan dalam setiap button.
8. Lalu agar data bisa refresh otomatis source codenya seperti dibawah ini.
9. Selanjutnya, pada button simpan dengan persistence source codenya seperti 
dibawah ini.
10. Pada button update dengan persistence source codenya seperti dibawah ini.
11. Pada button delete dengan persistence source codenya seperti dibawah ini.
12. Pada button cetak dengan persistence source codenya seperti dibawah ini.
13.  Lalu buat new report wizard “blank A4” dengan nama “reportP9”. Lalu 
desain “reportP9” seperti gambar dibawah ini. Tulisannya bisa diberi warna 
dan beri gambar juga agar lebih menarik.
14. Lalu insert kan data dan simpan. Lalu klik button cetak dan tampilan report seperti gambar dibawah ini.
