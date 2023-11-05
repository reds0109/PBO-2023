# Public, Private, Protected
Public : Variabel yang dideklarasikan sebagai public dapat diakses dari mana saja baik 
dalam kelas yang sama, dalam package yang sama, maupun dari package yang 
berbeda.

Private : Variabel yang dideklarasikan sebagai protected hanya dapat diakses oleh 
kelas itu sendiri, dari kelas-kelas dalam package yang sama atau oleh subclass (kelas 
turunan) yang meng-extend kelas tersebut baik dalam package yang sama maupun 
dalam package yang berbeda. Protected tujuannya untuk diwariskan kepada 
turunannya.

Protected : Variabel yang dideklarasikan sebagai private hanya dapat diakses di dalam 
kelas itu sendiri. Private tidak dapat diakses dari kelas lain, bahkan jika kelas tersebut 
adalah subclass maupun berada dalam package yang sama.

# Tahapan-tahapan
1. Pertama, buka aplikasi netbeans. Setelah itu buat project baru dengan klik menu FILE di pojok kiri atas 
kemudian pilih NEW PROJECT. Setelahnya beri nama new project dengan nama PBOAssignment lalu klik finish.
2. Selanjutnya buat class pada package “pboassignment” dengan nama “MakhlukHidup”.
3. Pada class “MakhlukHidup” tambahkan atribut-atribut seperti nama, 
namaLatin, kingdom, ordo, family, jenisDaun, tulangDaun, jenisBatang, 
jenisAkar, bentukBiji, cadanganMakanan, jenisBunga. Tambahkan juga method 
seperti bergerak dan berkembangbiak.
4. Agar atribut tadi bisa dipanggil maka harus direfactor dengan klik kanan pada 
atribut lalu klik “refactor” lalu klik “encapsulate fields…” dan pilih select all. 
Untuk method tidak perlu, karena sudah ada return.
5. Setelah direfactor, maka atribut otomatis akan berubah dari public ke private. Untuk method tetap seperti sebelumnya.
6. Lalu buat new class dengan nama “Tumbuhan”. Kemudian pada pilihan superclass kita ketik MakhlukHidup yang ada di package pboassignment. Maka 
class “Tumbuhan menjadi turunan dari class “MakhlukHidup”.
7.  Selanjutnya buat new class dengan nama “Mangga”. Main pada class “MakhlukHidup” sebelumnya dipindah ke class “Mangga” 
karena main yang ada di class ini yang akan dijalankan saat program dijalankan. Main pada class “Mangga” ini merupakan titik awal eksekusi program.
8. Pada class “Mangga” akan dituliskan isi atau set dari atribut atau variabel yang ada pada Class MakhlukHidup seperti pada gambar dibawah ini. Untuk method 
langsung ditulis variabelnya.
9. Selanjutnya program bisa di run. Walaupun variabel menggunakan privat, masih bisa diakses dengan 
menggunakan get dan set untuk memanggilnya. Untuk method yang menggunakan protected juga bisa diakses karena sebelumnya class Tumbuhan 
sudah diextend dengan class “MakhlukHidup”, selain itu class “MakhlukHidup”, 
“Tumbuhan”, dan “Mangga” berada dalam satu package yang sama.
