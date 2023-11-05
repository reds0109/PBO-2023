# Jawaban UTS PBO
1. Interface adalah sekumpulan metode yang dideklarasikan tanpa implementasi. Semua 
metode dalam interface secara otomatis bersifat publik dan abstrak (tidak memiliki 
implementasi). Setiap kelas yang mengimplementasikan sebuah interface harus 
menyediakan implementasi lengkap untuk semua metode dalam interface tersebut.
Interface mendukung multiple inheritance, yang berarti sebuah kelas dapat 
mengimplementasikan beberapa interface sekaligus. Ini memungkinkan untuk 
menggabungkan fungsionalitas dari beberapa sumber yang berbeda. Interface tidak
dapat memiliki konstruktor. Interface hanya berisi deklarasi metode.
Class abstract adalah kelas yang dapat memiliki metode abstrak (tanpa implementasi) 
dan metode konkret (dengan implementasi). Class abstract dapat berisi campuran 
metode abstrak dan metode konkret, dan subclass yang meng-extend class abstract 
harus mengimplementasikan semua metode abstrak dari class abstract tersebut. Java 
tidak mendukung multiple inheritance dari class, sehingga sebuah class abstract hanya 
dapat memiliki satu class parent (superclass) namun dapat mengimplementasikan 
beberapa interface. Class abstract dapat memiliki konstruktor, dan konstruktor ini 
dapat digunakan oleh subclass untuk menginisialisasi objek.
2. Method Overload : menggunakan jumlah atau tipe parameter input yang berbeda pada 
method dengan nama sama dalam satu kelas.
Method Override : mengimplementasikan method yang memiliki nama sama secara 
berbeda pada kelas turunan.
3. Public : Variabel yang dideklarasikan sebagai public dapat diakses dari mana saja baik 
dalam kelas yang sama, dalam package yang sama, maupun dari package yang 
berbeda.
Protected : Variabel yang dideklarasikan sebagai protected hanya dapat diakses oleh 
kelas itu sendiri, dari kelas-kelas dalam package yang sama atau oleh subclass (kelas 
turunan) yang meng-extend kelas tersebut baik dalam package yang sama maupun 
dalam package yang berbeda. Protected tujuannya untuk diwariskan kepada 
turunannya. Protected digunakan untuk memberikan akses yang lebih terbatas daripada 
public, tetapi masih memungkinkan untuk diakses oleh turunan kelasnya.
Private : Variabel yang dideklarasikan sebagai private hanya dapat diakses di dalam 
kelas itu sendiri. Private tidak dapat diakses dari kelas lain, bahkan jika kelas tersebut 
adalah subclass maupun berada dalam package yang sama.
4. Keyword static adalah salah satu kata kunci dalam pemrograman Java yang 
digunakan untuk menghubungkan variabel atau metode yang terkait dengan kelas, 
bukan dengan instance dari kelas tersebut. Hal ini memungkinkan penggunaan variabel 
dan metode tanpa harus membuat objek kelas terlebih dahulu, dan juga memungkinkan 
berbagi data antara objek-objek dari kelas yang sama. Ketika sebuah variabel 
dideklarasikan sebagai static dalam sebuah kelas, variabel tersebut menjadi milik kelas 
itu sendiri, bukan milik objek atau instance dari kelas tersebut. Variabel statis biasanya 
digunakan untuk menyimpan data yang sama untuk semua instance dari kelas. Ketika 
sebuah metode dideklarasikan sebagai static, metode tersebut terkait dengan kelas dan 
bukan dengan instance dari kelas tersebut. Artinya, Anda dapat memanggil metode 
statis tanpa harus membuat objek dari kelas tersebut. Metode statis sering digunakan 
untuk tugas-tugas yang terkait dengan kelas secara keseluruhan dan tidak bergantung 
pada data instance.
5. Double merupakan tipe data lanjutan. Double adalah kelas bawaan (wrapper class) 
yang menyediakan wadah untuk nilai double primitif. Ini adalah bagian dari Java's 
class library dan digunakan untuk mengizinkan tipe data primitive double sebagai 
objek. Double memiliki metode dan fitur tambahan yang tidak dimiliki oleh tipe data 
primitive double. Anda dapat menggunakan Double untuk melakukan operasi dan 
manipulasi lebih lanjut dengan nilai double.
double merupakan tipe data primitif dalam Java yang digunakan untuk menyimpan 
bilangan desimal dengan presisi floating-point. Tipe data ini bersifat case sensitive 
(bedakan huruf besar dan kecil). Nilai double adalah representasi angka desimal, 
seperti 3.14 atau 0.5, dan digunakan untuk perhitungan matematis.
