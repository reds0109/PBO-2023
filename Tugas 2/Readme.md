# Constructor
Constructor dalam PBO adalah metode khusus dalam sebuah kelas yang digunakan untuk menginisialisasi objek yang terbuat dari 
kelas tersebut. Constructor memiliki nama yang sama dengan nama kelas dan tidak memiliki tipe data balikan.

# Tahapan-tahapan
1. Buat diagram turunan Makhluk Hidup.
2. Buat project baru dengan klik menu file di pojok kiri atas kemudian pilih new project. Setelahnya beri nama new project dengan
nama PBOTugas lalu klik finish.
3. Selanjutnya buat class pada package “pbotugas” dengan nama “MakhlukHidup”.
4. Selanjutnya buat package baru dengan nama “KelasMain”. Main yang sebelumnya terdapat pada class “MakhlukHidup” dipindah ke
class “KelasMain” karena main pada class “KelasMain” ini yang akan dijalankan saat program dijalankan. Main pada class “KelasMain”
ini merupakan titik awal eksekusi program.
5. Pada class “MakhlukHidup” kita tambahkan atribut-atribut seperti nama, spesies, jenisMakanan, dan umur. Agar atribut tadi
bisa dipanggil maka harus direfactor dengan klik kanan pada atribut lalu klik “refactor” lalu klik “encapsulate 
fields…” dan pilih select all.
6. Setelah itu, kita buat constructor pada class “MakhlukHidup”. Constructor dalam 
PBO adalah metode khusus dalam sebuah kelas yang digunakan untuk menginisialisasi objek yang terbuat dari kelas tersebut.
Constructor memiliki nama yang sama dengan nama kelas dan tidak memiliki tipe data balikan. Pada 
class “MakhlukHidup” terdapat 3 constructor yaitu jenisMakanan tanpa dan 
dengan parameter, dan umur dengan parameter.
9. Lalu buat class baru pada package “pbotugas” dengan nama class “Hewan”. 
Kemudian pada pilihan superclass kita ketik MakhlukHidup yang ada di package 
“pbotugas” lalu klik finish. Hal ini dilakukan agar class “Hewan” bisa extend 
dengan class “MakhlukHidup”.
10. Penggunaan “this” dan “super” digunakan untuk merujuk pada object. “this”
digunakan untuk merujuk pada objek yang ada dalam kelas yang dimaksud. 
Sedangkan “super” digunakan untuk merujuk kepada superclass atau class induk 
dari kelas yang dimaksud. Pada class “Hewan” kita beri atribut yaitu jumlahKaki 
dan juga constructor yang terdiri dari jenisMakanan tanpa dan dengan parameter, 
dan jumlahKaki dengan parameter. Untuk atribut jumlahKaki sebelumnya juga 
direfactor.
11. Lalu kita buat class baru dengan nama “Tumbuhan”. Lalu pada pilihan 
superclass kita ketik MakhlukHidup yang ada di package “pbotugas” lalu klik 
finish. Hal ini dilakukan agar class “Tumbuhan” bisa extend dengan class 
“MakhlukHidup”.
12. Pada class “Tumbuhan” kita beri atribut yaitu dikotil dengan tipe data Boolean 
dan juga constructor yang terdiri dari jenisMakanan, umur, dan dikotil. Atribut 
yang ada pada class ini juga sebelumnya telah direfactor.
13. Selanjutnya kita buat new class dengan nama “Herbivora”. Kemudian pada 
pilihan superclass kita ketik Hewan yang ada di package “pbotugas” lalu klik 
finish. Hal ini dilakukan agar class “Herbivora” bisa extend dengan class 
“Hewan”.
14. Pada class “Herbivora” kita beri atribut yaitu herbivora dengan tipe data Boolean 
dan juga constructor yang terdiri dari jenisMakanan, jumlahKaki, dan herbivora. 
Atribut yang ada pada class ini juga sebelumnya telah direfactor.
15. Lalu kita buat lagi new class dengan nama “Karnivora”. Kemudian pada pilihan 
superclass kita ketik Hewan yang ada di package “pbotugas” lalu klik finish. Hal 
ini dilakukan agar class “Karnivora” bisa extend dengan class “Hewan”. Pada 
class ini kita beri atribut yaitu karnivora dengan tipe data Boolean dan juga 
constructor yang terdiri dari jenisMakanan, jumlahKaki, dan karnivora. Atribut 
yang ada pada class ini juga sebelumnya telah direfactor.
16. Selanjutnya pada class “KelasMain” kita bisa memanggil semua variabel 
menggunakan set dan get. Untuk menampilkan output dengan menggunakan 
System.out.println().
17. Sebelum di run, klik kanan pada project kita lalu pilih clean and build. 
Setelahnya program sudah bisa di run.
