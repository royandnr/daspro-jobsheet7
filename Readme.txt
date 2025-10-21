Jawaban Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan FOR

1. a. inisialisai, (int i = 1) Bagian ini dijalankan sekali saat perulangan pertama dimulai Artinya: variabel i dibuat dan diisi nilai awal 1
   b. Kondisi, (i <= 10) perulangan akan terus berjalan selama i kurang dari atau sama dengan 10`. Jika kondisi salah, perulangan berhent
   c. increment/Update, (i++) setelah satu putaran perulangan selesai, i akan bertambah 1

2. kenapa tertinggi diinisialisasi 0, karena setiap nilai yang dimasukkan pasti lebih besar atau sama dengan 0 makanya diinisialisasi tertinggi 
   kenapa terendah diinisialisasi 100, karena setiap nilai mahasiswa biasanya kurang dari sama dengan 100 makanya diinisialisasi terendah
   yang terjadi jika variabel tertinggi diinisialisasi 100, maka yang terjadi adalah kita tidak bisa menginputkan nilai 1-100 karena nilai tersebut tidak lebih besar dari 100 jadi dianggap salah
   yang terjadi jika variabel terendah diinisialisasi 0, maka yang terjadi adalaha kita tidak bisa menginputkan nilai 1-100 karena nilai tersebut tidak lebih kecil dari 0 jadi dianggap salah

3.          if (nilai > tertinggi) {
                tertinggi = nilai;      = maksudnya untuk mengecek apakah nilai yang baru dimasukkan lebih besar dari nilai tertinggi saat ini, jika ya nilai tertinggi di update menjadi nilai tersebut 
            }                        
            if (nilai < terendah) {
                terendah = nilai;       = maksudnya untuk mengecek apakah nilai yang baru dimasukkan lebih kecil dari nilai terendah saat ini, jika ya nilai terendah di update menjadi nilai tersebut 
            }
