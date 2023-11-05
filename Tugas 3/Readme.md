# Interface
Interface adalah sekumpulan metode yang dideklarasikan tanpa implementasi. Semua 
metode dalam interface secara otomatis bersifat publik dan abstrak (tidak memiliki 
implementasi). Setiap kelas yang mengimplementasikan sebuah interface harus 
menyediakan implementasi lengkap untuk semua metode dalam interface tersebut.
Interface mendukung multiple inheritance, yang berarti sebuah kelas dapat 
mengimplementasikan beberapa interface sekaligus. Ini memungkinkan untuk 
menggabungkan fungsionalitas dari beberapa sumber yang berbeda. Interface tidak
dapat memiliki konstruktor. Interface hanya berisi deklarasi metode.

# Tahapan-tahapan
1. Pertama, kita buka aplikasi netbeans. Buat project baru dengan klik menu file di pojok kiri atas kemudian 
pilih new project. Setelahnya, beri nama new project dengan nama PBOPertemuanTiga lalu klik finish.
2. Selanjutnya, buat class pada package “pbopertemuantiga” dengan nama “Orang”.
3.  Kemudian, buat package baru dengan nama “Utama”. Buat juga class pada 
package “Utama” dengan nama “JalanProgram”.
4. Main yang sebelumnya terdapat pada class “Orang” dipindah ke class 
“JalanProgram” karena main pada class “JalanProgram” ini yang akan dijalankan 
saat program dijalankan. Main pada class “JalanProgram” ini merupakan titik 
awal eksekusi program.
5. Pada class “Orang” kita tambahkan atribut-atribut seperti jenisMakanan, 
jenisMinuman, jenisBaju dan domisili. Untuk domisili di set = “di planet bumi”. 
Atribut tadi direfactor dengan klik kanan pada atribut lalu klik “refactor” lalu klik 
“encapsulate fields…” dan pilih select all.
6.  Setelah itu, kita buat class baru dengan nama “OrangJawa”. Kemudian pada 
pilihan superclass kita ketik “Orang” yang ada di package “pbopertemuantiga” 
lalu klik finish. Hal ini dilakukan agar class “OrangJawa” bisa extend dengan 
class “Orang”.
7. Setelah itu, kita buat class baru dengan nama “OrangBetawi”. Kemudian pada 
pilihan superclass kita ketik “Orang” yang ada di package “pbopertemuantiga” 
lalu klik finish. Hal ini dilakukan agar class “OrangBetawi” bisa extend dengan 
class “Orang”.
8. Setelah itu, kita buat class baru dengan nama “OrangSunda”. Kemudian pada 
pilihan superclass kita ketik “Orang” yang ada di package “pbopertemuantiga” 
lalu klik finish. Hal ini dilakukan agar class “OrangSunda” bisa extend dengan 
class “Orang”.
9. Selanjutnya yaitu “method overload”. Method overload menggunakan jumlah 
atau tipe parameter input yang berbeda pada method dengan nama sama dalam 
satu kelas. Dibawah ini merupakan method overload yang ada di class “Orang”.
10. Selanjutnya yaitu “Method Override”. Method override mengimplementasikan 
method yang memiliki nama sama secara berbeda pada kelas turunan. Dibawah 
ini merupakan method override pada class “OrangJawa”. Diimplementasikan 
secara berbeda.
11. Selanjutnya kita buat new class dengan nama “Herbivora”. Kemudian pada 
pilihan superclass kita ketik Hewan yang ada di package “pbotugas” lalu klik 
finish. Hal ini dilakukan agar class “Herbivora” bisa extend dengan class 
“Hewan”.
12. Pada class “Herbivora” kita beri atribut yaitu herbivora dengan tipe data Boolean 
dan juga constructor yang terdiri dari jenisMakanan, jumlahKaki, dan herbivora. 
Atribut yang ada pada class ini juga sebelumnya telah direfactor.
13. Lalu kita buat lagi new class dengan nama “Karnivora”. Kemudian pada pilihan 
superclass kita ketik Hewan yang ada di package “pbotugas” lalu klik finish. Hal 
ini dilakukan agar class “Karnivora” bisa extend dengan class “Hewan”. Pada 
class ini kita beri atribut yaitu karnivora dengan tipe data Boolean dan juga 
constructor yang terdiri dari jenisMakanan, jumlahKaki, dan karnivora. Atribut 
yang ada pada class ini juga sebelumnya telah direfactor.
14. Selanjutnya pada class “KelasMain” kita bisa memanggil semua variabel
menggunakan set dan get. Untuk menampilkan output dengan menggunakan 
System.out.println().
15. Setelah itu project bisa di run.
